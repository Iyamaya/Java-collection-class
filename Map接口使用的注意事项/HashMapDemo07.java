import java.util.Map ;
import java.util.HashMap ;
class Person{
	private String name ;
	private int age ;
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String toString(){
		return "������" + this.name + "�����䣺" + this.age ;
	}
};
public class HashMapDemo07{
	public static void main(String args[]){
		Map<Person,String> map = null ;
		map = new HashMap<Person,String>() ;
		Person per = new Person("����",30) ;
		map.put(per,"zhangsan");	// ��������
		System.out.println(map.get(per)) ;
	}
};