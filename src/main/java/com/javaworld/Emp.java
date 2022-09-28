package com.javaworld;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emp {

	private Integer empid;
	private String name;
	private Double salary;
	
	
	public Emp(Integer empid, String name, Double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		List<Emp> empList=Arrays.asList(new Emp(1, "ABC", 10000.00)
				,new Emp(2, "XYZ", 30000.00),
				new Emp(3, "LMN", 25000.00));
		
		
	    //	empList.stream(). sorted(Comparator.comparingDouble(Emp::getSalary).
		//  reversed()).collect(Collectors.toList()).forEach(System.out::println);
		 
		//  empList.stream().sorted(Comparator.comparingDouble(Emp::getSalary)).collect(
		//  Collectors.toList()).forEach(System.out::println);
		 
		
	//	Comparator<Emp> sortByName = (e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName());
		
    //	Comparator<Emp> sortBySalary=(e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary());
		
	//	empList.stream().sorted(sortByName.thenComparing(sortBySalary)).forEach(System.out::println);
		
	//Optional<Emp> maxSal=	empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary)));
	//	System.out.println(maxSal);
	
	//	Optional<Emp> secondHighestSal=empList.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).skip(1).findFirst();
	//	System.out.println(secondHighestSal);
		                
	//	Optional<Emp> minSal=	empList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Emp::getSalary)));
	//		System.out.println(minSal);
		
		Map<Double, List<Emp>> map=empList.stream().filter(e->e.getSalary()>=10000 && e.getSalary()<=30000).collect(Collectors.groupingBy(Emp::getSalary));
		System.out.println(map);
	}
}
