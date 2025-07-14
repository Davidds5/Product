package application;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;


    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Client(){
    }
    public Client(String name, String email, Date birthDate ){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public String toString(){
        return String.format("Client: %s | Email: %s | Birth Date: %s",
                name, email, sdf.format(birthDate));    }
}
