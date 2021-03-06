import java.util.ArrayList ;
import java.util.List ;
import java.util.ListIterator ;
public class ListIteratorDemo02{
	public static void main(String argsp[]){
		List<String> all = new ArrayList<String>() ;
		all.add("hello") ;
		all.add("_") ;
		all.add("world") ;
		ListIterator<String> iter = all.listIterator() ;
		System.out.print("由前向后输出：") ;
		while(iter.hasNext()){
			String str = iter.next() ;
			System.out.print(str + "、") ;
			iter.set("LI - " + str) ;	// 修改内容
		}
		System.out.print("\n由后向前输出：") ;
		iter.add("LXH");
		while(iter.hasPrevious()){
			String str = iter.previous() ;
			System.out.print(str + "、") ;
		}
	}
};