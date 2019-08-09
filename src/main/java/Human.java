import java.util.*;

public class Human {
    String name;

    String town;
    String  gender;
    int age;

    public Human(String name,  String town, String gender, int age) {
        this.name = name;

        this.town = town;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", town='" + town + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }
    public void findPerson(String personName, List<Human> humanList){
       for(Human item: humanList){
           if(item.name.equalsIgnoreCase(personName)){
               System.out.println(item);
           }
       }

    }

    public static void main(String[] args) {
        List<Human> myList = new ArrayList<>();
        Human h1 = new Human("Tom","Prague","m",28);
        Human h2 = new Human("Jack","London","m",28);
        Human h3 = new Human("Mark","Rome","m",28);
        Human h4 = new Human("Alice","Odessa","f",28);
        Collections.addAll(myList,h1,h2,h3,h4);
        h1.findPerson("tom",myList);

    }
}
