package model.dto;

public class CustomerDTO {
    private String costomerID;
    private String name;
    private int age;
    private String phoneNo;
    private String address;

    public CustomerDTO(String c001, String johnDoe, String s, String s1) {

    }

    public String getCostomerID() {
        return costomerID;
    }

    public void setCostomerID(String costomerID) {
        this.costomerID = costomerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "costomerID='" + costomerID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
