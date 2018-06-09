package collections;
import java.util.*;
public class CopyReverseM {

	public static void main(String[] args) {
		
		Character[] l = new Character[]{'p','W','n'};
		List<Character> list = new ArrayList<Character>(Arrays.asList(l));
		System.out.println("The list of elements are : ");
		output(list);
	
		Collections.reverse(list);
		System.out.println("The list of elements after reverse : ");
		output(list);
		
		Character[] list1 = new Character[3];
		List<Character> listcopy = Arrays.asList(list1);
		System.out.println("List after copy : ");
		Collections.copy(listcopy, list);
		output(listcopy);
		
		Collections.fill(list, 'F');
		System.out.println("List after changed characters : ");
		output(list);
		
	}

	public static void output(List<Character> lists){
		for(Character x : lists){
			System.out.printf("%s \t" , x);
		}
		System.out.println();
	}
}
