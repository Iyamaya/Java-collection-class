import java.util.IdentityHashMap ;
import java.util.Set ;
import java.util.Iterator ;
import java.util.Map ;
class Person{
	private String name ;
	private int age ;
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true ;
		}
		if(!(obj instanceof Person)){
			return false ;
		}
		Person p = (Person)obj ;
		if(this.name.equals(p.name)&&this.age==p.age){
			return true ;
		}else{
			return false ;
		}
	}
	public int hashCode(){
		return this.name.hashCode() * this.age ;
	}
	public String toString(){
		return "������" + this.name + "�����䣺" + this.age ;
	}
};
public class IdentityHashMapDemo02{
	public static void main(String args[]){
		Map<Person,String> map = null ;	// ����Map����
		map = new IdentityHashMap<Person,String>() ;
		map.put(new Person("����",30),"zhangsan_1") ;	// ��������
		map.put(new Person("����",30),"zhangsan_2") ;	// ��������
		map.put(new Person("����",31),"lisi") ;	// ��������
		Set<Map.Entry<Person,String>> allSet = null ;	// ׼��ʹ��Set����ȫ������
		allSet = map.entrySet() ;
		Iterator<Map.Entry<Person,String>> iter = null ;
		iter = allSet.iterator() ;
		while(iter.hasNext()){
			Map.Entry<Person,String> me = iter.next() ;
			System.out.println(me.getKey() + " --> " + me.getValue()) ;
		}
	}
};