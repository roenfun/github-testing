package porject1;
import com.thoughtworks.selenium.*;

public class Project1Class {

	public static void main(String[] args) {
		
		//错误 DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"C:\\Program Files\\Internet Explorer\\iexplore","http://www.baidu.com/");
		DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"*iexplore","http://www.baidu.com/"); //*firefox
		selenium.start();
		selenium.open("http://www.baidu.com/");
		selenium.windowFocus();
		selenium.windowMaximize();
		selenium.refresh();
		
		selenium.open("http://www.google.com.hk/");
		
		try{
			Thread.sleep(3000); //等待时间 wait for 3 seconds
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		selenium.goBack(); //返回上一页面
		
		selenium.close(); //关闭浏览器 close browser
	}

}
