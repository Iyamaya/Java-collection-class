import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class PropertiesDemo05{
	public static void main(String args[]){
		Properties pro = new Properties() ;	// ����Properties����
		File file = new File("D:" + File.separator + "area.xml") ;	// ָ��Ҫ�������ļ�
		try{
			pro.loadFromXML(new FileInputStream(file)) ;	// ��ȡ�����ļ�
		}catch(FileNotFoundException e){
			e.printStackTrace() ;
		}catch(IOException e){
			e.printStackTrace() ;
		}
		System.out.println("1��BJ���Դ��ڣ�" + pro.getProperty("BJ")) ;
	}
};