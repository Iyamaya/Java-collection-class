import java.util.HashMap ;
import java.util.Map ;
import java.util.Set ;
import java.util.Iterator ;
import java.util.Collection ;
public class HashtableDemo01{
	public static void main(String args[]){
		Map<String,String> map = null; // ����Map��������key��value������ΪString
		map = new HashMap<String,String>() ;
		map.put("mldn","www.mldn.cn") ;	// ��������
		map.put("zhinangtuan","www.zhinangtuan.net.cn") ;	// ��������
		map.put("mldnjava","www.mldnjava.cn") ;	// ��������
		System.out.print("ȫ����key��") ;
		Set<String> keys = map.keySet() ;	// �õ�ȫ����key
		Iterator<String> iter = keys.iterator() ;
		while(iter.hasNext()){
			String str = iter.next() ;
			System.out.print(str + "��") ;
		}
		System.out.print("\nȫ����value��") ;
		Collection<String> values = map.values() ;	// �õ�ȫ����value
		Iterator<String> iter2 = values.iterator() ;
		while(iter2.hasNext()){
			String str = iter2.next() ;
			System.out.print(str + "��") ;
		}
	}
};