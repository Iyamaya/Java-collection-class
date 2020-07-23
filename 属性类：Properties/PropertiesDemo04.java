import java.util.Properties;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class PropertiesDemo04{
	public static void main(String args[]){
		Properties pro = new Properties() ;	// ����Properties����
		pro.setProperty("BJ","BeiJing") ;	// ��������
		pro.setProperty("TJ","TianJin") ;
		pro.setProperty("NJ","NanJing") ;	
		File file = new File("D:" + File.separator + "area.xml") ;	// ָ��Ҫ�������ļ�
		try{
			pro.storeToXML(new FileOutputStream(file),"Area Info") ;	// �������Ե���ͨ�ļ�
		}catch(FileNotFoundException e){
			e.printStackTrace() ;
		}catch(IOException e){
			e.printStackTrace() ;
		}
	}
};