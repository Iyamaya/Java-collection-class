import java.util.ArrayList ;
import java.util.List ;
public class ArrayListDemo02{
	public static void main(String args[]){
		List<String> allList = null ;
		allList = new ArrayList<String>() ;	// ָ�������ķ���ΪString
		allList.add("Hello") ;	// �˷�����Collection�ӿڶ���
		allList.add(0,"World") ;	// �ڵ�һ��λ��������µ�����
		allList.add("MLDN") ;	// ��Collection�м�������
		allList.add("www.mldn.cn") ;
		allList.remove(0) ; // ɾ����һ��Ԫ�أ�ָ��ɾ����λ��
		allList.remove("Hello") ;	// �˷�����Collection�ӿڼ̳ж���
		System.out.println(allList) ;
	}
};