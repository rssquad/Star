import java.util.*;

class MyComparator1 implements Comparator<Integer>
{
    public int compare(Integer n1, Integer n2)
    {
        if(n1<n2)
        {
            return -1;
        }
        else if(n1>n2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

class LambdaWithCollection
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(54);
        a.add(36);
        a.add(78);
        a.add(55);
        a.add(5);
        a.add(68);

        System.out.println(a);
        // Collections.sort(a,new MyComparator1());
        Comparator<Integer> c = (n1, n2) -> (n1<n2) ? -1 : (n1>n2) ? 1 : 0; // In this case no need to write MyComparator class
        Collections.sort(a,c); // Collection using lambda expression
        System.out.println(a);
    }
}

