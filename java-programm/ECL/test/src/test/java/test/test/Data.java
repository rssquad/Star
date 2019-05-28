package test.test;

public class Data implements Comparable<Data> {
	
	private String name;
	private int score;
	
	public Data(String name, int score)
	{
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int compareTo(Data data) {
		// TODO Auto-generated method stub
		
		
		return data.getScore() - this.score;
	}
	
	public String toString()
	{
		
		return this.name + "-" + this.score;
	}
	

}
