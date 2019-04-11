class Core
{
    final String myStr; // you can have to initialize final varible otherwise it throws compli time error 
    final int num;
// Final variable can initiliz in constructor only..!! There is no other way to initilize final
    public Core()
    {
            myStr = "radhika"; //
            num = 10;
    }
    public static void main(String args[])
    {
        System.out.println("In main class..!!");

        Core c  =new Core();
        c.makeFinalInit();
    }

    public void makeFinalInit()
    {
        System.out.println("In final method..!!" +myStr + " : " + num);
    }
}