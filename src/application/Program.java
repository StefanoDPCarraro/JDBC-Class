package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {

		Department dep = new Department(1, "Books");

		SellerDao sellerDao = DaoFactory.createSellerDao();

		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new java.util.Date(), 4000.0, dep);

		sellerDao.insert(newSeller);

		System.out.println("Inserted! New id = " + newSeller.getId());
		
	}
}
