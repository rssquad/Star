import java.io.*; 
import java.util.*; 
class TEst
{
    public static void main(String[] args)
    {
       /*  Map<Integer, String> m = new HashMap<>();
        m.put(1,"abc");
        m.put(2,"def");
        m.put(3,"xyz");

        m.forEach((k,v)->{
            System.out.println("K : " + k + "V : " + v);
        });

        for(Map.Entry<Integer,String> entry :  m.entrySet())
        {
            System.out.println(" K : " + entry.getKey() + "V : " + entry.getValue());
        }

        for(int a : m.keySet())
        {
            System.out.println( a +  " " + m.get(a));
        } */

        DemoTest dt = new DemoTest("Radhika", 5);
        DemoTest dt1 = new DemoTest("Radhi", 45);
        DemoTest dt2 = new DemoTest("Raadhi", 9);

        ArrayList<DemoTest> m = new ArrayList<DemoTest>();
        m.add(dt);
        m.add(dt1);
        m.add(dt2);

        // Collections.sort(m);
        // for(DemoTest da : m)
        // {
        //     System.out.println("Name : " + da.getName() + " Id : " + da.getId());
        // }
        oderedByName od = new oderedByName();
        Collections.sort(m,od);
        for(DemoTest t : m)
        {
            System.out.println("Name : " + t.getName() + " Id : " + t.getId());
        }

    }
    
}

class DemoTest implements Comparable<DemoTest>
{
    String name;
    int id;

    public DemoTest(String name, int id)
    {
        this.name  = name;
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
    this.name = name;
    }

    public int getId()
    {
        return  this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

        public String toString()
        {
            return "Name is : " + this.name + "and his/her id is : " + this.id;

        }

        public int compareTo(DemoTest dt)
        {
          return dt.id - this.id;
        }
}

class oderedByName implements Comparator<DemoTest>
{
    public int compare(DemoTest dt, DemoTest dt1)
    {
            return dt.getName().compareTo(dt1.getName());
    }
}
