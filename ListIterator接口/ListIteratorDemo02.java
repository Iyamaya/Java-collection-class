import java.util.ArrayList ;
import java.util.List ;
import java.util.ListIterator ;
public class ListIteratorDemo02{
	public static void main(String argsp[]){
		List<String> all = new ArrayList<String>() ;
		all.add("hello") ;
		all.add("_") ;
		all.add("world") ;
		ListIterator<String> iter = all.listIterator() ;
		System.out.print("��ǰ��������") ;
		while(iter.hasNext()){
			String str = iter.next() ;
			System.out.print(str + "��") ;
			iter.set("LI - " + str) ;	// �޸�����
		}
		System.out.print("\n�ɺ���ǰ�����") ;
		iter.add("LXH");
		while(iter.hasPrevious()){
			String str = iter.previous() ;
			System.out.print(str + "��") ;
		}
	}
};