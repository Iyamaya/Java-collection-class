import java.util.WeakHashMap ;
import java.util.Map ;
import java.util.Set ;
import java.util.Iterator ;
import java.util.Collection ;
public class WeakHashMapDemo01{
	public static void main(String args[]){
		Map<String,String> map = null; // ����Map��������key��value������ΪString
		map = new WeakHashMap<String,String>() ;
		map.put(new String("mldn"),new String("www.mldn.cn")) ;
		map.put(new String("zhinangtuan"),new String("www.zhinangtuan.net.cn")) ;
		map.put(new String("mldnjava"),new String("www.mldnjava.cn")) ;
		System.gc() ;	// ǿ���Խ����������ռ�����
		map.put(new String("lxh"),new String("lixinghua")) ;
		System.out.println(map) ;
	}
};