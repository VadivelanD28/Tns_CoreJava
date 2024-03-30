
package Myproject;

public class Firstproject {

    
	public Firstproject(int i, String string, String string2, int j, int k) {
		
	}

	public static void main(String[] args) {
        // Create an Employee object
        Firstproject employee = new Firstproject (101, "vadivelan", "Manager", 1234567890, 500000);

        // Output employee information
        System.out.println("Employee ID: " + employee.getEmpId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Mobile Number: " + employee.getMobileNumber());
        System.out.println("Salary: " + employee.getSalary());

        // Modify employee information
        employee.setName("Jane Smith");
        employee.setSalary(55000);

       /* // Output modified information
        System.out.println("\nModified Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());*/
    }

	private void setSalary(double d) {
		
		
	}

	private void setName(String string) {
		
		
	}

	private String getSalary() {
		
		return null;
	}

	private String getMobileNumber() {
		
		return null;
	}

	private String getDesignation() {
		
		return null;
	}

	private String getName() {
		
		return null;
	}

	private String getEmpId() {
		
		return null;
	}
}
