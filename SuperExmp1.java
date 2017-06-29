package constructor;

public class SuperExmp1 extends SuperExmp {
	float salary;
 SuperExmp1(int id, String name,float salary) {
		super(id, name);
		// TODO Auto-generated constructor stub
		
		this.salary=salary;
	}
 void print(){
	 System.out.println(id+"  "+name+"  "+salary);
 }
}
