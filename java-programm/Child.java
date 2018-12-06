
public class Child extends Parent {    
    {
        System.out.println("Child initialisation block");
    }
    static {
        System.out.println("Child static block 11");
		
		 xyz = "aaaa";
    }
	 static {
        System.out.println("Child static block 22");
    }

    public Child() {
				        System.out.println(xyz);

        System.out.println("Child Constructor");

    }    
    public static void main(String[] args) {
           
				//Child p = (Child) (new Parent()); // wrong;
				
				
			Child c = new Child();
		
    }
}