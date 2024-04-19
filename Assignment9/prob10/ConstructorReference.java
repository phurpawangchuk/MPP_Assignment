package Assignment9.prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}

	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};

    List<Human> humanList = Arrays.asList(list);
    // Query 1  : Print only Female canditates names
	List<String> result = humanList.stream()
                    .filter(h ->h.getGender().equals("Female"))
                    .map(n->n.getName())
                    .collect(Collectors.toList());
    System.out.println(result);

    // Query 2 : Create an object by choosing suitable Interface to the specified constructors(
    // Totally 3 constuctors)using
    // fouth type of Method Reference ClassName::new. Then print the object status

    Function<String,Human> human = Human::new;
    System.out.println(human.apply("Alice"));

    BiFunction<String,Integer, Human> human1 = Human::new;
    System.out.println(human1.apply("Alice", 35));

    TriFunction<String, Integer, String, Human> human2 = Human::new;
    System.out.println(human2.apply("Bob", 32, "Male"));

	// Query 3 : Count the male candidates whose age is more than 30
    int count = (int) humanList.stream()
            .filter(c -> c.getGender().equals("Male"))
            .filter(h ->h.getAge()>30)
            .count();
    System.out.println("Male count: "+count);
    
    
   }


}
