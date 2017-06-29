package constructor;

public class ConsDemo {

	int id;
	String name;
	ConsDemo(int i, String n){
		id=i;
		name=n;
		}
	void show(){
		System.out.println("my id is"+id+"and my name is"+name);
	}
	int number;
	ConsDemo(int y){
		number=y;
		
	}
	void print(){
		System.out.println("my number is"+number);
	}
	public static void main(String args[]){
		ConsDemo m=new ConsDemo(11,"helli mam");
		ConsDemo m1=new ConsDemo(1234567890);
		m.show();
		m1.print();
	}
}
