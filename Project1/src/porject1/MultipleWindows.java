package porject1;
import com.thoughtworks.selenium.*;

public class MultipleWindows {
	public static void main(String[] args) {
		//DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"*iexplore C:\\Program Files\\Internet Explorer\\iexplore.exe","http://www.baidu.com/"); //*firefox
		DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"*iexplore","http://www.baidu.com/");
		//DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox E:\\Program Files\\Firefox\\firefox.exe", "http://www.google.com.hk/");
		
		//DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"*custom E:\\Program Files\\360Browser\\360se6\\Application\\360se.exe","http://www.baidu.com/");
		
		selenium.start();
		
		//��windows���ڵĴ���
		selenium.open("http://www.baidu.com/");
		selenium.click("name=tj_reg"); //��� ע�ᰴť
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String[] ids = selenium.getAllWindowIds();
		String[] names = selenium.getAllWindowNames();
		String[] titles = selenium.getAllWindowTitles();
		
		System.out.println("���ǵ�id�ֱ���:");
		for (int i=0; i<ids.length; i++){
			System.out.println(ids[i]);
		}
		
		System.out.println("���ǵ�name�ֱ���:");
		for (int i=0; i<names.length; i++){
			System.out.println(names[i]);
		}
		
		System.out.println("���ǵ�title�ֱ���:");
		for (int i=0; i<titles.length; i++){
			System.out.println(titles[i]);
		}
		
		
		
			
	}

}
