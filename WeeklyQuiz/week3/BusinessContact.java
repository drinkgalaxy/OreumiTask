package chapter10;

public class BusinessContact extends Contact{
    private String company;

    BusinessContact(String name, String phoneNumber, String company) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setCompany(company);
    };

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return String.format("%s, 회사명: %s", super.toString(), company);
    }
}
