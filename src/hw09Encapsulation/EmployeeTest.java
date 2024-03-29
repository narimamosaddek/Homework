package hw09Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpName("NARIMA");
		employee.setEmpAge(100);
		employee.setEmpSex('F');
		employee.setEmpCitizen(true);

		System.out.println("Employee Name :" + employee.getEmpName() + "\nEmployee Age :" + employee.getEmpAge()
				+ "\nEmployee Sex :" + employee.getEmpSex() + "\nEmployee Citizen ?" + employee.isEmpCitizen());

		
	}

}
