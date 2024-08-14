package Examples;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private int age;
	private String gender;
	private String Department;
	
	public Employee(int id, String name, float salary,int age,String gender,String Department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age=age;
		this.gender=gender;
		this.Department=Department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", gender=" + gender
				+ ", Department=" + Department + "]";
	}
	
	

}
