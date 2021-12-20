import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.path;
import static io.javalin.apibuilder.ApiBuilder.post;
import static io.javalin.apibuilder.ApiBuilder.put;

import java.util.Set;

import org.eclipse.jetty.http.HttpStatus;

import com.Revature.beans.Car;
import com.Revature.data.services.UserServiceImpl;
import com.Revature.services.UserSevice;


import io.javalin.Javalin;
import io.javalin.http.HttpCode;

public class CarDealerApp {
	private static UserSevice userServ = new UserServiceImpl();

	public static void main(String[] args) {
		Javalin app = Javalin.create();
		
		app.start();
		
		app.routes(() -> {
			// localhost:8080/pets
			
			path("/CarDealer", () -> {
				
				get(ctx -> {
					// checking if they did /pets?species=
					String makeSearch = ctx.queryParam("make");
					String modelSearch = ctx.queryParam("model");
					// when using .equals with a String literal, put the
					// String literal first because it prevents null pointer
					// exceptions
					if (makeSearch != null && !"".equals(makeSearch)) {
						Set<Car> carsByMake = userServ.viewAllCarsByMake(makeSearch);
						ctx.json(carsByMake);
					}
					if(modelSearch != null && !"".equals(modelSearch)) {
						Set<Car> carsByModel = userServ.viewAllCarsByModel(modelSearch);
						ctx.json(carsByModel);
					} 
					else {
						// if they didn't put ?species
						Set<Car> availableCars = userServ.viewAllAvailableCars();
						ctx.json(availableCars);
					}
				});
				
				post(ctx -> {
					// bodyAsClass turns JSON into a Java object based on the class you specify
					Car newCarToAdd = ctx.bodyAsClass(Car.class);
					if (newCarToAdd !=null) {
						userServ.addNewCar(newCarToAdd);
						ctx.status(HttpStatus.CREATED_201);
					} else {
						ctx.status(HttpStatus.BAD_REQUEST_400);
					}
				});
			});
		
			path("/CarDealer/{id}", () -> {
				
				get(ctx -> {
					try {
						
						int carId = Integer.parseInt(ctx.pathParam("id")); // num format exception
						Car carToViewById = userServ.viewCarById(carId);
						if (carToViewById != null)
							ctx.json(carToViewById);
						else
							ctx.status(404);
					} catch (NumberFormatException e) {
						ctx.status(400);
						ctx.result("Car ID must be a numeric value");
					}
				});
				
				put(ctx -> {
					try {
						int carId = Integer.parseInt(ctx.pathParam("id")); // num format exception
						Car updatedCar = ctx.bodyAsClass(Car.class);
						if (updatedCar != null && updatedCar.getId() == carId) {
							updatedCar = userServ.updateCarById(updatedCar, carId);
							if (updatedCar != null)
								ctx.json(updatedCar);
							else
								ctx.status(404);
						} else {
							// conflict: the id doesn't match the id of the pet sent
							ctx.status(HttpCode.CONFLICT);
						}
					} catch (NumberFormatException e) {
						ctx.status(400);
						ctx.result("Pet ID must be a numeric value");
					}
				});
				
			});
		});
				
	}		
}
