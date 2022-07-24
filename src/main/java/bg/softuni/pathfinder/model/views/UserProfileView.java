package bg.softuni.pathfinder.model.views;

import bg.softuni.pathfinder.model.entity.enums.LevelEnum;

public class UserProfileView {
    private String username;

    private String email;

    private String fullName;

    private int age;

    private String level;

    public UserProfileView(String username, String email, String fullName, int age, String level) {
        this.username = username;
        this.email = email;
        this.fullName = fullName;
        this.age = age;
        this.level = level;
    }

    public UserProfileView() {

    }

    public String getUsername() {
        return username;
    }

    public UserProfileView setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserProfileView setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UserProfileView setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserProfileView setAge(int age) {
        this.age = age;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public UserProfileView setLevel(String level) {
        this.level = level;
        return this;
    }
}
