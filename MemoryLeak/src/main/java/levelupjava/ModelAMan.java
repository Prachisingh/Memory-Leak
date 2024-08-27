package levelupjava;

import org.example.Person;

public class ModelAMan {

    public static void main(String[] args) {
        Person person1 = new Person("Prachi", "Singh", 35);
        Person person2 = new Person("Ankit", "Singh", 55);
        Person person3 = new Person("Babu", "Singh", 34);
        Person person4 = new Person("Mamma", "Singh", 63);
        person3.introduce();
    }
}
