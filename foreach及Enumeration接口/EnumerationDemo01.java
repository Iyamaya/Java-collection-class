import java.util.Vector; 
import java.util.Enumeration; 
public class EnumerationDemo01{
	public static void main(String args[]){
		Vector<String> all = new Vector<String>() ;
		all.add("hello") ;
		all.add("_") ;
		all.add("world") ;
		Enumeration<String> enu = all.elements() ;
		while(enu.hasMoreElements()){	//�ж��Ƿ������ݣ�hasNext()
			System.out.print(enu.nextElement() + "��") ;	// ���Ԫ�أ�next()
		}
	}
};