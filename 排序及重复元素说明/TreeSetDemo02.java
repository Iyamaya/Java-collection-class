import java.util.Set ;
import java.util.TreeSet ;
class Person{
	private String name ;
	private int age ;
	public Person(String name,int age){
		this.name = name ;
		this.age = age ;
	}
	public String gtoString(){
		return "������" + this.name + "�����䣺" + this.age ;
	}
};
public class TreeSetDemo02{
	public static void main(String args[]){
		Set<Person> allSet = new TreeSet<Person>() ;
		allSet.add(new Person("����",30)) ;
		allSet.add(new Person("����",31)) ;
		allSet.add(new Person("����",32)) ;
		allSet.add(new Person("����",32)) ;
		allSet.add(new Person("����",32)) ;
		allSet.add(new Person("����",33)) ;
		allSet.add(new Person("����",33)) ;
		System.out.println(allSet) ;
	}
};