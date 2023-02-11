package cn.mycloudway.project;

public class User {
    private String username;
    private String password;
    private String id;
    private String phone;

    public User() {
    }

    public User(String username, String password, String id, String phone) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
