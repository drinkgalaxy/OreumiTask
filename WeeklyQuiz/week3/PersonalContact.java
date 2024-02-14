package chapter10;

public class PersonalContact extends Contact {
    private String relationship;
    PersonalContact(String name, String phoneNumber, String relationship) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setRelationship(relationship);
    }
    public String getRelationship() {
        return relationship;
    }
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return String.format("%s, 관계: %s", super.toString(), relationship);
    }
}
