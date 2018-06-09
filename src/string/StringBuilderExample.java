package string;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(40);
		System.out.println(sb.capacity());
		StringFlight sf = new StringFlight();
		
		String location = "Florida";
		
		sb.append("I flew to");
		sb.append(location);
		sb.append(" on ");
		sb.append(sf);
		
		int time = 9;
		
		int pos = sb.length()-" on ".length()-sf.toString().length();
		
		sb.insert(pos, " at ");
		sb.insert(pos + 4, time);
		
		System.out.println(sb);
		
		String message = sb.toString();
		System.out.println(message);

	}

}
