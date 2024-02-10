package chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public List<Contact> contacts = new ArrayList<>();
    public void displayContacts() {
        System.out.println("----------3번 메뉴 : 연락처 출력----------");
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다\n");
            System.out.println("..... 메뉴 선택 화면으로 돌아갑니다 .....\n");
        }
        for (Contact contact : contacts) {
            System.out.println(contact.getName()+", "+contact.getPhoneNumber());
        }
        System.out.println("-----------------------------------------------");
    }
    public void searchContact() {
        System.out.println("----------4번 메뉴 : 연락처 검색----------");
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 이름을 입력하세요: ");
        String findname = sc.next();

        for (Contact contact : contacts) {
            if (contact.getName().equals(findname)) {
                System.out.println(contact.getName()+", "+contact.getPhoneNumber());
                return;
            }
        }
        System.out.println("연락처를 찾을 수 없습니다.\n");
        System.out.println("..... 메뉴 선택 화면으로 돌아갑니다 .....\n");
        System.out.println("-----------------------------------------------");
    }
}
