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
		//selenium.type("lst-ib", "test type"); //�ı������� input text box
		//selenium.typeKeys("lst-ib", "test typeKeys"); //��û������
		//selenium.click("name=btnK"); //click ����
		//selenium.doubleClick("name=btnK");
		//selenium.doubleClickAt(locator, coordString);
		selenium.setTimeout("50000"); //����timeoutʱ��
		selenium.setSpeed("1000"); //����ÿ������stepִ��ʱ����
		selenium.open("http://tieba.baidu.com/");
		String title = selenium.getTitle();
		String location = selenium.getLocation();
		System.out.println(title + "&" + location);
		
		selenium.click("class=senior-search-link");
		selenium.waitForPageToLoad("5000"); //�ȴ�ҳ��ˢ��
		selenium.select("name=sm", "value=0");
		boolean ItemExist = selenium.isElementPresent("name=sm");
		System.out.println(ItemExist);
		
		try{
			Thread.sleep(3000); //�ȴ�ʱ�� wait for 3 seconds
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		if (ItemExist){
			selenium.select("name=sm", "label=�����������"); //select the item
		}else{
			System.out.println("The item: ����������� is not exist");
		}
		
		
		
		
		//@----------��ȡҳ��Ԫ�ص�����-----------------------\\
		
		//getTitle()��ǰ��ҳ����
		String GetTitle = selenium.getTitle();
		System.out.println("ҳ������ǣ�"+GetTitle);
		String GetURL = selenium.getLocation();
		System.out.println("��ǰ��ҳURL��"+GetURL);
		//selenium.isChecked("name=kw"); //������ѡ��ѡ���ֵ
		if(selenium.isEditable("name=kw")){ //�Ƿ�ɱ༭
			selenium.type("name=kw", "test getValue method");
		}
		String GetValue = selenium.getValue("name=kw");
		System.out.println("��ȡinputԪ�صȵ�value��"+GetValue);
		String GetIndex = selenium.getSelectedIndex("name=sm");
		System.out.println("ѡ���б��item��index��"+ GetIndex);
		String GetLabel = selenium.getSelectedLabel("name=sm");
		System.out.println("ѡ���б��item���ı�ֵ��"+ GetLabel);
		String SelValue = selenium.getSelectedValue("name=sm"); //��ȡhtmlԪ��value��ֵ
		System.out.println("htmlԪ��value��ֵ�ǣ�"+ SelValue);
		String[] options = selenium.getSelectOptions("name=sm"); //��ȡѡ���������ı�����������
		for (int i=0; i<options.length; i++){
			System.out.println("��ȡѡ���������ı��ĵ�" +i+ "��ֵ��: " + options[i]);
		}
		//String BtnType = selenium.getAttribute("value=��������@type");
		//System.out.println("����������ť��type������ֵ�ǣ�"+ BtnType);
		boolean TextPresent = selenium.isTextPresent("У԰�û�ע��ͨ��");
		System.out.println("check istextpresent��"+ TextPresent);
		boolean IsVisible = selenium.isVisible("name=kw");
		System.out.println("check Ԫ���Ƿ�visible��"+ IsVisible);
		
		//@----------��ͼ����screencapture-----------------------\\
		selenium.captureEntirePageScreenshot("D:\\Java_Andriod\\Project1\\src\\screencapture\\captureEntirePageScreenshot.png", "");
		selenium.highlight("name=sm");
		selenium.captureScreenshot("D:\\Java_Andriod\\Project1\\src\\screencapture\\captureScreenshot.png");
				
		//@----------�˳�����-----------------------\\
		System.out.println("Exit the testing");
		selenium.stop();
		selenium.close();
		System.out.println("add this to test git");
	}

}
