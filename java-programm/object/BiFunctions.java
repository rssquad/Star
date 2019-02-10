import java.util.function.*;
import java.util.*;

class BiFunctions
{
    public static void main(String[] args)
    {
        BiPredicate<Integer,Integer> p = (n1,n2)-> (n1+n2) % 2 ==0;
        p.test(10,25);
        System.out.println(p.test(10,25));
        ArrayList<Employee> l = new ArrayList<Employee>();
        BiFunction<String,Integer,Employee> f = (name,eno)->new Employee(name, eno);
        l.add(f.apply("Radhika",101));
        l.add(f.apply("Amyra",201));
        l.add(f.apply("Anamika",301));

        for(Employee e : l)
        {
            System.out.println("NAME : " + e.name + " ENO : " + e.eno); 
        }
    }
}

class Employee
{
    String name;
    int eno;

    Employee(String name, int eno)
    {
        this.name = name;
        this.eno = eno;
    }
}