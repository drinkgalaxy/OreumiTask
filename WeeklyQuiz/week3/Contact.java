package chapter10;

public class Contact {
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 전화번호: %s", name, phoneNumber);
    }
}

