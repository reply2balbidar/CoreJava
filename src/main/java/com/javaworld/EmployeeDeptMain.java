package com.javaworld;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDeptMain {

	public static void main(String[] args) {

		Department account = new Department(75,"Account"); 
	      Department hr = new Department(50, "HR");
	      Department ops = new Department(25, "OP");
	      Department tech = new Department(150, "Tech");          
	   
	      List<Employee> employeeList = Arrays.asList(new  Employee(1,"David", 32, "Matara", account), 
	                           new  Employee(2,"Brayan", 25, "Galle", hr),
	                           new  Employee(3,"JoAnne", 45, "Negombo", ops),
	                           new  Employee(4, "Jake", 65, "Galle", hr),
	                           new  Employee(5,"Brent", 55, "Matara", hr),
	                           new  Employee(6,"Allice", 23, "Matara", ops),
	                           new  Employee(7,"Austin", 30, "Negombo", tech),
	                           new  Employee(11,"Gerry", 29, "Matara", tech),
	                           new  Employee(12,"Scote", 20, "Negombo", ops),
	                           new  Employee(13,"Branden", 32, "Matara", account),
	                           new  Employee(14,"Iflias", 31, "Galle", hr));
	      
	      /* Find all employees who lives in ‘Matara’ city */
	     
	      employeeList.stream().filter(e->e.getCity().equalsIgnoreCase("Matara"))
	    		  .sorted(Comparator.comparing(Employee::getEmpname))
	    		  .forEach(System.out::println);
	      
	      /* Find distinct department names that employees work for */
	      
	      employeeList.stream().map(e->e.getDepartment().getName())
	                           .distinct()
	                           .forEach(System.out::println);
	      
	      String s=employeeList.stream()
	    		  .map(e->e.getDepartment().getName())
	    		  .distinct()
	    		  .reduce("", (a,b)-> (a +"," +b));
	      System.out.println(s);
	      
	      /* Are there any employees from HR Department? */
	      
	     boolean b= employeeList.stream()
	      .anyMatch(e->e.getDepartment().getName().equalsIgnoreCase("HR"));
	     System.out.println(b);

	     /* Print all employee’s name who are working for account department */
	
	     employeeList.stream()
	                 .filter(e-> e.getDepartment().getName().equalsIgnoreCase("ACCOUNT"))
	                 .map(Employee::getEmpname)
	                 .forEach(System.out::println);
	     Map<String, Long> map=employeeList.stream()
	    		                            .collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));
	     System.out.println(map);
	     Map<String, List<Employee>> map1=employeeList.stream()
                 .collect(Collectors.groupingBy(Employee::getCity));
	     System.out.println(map1);
	    		                            
	    		                          
}

}
