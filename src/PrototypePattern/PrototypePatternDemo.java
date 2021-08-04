package PrototypePattern;

import java.util.List;

/*
 * 1. 使用prototype可以考慮自己想用的究竟是深拷貝還是淺拷貝
 * 2. 可以用在連線資源、IO資源、或是從資料庫來的資料進行拷貝
 */
public class PrototypePatternDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();

		// Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");

		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}

}
