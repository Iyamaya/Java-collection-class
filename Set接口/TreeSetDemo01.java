import java.util.TreeSet ;
import java.util.Set ;
public class TreeSetDemo01{
	public static void main(String args[]){
		Set<String> allSet = new TreeSet<String>() ;
		allSet.add("C") ;	// ��������
		allSet.add("C") ;	// �ظ�����
		allSet.add("C") ;	// �ظ�����
		allSet.add("D") ;	// ��������
		allSet.add("B") ;	// ��������
		allSet.add("A") ;	// ��������
		allSet.add("E") ;	// ��������
		System.out.println(allSet) ;
	}
};