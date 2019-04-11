class Core
{
    // Execution sequence of static 
    // 1. static variable
    // 2. Static block
    // 3. Intance block
    // 4. Constructor
    // 5. static method
    // what if you want to call static method before static block - > create sttaic varible and assign method to that varible


    // we can not override static method, we can overload stattic method
    static int num;
    static Object obj; // for the Intance variable not need to initialize variable but when it comes to local varible must need to initialize varible at the time of declaration.

    static String str = getStringData();
    int a;
    
    static
     {
         int z = 0; // by default variable considered as static even if it is not defined using static keyword  and must initalize local variable of static block scope is limited to block outside static block we can not acces it
        System.out.println("I am in static block :" + num + " : " + z);
    }

    {
        System.out.println("I am in block");
    }

    public static void getData()
    {
        System.out.println("I am in getdata" + num);
    }

    public static String getStringData()
    {
        System.out.println("Value Retrived..!!");
        return "I am a string";
    }
 

    // public static void main(String[] args)
    // {

    //     Core c = new Core();
    //             getData();


    // }

    static{
        System.out.println("I am in static block 2" + ++num);
    }

    {
        System.out.println("I am in block 2");
    }

  
}

class Julie extends Core
{
    static {
    
        num++;
        System.out.println("I am in julie static block : " + num);
    }

    {
        System.out.println("I am in julie block");
    }

    Julie()
    {   
        super();
        System.out.println("I am in Julie constructor");
    }

    public static void getData(){
        Core.getData();
        System.out.println("I am call from Julie.. gtadata here..!!");
    }

    public static void main(String args[])
    {
        Julie j = new Julie();
        // Core.getData();
        getData();
    }
}