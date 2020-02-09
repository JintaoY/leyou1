import java.util.HashMap;

public class HashMapDemo{
    public static void main(String[] args) {
        //demo01();
        demo02();



    }
 
    private static void demo02() {
        Person p = new Person("AAA",2);
        Person p2 = new Person("BBB",5);
        HashMap<Person,String> hashMap = new HashMap<Person,String>();
        hashMap.put(p, "1111");
        hashMap.put(p2, "2222");
        System.out.println("初始化=================================>" + hashMap);
        int initHashCode = p2.hashCode();
        System.out.println("初始化时,p2的hashcode===================>" + initHashCode);
        hashMap.put(p2, "3333");
        System.out.println("添加key=p2(hashcode未改变),value=3333后=>" + hashMap);
        p2.age = 15;
        int changedHashCode = p2.hashCode();
        System.out.println("age发生改变后,p2的hashCode==============>" + changedHashCode);
        hashMap.put(p2, "4444");
        System.out.println("添加key=p2(hashcode改变),value=4444后===>" + hashMap);
 
		/*
		 * 初始化=================================>{Person[AAA, 2]=1111, Person[BBB, 5]=2222}
            初始化时,p2的hashcode===================>66654
            添加key=p2(hashcode未改变),value=3333后=>{Person[AAA, 2]=1111, Person[BBB, 5]=3333}
            age发生改变后,p2的hashCode==============>66964
            添加key=p2(hashcode改变),value=4444后===>{Person[AAA, 2]=1111, Person[BBB, 15]=4444, Person[BBB, 15]=3333}
		 */
    }
 
    private static void demo01() {
        Person p = new Person("AAA",2);
        Person p2 = new Person("BBB",5);
        HashMap<String, Person> hashMap = new HashMap<String,Person>();
        hashMap.put("1111", p);
        hashMap.put("2222", p2);
        System.out.println("初始化时====================>" + hashMap);
        hashMap.put("3333", p);
        System.out.println("添加key=3333,value=p(未改变)=>" + hashMap);
        p.age = 10;
        hashMap.put("1111", p);
        System.out.println("添加key=1111,value=p(改变)==>" + hashMap);
		/*
		 * 初始化时====================>{1111=Person[AAA, 2], 2222=Person[BBB, 5]}
        添加key=3333,value=p(未改变)=>{1111=Person[AAA, 2], 2222=Person[BBB, 5], 3333=Person[AAA, 2]}
        添加key=1111,value=p(改变)==>{1111=Person[AAA, 10], 2222=Person[BBB, 5], 3333=Person[AAA, 10]}
		 */
    }
}
 
class Person {
    String name;
    int age;
 
    public Person() {}
 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
 
 
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
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
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Person[" +  this.name  + ", "  +this.age    +"]";
    }
 
 
}
