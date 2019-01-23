import java.util.*; 
import java.io.*; 
class Movie
{
	public static void main(String[] args)
	{
		ArrayList<MovieCore> al = new ArrayList<MovieCore>();
				al.add(new MovieCore("HDLCS", 1996, 7.00));
				al.add(new MovieCore("HSSH", 1998, 9.50));
				al.add(new MovieCore("3-Idiot", 2008, 8.50));
				al.add(new MovieCore("RAAZI", 2018, 9.60));
				al.add(new MovieCore("DDLJ", 1995, 9.00));

		
		System.out.println("SORTING USING COMPARABLE");
		Collections.sort(al);
		for(MovieCore mc : al)
		{
			System.out.println(mc.getName() + " " + mc.getYear() + " " + mc.getRating());
		}
		
		
		System.out.println("SORTING USING COMPARATOR BY RATING");
		Rating r = new Rating();
		Collections.sort(al, r);
		for(MovieCore mc : al)
		{
			System.out.println(mc.getName() + " " + mc.getYear() + " " + mc.getRating());
		}
		
		System.out.println("SORTING USING COMPARATOR BY NAME");
		Name n = new Name();
		Collections.sort(al, n);
		for(MovieCore mc : al)
		{
			System.out.println(mc.getName() + " " + mc.getYear() + " " + mc.getRating());
		}


	}
	
}

class MovieCore implements Comparable<MovieCore> 
{
	String name;
	int year;
	double rating;
	
	public String getName(){
		return name;
	}
	public int getYear(){
		return year;
	}
	public double getRating()
	{
		return rating;
	}
	
	MovieCore(String name, int year, double rating)
	{
		this.rating = rating;
		this.year = year;
		this.name = name;
	}
	
	public int compareTo(MovieCore mc)
	{
		return  mc.year  - this.year;
	}
}

class Rating implements Comparator<MovieCore> 
{
	public int compare(MovieCore mc1, MovieCore mc2)
	{
		if(mc1.getRating() > mc2.getRating()){
			return 1;
		}
		if(mc1.getRating() < mc2.getRating())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}

class Name implements Comparator<MovieCore> 
{
	public int compare(MovieCore m1, MovieCore m2) 
    { 
        return m1.getName().compareTo(m2.getName()); 
    } 
}