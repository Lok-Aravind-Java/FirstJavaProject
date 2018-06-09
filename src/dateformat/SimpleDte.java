package dateformat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDte {

	public static void main(String[] args) {

		 Date d = new Date ();
		 System.out.println(d.toString());
		 System.out.println(d.getTime());
		 
		 System.out.println(d.getMonth()+1);
		 System.out.println(d.getYear()+1900);
		 System.out.println(d.getDate());
		 
		 System.out.println(d.getHours());
		 System.out.println(d.getMinutes());
		 System.out.println(d.getSeconds());
		 
		 
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd  hh:mm:ss z");
        System.out.println(sdf.format(d));
	}

}
