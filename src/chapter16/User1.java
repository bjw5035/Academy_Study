package chapter16;

import java.io.Serializable;

public class User1 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private transient String passwd;
    private int age;
    private String name;

    public User1() {

    }
    public User1(String id, String passwd, int age, String name) {
        super();
        this.id = id;
        this.passwd = passwd;
        this.age = age;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getPasswd() {
        return passwd;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
