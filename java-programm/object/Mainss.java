
import java.util.*; 
import java.io.*; 

class Test implements Comparable<Test>
{
	String name;
	int id;
	double rating;
	
	public String getName(){
		return name;
	}
	
	public int  getId(){
		return id;
	}
	
	public double getRating(){
	return rating;
	}
	
	Test(String name, int id, double rating)
	{
		this.name = name;
		this.id = id ;
		this.rating = rating;
	}
	
	public int compareTo(Test t)
	{
		return t.id - this.id;
	}
	
}

class Mainss
{
		public static void main(String[] args)
		{
			ArrayList<Test> al = new ArrayList<Test>();
				al.add(new Test("HDLCS", 1996, 7.00));
				al.add(new Test("HSSH", 1998, 9.50));
				al.add(new Test("3-Idiot", 2008, 8.50));
				al.add(new Test("RAAZI", 2018, 9.60));
				al.add(new Test("DDLJ", 1995, 9.00));
				
				System.out.println("SORTING USING COMPARABLE");
		Collections.sort(al);
		for(Test tc : al)
		{
			System.out.println(tc.getName() + " " + tc.getId() + " " + tc.getRating());
		}
		
		System.out.println("SORTING USING COMPARATOR");
		OrderByName obn = new OrderByName();
		Collections.sort(al, obn);
		for(Test tc : al)
		{
			System.out.println(tc.getName() + " " + tc.getId() + " " + tc.getRating());
		}
		
		}
}

class OrderByName implements Comparator<Test>
{
	public int compare(Test t1 , Test t2)
	{
		return t1.getName().compareTo(t2.getName());
		 
	}
}

