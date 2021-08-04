package PrototypePattern;

import java.util.List;

/*
 * 1. �ϥ�prototype�i�H�Ҽ{�ۤv�Q�Ϊ��s���O�`�����٬O�L����
 * 2. �i�H�Φb�s�u�귽�BIO�귽�B�άO�q��Ʈw�Ӫ���ƶi�����
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
