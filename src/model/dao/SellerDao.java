package model.dao;

import java.util.List;

import model.entity.Department;
import model.entity.Seller;

public interface SellerDao {
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findBySeller(Integer id);
	List<Seller> fintAll();
	List<Seller> findByDepartment(Department department);
}
