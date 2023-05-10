package week1.day4;

public class Employee {
	public void employeeName(String Name) {
		System.out.println("Name: +name");
	}
	public void employeeAddress(String address) {
		System.out.println("Address: +address");
	}
	public void employeeId(int a) {
		System.out.println("employeeId:" +a);
	}
	public void employeeSalary(double b) {
		System.out.println("employee salary:"+b);
	}
	public void employeeMobileNumber(long c) {
		System.out.println("Employee contact:"+c);
	}
	public static void main(String[] args) {
		Employee biodata =new Employee();
		biodata.employeeName("Yoga");
		biodata.employeeAddress("kanchipuram");
		biodata.employeeId(112106031);
		biodata.employeeSalary(45000.00);
		biodata.employeeMobileNumber(8778664535L);
	}
}