import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Streamss
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(3);
        l.add(6);
        l.add(465);
        l.add(346);
        l.add(46);
        l.add(63);
        l.add(34);
        l.add(23);
        // List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList()); // here filter return only true false so when need to update somthing must go for map
        // System.out.println(l2);
        List<Integer> l3 = l.stream().map(i->i+5).collect(Collectors.toList()); // suppose you want to add 5 in every number than should go for map
        System.out.println(l3);

        long noOfFailedStudent = l.stream().filter(m->m<35).count();
        System.out.println(noOfFailedStudent);

        List<Integer> l4 = l.stream().filter(i->i%2==0).collect(Collectors.toList()).stream().map(i->i+10).collect(Collectors.toList());
        System.out.println(l4);

        List<Integer> l5 = l.stream().sorted((obj1, obj2)->obj1>obj2?-1:obj1<obj2?1:0).collect(Collectors.toList());
        System.out.println(l5);

        int min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
        int max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);
        System.out.println(max);

        ArrayList<String> ls = new ArrayList<String>();// sorted array by string length
        ls.add("A");
        ls.add("AA");
        ls.add("AAA");
        ls.add("AAAAAA");
        ls.add("AAAAA");
        ls.add("AAAA");
Comparator<String> c = (obj1, obj2)->{
    int l1 = obj1.length();
    int l2 = obj1.length();
    if(l1>l2) return 1;
    else if(l1<l2) return -1;
    else return obj1.compareTo(obj2);
};

        List<String> s = ls.stream().sorted(c).collect(Collectors.toList());
        System.out.println(s);

        // Consumer<String> c1 = s1->{
        //     System.out.println("HERE IS STRING : "+ s1 );
        // };
        //  s.stream().forEach(c1);

        s.stream().forEach(s2->{System.out.println("HERE IS :" + s2);});
       
    }
}