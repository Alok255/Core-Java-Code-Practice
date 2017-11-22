import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	
	public Person(String name){
		this.name=name;
	}
	
	public String toString(){
		return name;
	}

	/*@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public int compareTo(Person person){
		int len1=name.length();
		int len2=person.name.length();
		
		if(len1>len2){
			return 1;
		}else if(len1<len2){
			return -1;
		}else{
			return 0;
		}
	}
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list = new ArrayList<Person>();

		SortedSet<Person> set = new TreeSet<Person>();

		addElement(list);
		
		addElement(set);

		//Collections.sort(list);

		showElement(list);
		System.out.println();
		showElement(set);
	}

	private static void addElement(Collection<Person> col) {
		col.add(new Person("Alok"));
		col.add(new Person("Ravindra!"));
		col.add(new Person("Sab"));
		col.add(new Person("Rajeev"));
		col.add(new Person("Muskan"));
	}

	private static void showElement(Collection<Person> col) {
		for (Person m : col) {
			System.out.println(m);
		}
	}

}
