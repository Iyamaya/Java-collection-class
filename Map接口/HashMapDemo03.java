import java.util.HashMap ;
import java.util.Map ;
import java.util.Iterator ;
import java.util.Set ;
public class HashMapDemo03{
	public static void main(String args[]){
		Map<String,String> map = null; // ����Map��������key��value������ΪString
		map = new HashMap<String,String>() ;
		map.put("mldn","www.mldn.cn") ;	// ��������
		map.put("zhinangtuan","www.zhinangtuan.net.cn") ;	// ��������
		map.put("mldnjava","www.mldnjava.cn") ;	// ��������
		Set<String> keys = map.keySet() ;	// �õ�ȫ����key
		Iterator<String> iter = keys.iterator() ;
		while(iter.hasNext()){
			String str = iter.next() ;
			System.out.print(str + "��") ;
		}
	}
};