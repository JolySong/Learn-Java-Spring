package cn.iomc;

public class UserService {

    private String username;


    public void sailHello() {
        System.out.println("Hello, " + this.username);
    }

    public UserService(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
