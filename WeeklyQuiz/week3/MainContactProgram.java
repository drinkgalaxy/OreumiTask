package chapter10;

import java.util.Scanner;

public class MainContactProgram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // auto closing
            AddressBook addressBook = new AddressBook(); // 객체가 생성되면서 리스트가 만들어짐
            String name;
            String phoneNumber;

            while (true) {
                System.out.println("<안녕하세요! 연락처 관리 프로그램입니다. 이용을 원하는 서비스 메뉴 번호를 입력해주세요.>");
                System.out.println("""
                    1. 비즈니스 연락처 추가
                    2. 개인 연락처 추가
                    3. 연락처 출력
                    4. 연락처 검색
                    5. 종료
                    메뉴를 선택해주세요: 
                    """);

                String number = sc.next();
//            switch (number) {
//                case 1:
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    break;
//                default:
//                System.out.println("올바른 번호를 입력해주세요(1~5)");
//            }

                if (number.equals("1")) {
                    System.out.println("----------1번 메뉴 : 비즈니스 연락처 추가----------");
                    System.out.print("이름을 입력하세요: ");
                    name = sc.next();
                    System.out.print("전화번호를 입력하세요: ");
                    phoneNumber = sc.next();
                    System.out.print("회사명을 입력하세요: ");
                    String company = sc.next();
                    System.out.println("-----------------------------------------------");
                    BusinessContact businessContact = new BusinessContact(name, phoneNumber, company);
                    addressBook.contacts.add(businessContact);
                } else if (number.equals("2")) {
                    System.out.println("----------2번 메뉴 : 개인 연락처 추가----------");
                    System.out.print("이름을 입력하세요: ");
                    name = sc.next();
                    System.out.print("전화번호를 입력하세요: ");
                    phoneNumber = sc.next();
                    System.out.print("관계를 입력하세요: ");
                    String relationship = sc.next();
                    PersonalContact personalContact = new PersonalContact(name, phoneNumber, relationship);
                    addressBook.contacts.add(personalContact);

                    System.out.println("-----------------------------------------------");
                } else if (number.equals("3")) {
                    addressBook.displayContacts();
                } else if (number.equals("4")) {
                    addressBook.searchContact();
                } else if (number.equals("5")) {
                    System.out.println("<연락처 관리 프로그램을 종료합니다. 이용해주셔서 감사합니다.>");
                    break;
                } else {
                    System.out.println("\n!!!!! 입력오류 !!!!!");
                    System.out.println("!!!!! 메뉴에 있는 번호를 정확하게 입력해주세요. !!!!!\n");
                    System.out.println("..... 메뉴 선택 화면으로 돌아갑니다 .....\n");
                }
            }
        }
    }
}
