import java.util.Properties;
public class PropertiesDemo01{
	public static void main(String args[]){
		Properties pro = new Properties() ;	// ����Properties����
		pro.setProperty("BJ","BeiJing") ;	// ��������
		pro.setProperty("TJ","TianJin") ;
		pro.setProperty("NJ","NanJing") ;	
		System.out.println("1��BJ���Դ��ڣ�" + pro.getProperty("BJ")) ;
		System.out.println("2��SC���Բ����ڣ�" + pro.getProperty("SC")) ;
		System.out.println("3��SC���Բ����ڣ�ͬʱ������ʾ��Ĭ��ֵ��" + pro.getProperty("SC","û�з���")) ;
	}
};