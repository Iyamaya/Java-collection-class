import java.util.Collections ;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Iterator ;
public class CollectionsDemo05{
	public static void main(String args[]){
		List<String> all = new ArrayList<String>() ;	// ���ؿյ� List����
		Collections.addAll(all,"MLDN","LXH","mldnjava") ;
		if(Collections.replaceAll(all,"LXH","���˻�")){// �滻����
			System.out.println("�����滻�ɹ���") ;
		}
		System.out.print("�滻֮��Ľ����") ;
		System.out.print(all) ;
		
	}
};