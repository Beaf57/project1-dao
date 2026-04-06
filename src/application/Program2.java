package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entity.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1 department findById =====");
		int id = 2;
		Department obj = departmentDao.findById(id);
		System.out.println(obj);

		System.out.println("\n=== TEST 2 department findAll =====");
		List<Department> list2 = departmentDao.findAll();
		for(Department obj2 : list2) {
			System.out.println(obj2);
		}
	}

}
