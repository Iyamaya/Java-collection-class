import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class PropertiesDemo03{
	public static void main(String args[]){
		Properties pro = new Properties() ;	// ����Properties����
		File file = new File("D:" + File.separator + "area.properteis") ;	// ָ��Ҫ�������ļ�
		try{
			pro.load(new FileInputStream(file)) ;	// ��ȡ�����ļ�
		}catch(FileNotFoundException e){
			e.printStackTrace() ;
		}catch(IOException e){
			e.printStackTrace() ;
		}
		System.out.println("1��BJ���Դ��ڣ�" + pro.getProperty("BJ")) ;
		System.out.println("2��SH���Դ��ڣ�" + pro.getProperty("SH")) ;
	}
};