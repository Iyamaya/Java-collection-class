import java.util.LinkedList ;
public class LinkedListDemo03{
	public static void main(String args[]){
		LinkedList<String> link = new LinkedList<String>() ;
		link.add("A") ;	// ����Ԫ��
		link.add("B") ;	// ����Ԫ��
		link.add("C") ;	// ����Ԫ��
		System.out.print("��FIFO�ķ�ʽ�����") ;
		for(int i=0;i<=link.size()+1;i++){
			System.out.print(link.poll() + "��") ;
		}
	}
};