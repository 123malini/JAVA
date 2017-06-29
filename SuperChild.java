package homework;

public class SuperChild extends SuperParent{
	 void display(){
		 System.out.println("Child class method");
		    }
		    void printMsg(){
		 
		 display();
		 
		 super.display();
		    }
		    public static void main(String args[]){
		 Subclass obj= new Subclass();
		 obj.printMsg(); 
		    }
		 }



