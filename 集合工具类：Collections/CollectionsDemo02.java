import java.util.Collections ;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Iterator ;
public class CollectionsDemo02{
	public static void main(String args[]){
		List<String> all = new ArrayList<String>() ;	// ���ؿյ� List����
		Collections.addAll(all,"MLDN","LXH","mldnjava") ;
		Iterator<String> iter = all.iterator() ;
		while(iter.hasNext()){
			System.out.print(iter.next() + "��") ;
		}
	}
};