package Assesment;
class  Member
{
    String name;
	int age;
	String number;
	String address;
	int salary;
	
	public void printSalary() {
		System.out.println(salary);
	}
}
class Employee extends Member{
	String specialization;
}


class Manager extends Member() {
	String Department;
}
public class Ofc{
	public static void main (String [] args) {
	Employee e = new Employee();
	e.name = "Lakshmi";
	e.age = 23;
	e.number = "9868756432";
	e.address = "xyzxyz";
	e.salary = 30000;
	e.specialization = "xyzxyz";
	
	Manager m = new Manager();
	m.name ="Arun";
	e.age = 40;
	e.number ="9856754327";
	e.address = "adcd";
	e.salary = 50000;
}
}


	