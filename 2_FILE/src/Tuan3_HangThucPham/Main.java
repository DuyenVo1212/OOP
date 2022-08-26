package Tuan3_HangThucPham;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		 Date date = new Date();
		try {
			Hang h1=new Hang("dsds", "dss", 232,formatter.parse("1/03/2027"),formatter.parse("1/03/2028"));
			Hang h2=new Hang();
			System.out.println(h1.tieuDe());
			System.out.println(h1);
			System.out.println(h2);
			
        } catch (Exception e) {
           System.out.println(e.getMessage());
        
        }
		
	
	}

}
