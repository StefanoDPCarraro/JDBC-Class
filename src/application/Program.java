package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {

		Department dep = new Department(1, "Books");

		SellerDao sellerDao = DaoFactory.createSellerDao();

		Seller seller = sellerDao.findById(2);

		sellerDao.deleteById(2);

		System.out.println(sellerDao.findAll());
	}
}
