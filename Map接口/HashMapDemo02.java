import java.util.HashMap ;
import java.util.Map ;
public class HashMapDemo02{
	public static void main(String args[]){
		Map<String,String> map = null; // ����Map��������key��value������ΪString
		map = new HashMap<String,String>() ;
		map.put("mldn","www.mldn.cn") ;	// ��������
		map.put("zhinangtuan","www.zhinangtuan.net.cn") ;	// ��������
		map.put("mldnjava","www.mldnjava.cn") ;	// ��������
		if(map.containsKey("mldn")){	// �ж�key�Ƿ����
			System.out.println("������key���ڣ�") ;
		}else{
			System.out.println("������key�����ڣ�") ;
		}
		if(map.containsValue("www.mldn.cn")){	// �ж�value�Ƿ����
			System.out.println("������value���ڣ�") ;
		}else{
			System.out.println("������value�����ڣ�") ;
		}
	}
};