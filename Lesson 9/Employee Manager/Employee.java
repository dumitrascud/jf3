public class Employee {


	//nume, prenume, varsta, functia
	String name;
	String surname;
	String position;
	byte age;

	// work, drinkCofee, present results, gain salary

    //public void work(int a,int b, int c, int d)
	public void work(){
		System.out.println ("Employee: working...");
	}
public static void main (String [] args){
	Employee emp = new Employee();
	emp.name = "Ion";
	emp.surname = "Mocanu";
	emp.position = "Teu MGR";
	emp.age = 19;
	
	System.out.print(emp.name);
	System.out.print(emp.surname);
	System.out.print(emp.age);
	
	//emp.work(1,2,3,4);
	emp.work();
}


}
