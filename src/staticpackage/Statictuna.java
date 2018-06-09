package staticpackage;

public class Statictuna {
	public String first;
	public String Last;
	public static int members = 0;

	
	public Statictuna(String first,String last){
		
		this.first = first;
		Last = last;
		members++;
		System.out.printf("the name : %s %s and members are %d \n",this.first,Last,members);
	}


	public String getFirst() {
		return first;
	}

	public String getLast() {
		return Last;
	}

	public static int getMembers() {
		return members;
	}
		
}
