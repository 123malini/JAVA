package homework;

public class Subclass extends ParentClass {
	 void display(){
		 System.out.println("Child class method");
		    }
	 void printMsg(){
		 display();
		
	 }

public static void main(String args[]){
Subclass obj= new Subclass();
obj.printMsg(); 
}
}
	

