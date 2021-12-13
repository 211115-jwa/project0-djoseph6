import io.javalin.Javalin;

public class CarDealerApp {

	public static void main(String[] args) {
		
		Javalin app = Javalin.create();
		
		app.start();

		app.routes(() -> {
			path("/CarDealer", () -> {
				get(ctx -> {
					
				}
			});
			
			
			
			
			
			
		});
		

		}
}