
// Sting class is final class 
class StringClass
{
    public static void  main(String args[])
    {
        String a = "RadhIKa";

        System.out.println(a.intern());

        // string class intern() method used for fast string comparision 
        // using intern() it check in  string pool that  same object is created or not if there is same object exits than only give an referce of pool string
        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        final String s4 = s3.intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3)); 

        String name = "Radhika Surani";
       name =  name.replace("Surani", "patel"); //  it return new String
       name = name.split(" ");
        System.out.println(naname.split(" "));
        
    }
} 