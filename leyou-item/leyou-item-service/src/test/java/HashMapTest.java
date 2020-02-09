import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {

        Person1 person = new Person1();
        Person1 person1 = new Person1();
        Person1 person2 = new Person1();
        person.setId(1);
        person1.setId(2);
        person2.setId(1);

        HashMap hashMap = new HashMap();

        hashMap.put(person1,"2");
        hashMap.put(person2,"3");
        hashMap.put(person,"4");
        //key是一定唯一的
        System.out.println(hashMap.toString());
        System.out.println(hashMap.get(person));
        System.out.println(hashMap.get(person2));

    }
}
