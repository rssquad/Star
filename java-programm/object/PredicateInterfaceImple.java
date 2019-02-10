import java.util.function.*;

class PredicateInterfaceImple
{
    public static void main(String args[])
    {
        //EX : 1
        // Predicate<Integer> p1 = i->i%2==0;
        // System.out.println(p1.test(10));
        // System.out.println(p1.test(15));

        // Ex : 2
        // Predicate<Employee> p1 = e->e.salary>1000 && e.isHaveingExperience == true;
        // System.out.println(p1.test(e));

        // Ex : 3
        // write a predicate to check wether a length of string is greate than 5 or not
        // Predicate<String> p1 = s->s.length()>5;
        // System.out.println(p1.test("any String"));

        // Ex : 4
        // String[] s = {"Radhika", "Amyra","Arjoo","Deewani","Adi","Kavi"};
        // Predicate<String> p = s1->s1.length()>5;
        // for(String s1 : s)
        //     {
        //        if(p1.test(s1))
        //        {
        //            System.out.println(s1);
        //        } 
        //     }

        // Ex :5
        int[] n = {4,6,8,10,40,35,6,8,46,20,44};
        Predicate<Integer> p1 = no->no%2==0;
        Predicate<Integer> p2 = np->no>10;
        // and(), or(), negate()
        for(Integer a : n)
        {
            if(p1.and(p2).test(a))
            {
                System.out.println(a);
            }
        }
    }
}