import java.util.HashMap ;
import java.util.Map ;
import java.util.Iterator ;
import java.util.Collection ;
public class HashMapDemo04{
	public static void main(String args[]){
		Map<String,String> map = null; // ����Map��������key��value������ΪString
		map = new HashMap<String,String>() ;
		map.put("mldn","www.mldn.cn") ;	// ��������
		map.put("zhinangtuan","www.zhinangtuan.net.cn") ;	// ��������
		map.put("mldnjava","www.mldnjava.cn") ;	// ��������
		Collection<String> values = map.values() ;	// �õ�ȫ����value
		Iterator<String> iter = values.iterator() ;
		while(iter.hasNext()){
			String str = iter.next() ;
			System.out.print(str + "��") ;
		}
	}
};