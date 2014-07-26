package porject1;

import com.thoughtworks.selenium.*;

public class WebElementOperation {

	public static void main(String[] args) {
		System.out.println("tset selenium");
		DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"*iexplore C:\\Program Files\\Internet Explorer\\iexplore.exe","http://www.baidu.com/"); //*firefox
		//DefaultSelenium selenium = new DefaultSelenium("localhost",4444,"*iexplore","http://www.baidu.com/");
		//DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox E:\\Program Files\\Firefox\\firefox.exe", "http://www.google.com.hk/");
		selenium.start();
		//selenium.open("http://www.google.com.hk/");
		//selenium.type("lst-ib", "test type"); //文本框输入 input text box
		//selenium.typeKeys("lst-ib", "test typeKeys"); //还没搞明白
		//selenium.click("name=btnK"); //click 方法
		//selenium.doubleClick("name=btnK");
		//selenium.doubleClickAt(locator, coordString);
		selenium.setTimeout("50000"); //设置timeout时间
		selenium.setSpeed("1000"); //设置每个步骤step执行时间间隔
		selenium.open("http://tieba.baidu.com/");
		String title = selenium.getTitle();
		String location = selenium.getLocation();
		System.out.println(title + "&" + location);
		
		selenium.click("class=senior-search-link");
		selenium.waitForPageToLoad("5000"); //等待页面刷新
		selenium.select("name=sm", "value=0");
		boolean ItemExist = selenium.isElementPresent("name=sm");
		System.out.println(ItemExist);
		
		try{
			Thread.sleep(3000); //等待时间 wait for 3 seconds
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		if (ItemExist){
			selenium.select("name=sm", "label=按相关性排序"); //select the item
		}else{
			System.out.println("The item: 按相关性排序 is not exist");
		}
		
		
		
		
		//@----------获取页面元素的内容-----------------------\\
		
		//getTitle()当前网页标题
		String GetTitle = selenium.getTitle();
		System.out.println("页面标题是："+GetTitle);
		String GetURL = selenium.getLocation();
		System.out.println("当前网页URL："+GetURL);
		//selenium.isChecked("name=kw"); //存贮复选或单选框的值
		if(selenium.isEditable("name=kw")){ //是否可编辑
			selenium.type("name=kw", "test getValue method");
		}
		String GetValue = selenium.getValue("name=kw");
		System.out.println("获取input元素等的value："+GetValue);
		String GetIndex = selenium.getSelectedIndex("name=sm");
		System.out.println("选择列表的item的index："+ GetIndex);
		String GetLabel = selenium.getSelectedLabel("name=sm");
		System.out.println("选择列表的item的文本值："+ GetLabel);
		String SelValue = selenium.getSelectedValue("name=sm"); //获取html元素value的值
		System.out.println("html元素value的值是："+ SelValue);
		String[] options = selenium.getSelectOptions("name=sm"); //获取选项中所有文本，返回数组
		for (int i=0; i<options.length; i++){
			System.out.println("获取选项中所有文本的第" +i+ "个值是: " + options[i]);
		}
		//String BtnType = selenium.getAttribute("value=贴吧搜索@type");
		//System.out.println("贴吧搜索按钮的type的属性值是："+ BtnType);
		boolean TextPresent = selenium.isTextPresent("校园用户注册通道");
		System.out.println("check istextpresent："+ TextPresent);
		boolean IsVisible = selenium.isVisible("name=kw");
		System.out.println("check 元素是否visible："+ IsVisible);
		
		//@----------截图设置screencapture-----------------------\\
		selenium.captureEntirePageScreenshot("D:\\Java_Andriod\\Project1\\src\\screencapture\\captureEntirePageScreenshot.png", "");
		selenium.highlight("name=sm");
		selenium.captureScreenshot("D:\\Java_Andriod\\Project1\\src\\screencapture\\captureScreenshot.png");
				
		//@----------退出测试-----------------------\\
		System.out.println("Exit the testing");
		selenium.stop();
		selenium.close();
		System.out.println("add this to test git");
	}

}
