//class Person với những thuộc tính sẽ sử dụng lại cho các class khác (kế thừa tránh lặp code)

public class Person {
    private Integer id;
    private String fullName;
    private String address;

    public Person() {}

    public Person(Integer id, String fullName, String address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //In thông tin thuộc tính của class
    public void printInfo() {
        System.out.println("Id: " + getId());
        System.out.println("Full name: " + getFullName());
        System.out.println("Address: " + getAddress());
    }
}
