import java.util.Vector ;
import java.util.List ;
public class VectorDemo02{
	public static void main(String args[]){
		Vector<String> allList = null ;
		allList = new Vector<String>() ;	// ָ�������ķ���ΪString
		allList.addElement("Hello") ;	// �˷�����Collection�ӿڶ���
		allList.addElement("MLDN") ;	// ��Collection�м�������
		allList.addElement("www.mldn.cn") ;
		for(int i=0;i<allList.size();i++){
			System.out.print(allList.get(i) + "��") ;
		}
	}
};