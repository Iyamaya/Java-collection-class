import java.util.HashMap ;
import java.util.Map ;
import java.util.Set ;
import java.util.Iterator ;
public class IteratorDemo04{
	public static void main(String args[]){
		Map<String,String> map = null; // ����Map��������key��value������ΪString
		map = new HashMap<String,String>() ;
		map.put("mldn","www.mldn.cn") ;	// ��������
		map.put("zhinangtuan","www.zhinangtuan.net.cn") ;	// ��������
		map.put("mldnjava","www.mldnjava.cn") ;	// ��������
		Set<Map.Entry<String,String>> allSet = null ;
		allSet = map.entrySet() ;
		Iterator<Map.Entry<String,String>> iter = null ;
		iter = allSet.iterator() ;
		while(iter.hasNext()){
			Map.Entry<String,String> me = iter.next() ;
			System.out.println(me.getKey() + " --> " + me.getValue()) ;
		}
	}
};