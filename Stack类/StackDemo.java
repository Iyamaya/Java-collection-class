import java.util.Stack ;
public class StackDemo{
	public static void main(String args[]){
		Stack<String> s = new Stack<String>() ;
		s.push("A") ;	// ��ջ
		s.push("B") ;	// ��ջ
		s.push("C") ;	// ��ջ
		System.out.print(s.pop() + "��") ;
		System.out.print(s.pop() + "��") ;
		System.out.println(s.pop() + "��") ;
		System.out.println(s.pop()) ;
	}
};