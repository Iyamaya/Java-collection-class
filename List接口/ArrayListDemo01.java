import java.util.ArrayList ;
import java.util.List ;
import java.util.Collection ;
public class ArrayListDemo01{
	public static void main(String args[]){
		List<String> allList = null ;
		Collection<String> allCollection = null ;
		allList = new ArrayList<String>() ;	// ָ�������ķ���ΪString
		allCollection = new ArrayList<String>() ;	// ָ��һ������
		allList.add("Hello") ;	// �˷�����Collection�ӿڶ���
		allList.add(0,"World") ;	// �ڵ�һ��λ��������µ�����
		System.out.println(allList) ;
		allCollection.add("LXH") ;	// ��Collection�м�������
		allCollection.add("www.mldn.cn") ;
		allList.addAll(allCollection) ;
		allList.addAll(0,allCollection) ;
		System.out.println(allList) ;
	}
};