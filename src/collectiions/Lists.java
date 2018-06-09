package collectiions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<String>();
		List<String> link = new LinkedList<String>();

		InputStreamReader red = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(red);

		try {
			String s = br.readLine();
			System.out.println(s);

			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
