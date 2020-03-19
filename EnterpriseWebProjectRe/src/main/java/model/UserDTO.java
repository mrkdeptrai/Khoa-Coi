package model;


public class UserDTO extends AbstractModel{

    private String email;
    private String password;
    private String name;
    private String dob;
    private String gender;
    private int phone;
    private String address;
    private String avatar;

    public UserDTO(int id, String email, String password, String name, String dob, String gender, int phone, String address, String avatar, String createdAt, String updatedAt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.avatar = avatar;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UserDTO(String email, String password, String name, String dob, String gender, int phone, String address, String avatar, String createdAt, String updatedAt) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.avatar = avatar;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
