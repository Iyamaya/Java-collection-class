import java.util.Collections ;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Iterator ;
public class CollectionsDemo07{
	public static void main(String args[]){
		List<String> all = new ArrayList<String>() ;	// ���ؿյ� List����
		Collections.addAll(all,"1��MLDN","2��LXH","3��mldnjava") ;
		System.out.println("����֮ǰ�ļ��ϣ�" + all) ;
		Collections.swap(all,0,2) ;
		System.out.println("����֮��ļ��ϣ�" + all) ;
		
	}
};