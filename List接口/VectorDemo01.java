import java.util.Vector ;
import java.util.List ;
public class VectorDemo01{
	public static void main(String args[]){
		List<String> allList = null ;
		allList = new Vector<String>() ;	// ָ�������ķ���ΪString
		allList.add("Hello") ;	// �˷�����Collection�ӿڶ���
		allList.add("Hello") ;	// �˷�����Collection�ӿڶ���
		allList.add(0,"World") ;	// �ڵ�һ��λ��������µ�����
		allList.add("MLDN") ;	// ��Collection�м�������
		allList.add("www.mldn.cn") ;
		for(int i=0;i<allList.size();i++){
			System.out.print(allList.get(i) + "��") ;
		}
	}
};