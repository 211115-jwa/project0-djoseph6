package com.Revature.data;

import java.util.Set;

	public interface GenericDAO<D> {
		// accessing the database should use CRUD operations:
		// create, read, update, delete
		public int create(D dataToAdd);
		public D getById(int id);
		public Set<D> getAll();
		public void update(D dataToUpdate);
		public void delete(D dataToDelete);
}
