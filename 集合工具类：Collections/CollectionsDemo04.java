import java.util.Collections ;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Iterator ;
public class CollectionsDemo04{
	public static void main(String args[]){
		List<String> all = new ArrayList<String>() ;	// ���ؿյ� List����
		Collections.addAll(all,"MLDN","LXH","mldnjava") ;
		int point = Collections.binarySearch(all,"LXH") ;	// ��������
		System.out.println("���������" + point) ;
		
	}
};