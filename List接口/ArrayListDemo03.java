import java.util.ArrayList ;
import java.util.List ;
public class ArrayListDemo03{
	public static void main(String args[]){
		List<String> allList = null ;
		allList = new ArrayList<String>() ;	// ָ�������ķ���ΪString
		allList.add("Hello") ;	// �˷�����Collection�ӿڶ���
		allList.add("Hello") ;	// �˷�����Collection�ӿڶ���
		allList.add(0,"World") ;	// �ڵ�һ��λ��������µ�����
		allList.add("MLDN") ;	// ��Collection�м�������
		allList.add("www.mldn.cn") ;
		System.out.print("��ǰ��������") ;
		for(int i=0;i<allList.size();i++){
			System.out.print(allList.get(i) + "��") ;
		}
		System.out.print("\n�ɺ���ǰ�����") ;
		for(int i=allList.size()-1;i>=0;i--){
			System.out.print(allList.get(i) + "��") ;
		}
	}
};