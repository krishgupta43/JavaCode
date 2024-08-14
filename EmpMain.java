package Examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpMain {
    public static void main(String[] args) {
		List<Employee> li= new ArrayList<>();
		li.add(new Employee(1,"krishna",5000.0f,34,"Male","HR"));
		li.add(new Employee(5,"Arti",10000.8f,34,"Female","Account"));
		li.add(new Employee(4,"mohan",4500.65f,34,"Male","Businees"));
		li.add(new Employee(3, "Salonali", 43450,34,"Female","HR"));
		
		
		
		//Get all the department Name 
		li.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		//print name of distinct employee
		li.stream().map(Employee:: getName).distinct().forEach(System.out::println);
		
		//Average salary of employee
		double res=li.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("Avaregae Salary :" +res);
		
		//Average age of Mail and Female
		System.out.println(li.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge))));
		
		
		//Get the details of highest paid employee in the organization?
        Optional<Employee> emp=li.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(emp);

//		li.stream().filter(x->x.getSalary()<5000? 	throw new CustomException("invalid slaery"): "current Salary");
//		
//		li.stream().forEach(x->{
//			if(x.getSalary()<5000) {
//				throw CustomException("invalid age");
//			}
//			else {
//				return "validsalary":
//			}
//		});
        
        Map<String, Long>mp=li.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(mp);
        
        Set<Entry<String, Long>> entrySet = mp.entrySet();
//        for (Entry<String, Long> entry : entrySet)
//        {
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
        
     //Average salary of each department
     Map<String, Double> avgSalaryOfDepartments=
             li.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
     System.out.println(avgSalaryOfDepartments);
	}
}
