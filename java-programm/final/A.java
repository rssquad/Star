class A
{
    public static void main(String args[])
    {
    //  C c = new C();
    //  B b = new B();
    //  B b = new C();

     
     C c = new B(); // we can't do this
     c.getMSG();
     c.getCClass();
    }
}

class B
{
    public void getMSG()
    {
        System.out.println("B Class here..!!");
    }

    public void getBClass()
    {
        System.out.println("YEAHH I AM B");
    }
}

class C extends B{

    public void getMSG()
    {
        System.out.println("C Class here..!!");
    }

    public void getCClass()
    {
        System.out.println("YEAHH I AM c");
    }

}