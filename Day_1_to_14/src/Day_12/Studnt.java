package serialization;

import java.io.Serializable;

public class Studnt implements Serializable {
    private static final long serialVersionUID = 1L; 

    String username;
    String email;
    int age;     
    float height; 

    public Studnt(String username,String email,int age,float height) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.height = height;
    }

   
}
