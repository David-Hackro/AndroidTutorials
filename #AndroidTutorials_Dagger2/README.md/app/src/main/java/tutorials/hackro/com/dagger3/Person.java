package tutorials.hackro.com.dagger3;

/**
 * Created by hackro on 9/02/17.
 */
public class Person {

    private String name;
    private String nickName;
    private int age;


    public Person(String name, String nickName, int age) {
        this.name = name;
        this.nickName = nickName;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                '}';
    }
}
