import java.util.Collections ;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Iterator ;
public class CollectionsDemo06{
	public static void main(String args[]){
		List<String> all = new ArrayList<String>() ;	// ���ؿյ� List����
		Collections.addAll(all,"1��MLDN","2��LXH","3��mldnjava") ;
		Collections.addAll(all,"B��www.mldn.cn") ;
		Collections.addAll(all,"A��www.mldnjava.cn") ;
		System.out.println("����֮ǰ�ļ��ϣ�" + all) ;
		Collections.sort(all) ;
		System.out.println("����֮��ļ��ϣ�" + all) ;
		
	}
};