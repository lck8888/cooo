package model;
import java.sql.Timestamp;

public class look {
    private String username;
    private String name;
    private Timestamp looktimes;

    // Getter 和 Setter 方法
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getLooktimes() {
        return looktimes;
    }

    public void setLooktimes(Timestamp looktimes) {
        this.looktimes = looktimes;
    }
}
