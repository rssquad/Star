package test.test;

public class DataInt implements Comparable<DataInt> {
	
	private String name;
	private int score;
	private String dept;
	
	public DataInt(String name, int score, String dept) {
		
		this.name = name;
		this.score = score;
		this.dept = dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	@Override
	public int compareTo(DataInt dataInt) {
		
		return dataInt.getScore() - this.score ;
	}
	
	public String toString()
	{
		
		return this.score + "";
	}

}
