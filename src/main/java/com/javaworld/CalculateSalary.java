package com.javaworld;

import java.util.Arrays;
import java.util.List;

public class CalculateSalary {

	public static void main(String[] args) {

		List<Product> pList=Arrays.asList(new Product(111, "AAA", 20000.00),
				new Product(222, "XYZ", 30000),
				new Product(333, "LMN", 40000.00),
				new Product(444, "PQR", 35000));
		double d=pList.stream().mapToDouble(Product::getPrice).sum();
   System.out.println(d);
	}

}
