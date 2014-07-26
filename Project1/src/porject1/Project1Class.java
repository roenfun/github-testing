package porject1;
import com.thoughtworks.selenium.*;

public class Project1Class {

	public static void main(String[] args) {
		
		//���� DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"C:\\Program Files\\Internet Explorer\\iexplore","http://www.baidu.com/");
		DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"*iexplore","http://www.baidu.com/"); //*firefox
		selenium.start();
		selenium.open("http://www.baidu.com/");
		selenium.windowFocus();
		selenium.windowMaximize();
		selenium.refresh();
		
		selenium.open("http://www.google.com.hk/");
		
		try{
			Thread.sleep(3000); //�ȴ�ʱ�� wait for 3 seconds
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		selenium.goBack(); //������һҳ��
		
		selenium.close(); //�ر������ close browser
	}

}
