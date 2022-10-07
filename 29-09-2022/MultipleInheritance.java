//program: ques4 this is multiple inheritance because we are inheriting more than one interface.

class parent{
    parent(){
        System.out.println("this is constructor");
    }
	public void sing()
		{
		    System.out.println("singing");
		}
}
    
	 class child extends  parent
	 {
	    
		public void speak() {
			System.out.println("speaking");
		}
		public void dance()
		{
			System.out.println("dancing");
		}
    }
	
	 
public class  Multipleinheritance{

public static void main(String [] args) {
        
	child ch = new child();
	ch.sing();
	ch.speak();
    ch.dance();        
	
}
}