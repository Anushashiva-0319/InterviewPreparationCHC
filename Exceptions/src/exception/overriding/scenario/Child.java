package exception.overriding.scenario;

import java.io.IOException;

 class Parent  {
	
	void add () throws Exception{
		System.out.println("Exception is parent of all Exceptions");
	}

}
 // if you give higherpriority of exception in child class it give compile time Error
 // this rule applicable for only  Checked Exception 
 // in Unchecked Exception it works all scenarios
 // if we declare same (Exception)  or below Exception(IOException) in child class  or NO EXception in child also OK
class Child extends Parent{
	void add () throws IOException{
		System.out.println("IOException is child of Exception  ");
	}
	public static void main(String[] args) throws IOException {
		Child c =new Child();
		c.add();
	}
}
