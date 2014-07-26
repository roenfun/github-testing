package porject1;

import java.io.IOException;

//add rem to test git function
public class RC_Launch {
	public static void main(String[] args) {
		Process p;
		String cmdString = "cmd /c start java -jar D:\\Èí¼þtool\\Selenuim\\selenium-server-standalone-2.37.0.jar"; // Æô¶¯selenium
		try {
			p = Runtime.getRuntime().exec(cmdString);
			System.out.println(p);
			System.out.println("test git function");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
