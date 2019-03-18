
import java.io.*; 
import java.util.*; 

class HashCode
{
	
	public static void main(String[] args)
	{
		Hash h = new Hash("Radhika", 101);
		Hash h1 = new Hash("Radhika", 101);
		
		Map<Hash, String> m = new HashMap<Hash, String>();
	m.put(h, "Engineer");
	m.put(h1, "BusinessWomen");
	
	for(Hash hash : m.keySet())
	{
		System.out.println(m.get(hash).toString());
	}

	}
	
	
}
class Hash
{
	String name;
	int id;
	
	Hash(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
    @Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		
		if(obj == null || obj.getClass() != this.getClass())
		{
			return false;
		}

		Hash hs = (Hash)obj;
		
		return (hs.name.equals(this.name) && hs.id == this.id);
	}
	
	  @Override
    public int hashCode() 
    { 
        return this.id ; 
    } 
}
