package Bank;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


//enum
//다른사람과 계좌거래기능 spring boot
//상속) 고객등급추가
// 조회기능으로 db데이터 훔치기

//1. 만들던 기능 완성 (사용자 계좌끼리 이체도 가능하도록)
//2. 사용자 계좌에 어떤 계좌인지의 type을 Enum으로 설정
//3. api를 통해서 postman으로 요청을 보내면 기존에 만들어둔 함수들이 실행되도록(입금, 출금, 조회, 이체 등)

//

public class BankSimulator {
    public static void main(String[] args) {
        System.out.println("영업 시작\n");
        //BankSystem bankSystem = new BankSystem();
        Manager manager = new Manager();

        //대기
        List<Customer> customers = Arrays.asList(
                new Customer("Park", 21,10000,BankName.WOORI),
                new Customer("Kim", 20,10000,BankName.IBK),
                new Customer("Lee", 22,20000,BankName.SHINHAN)
                );
        //고객 목록 저장

        manager.createBankSystemDB(customers);

        System.out.println("------------------소지금액------------------");
        for(Customer customer : customers) {
            System.out.println(customer.getName()+"님의 소지한 금액: "+customer.getWallet()+"원");
        }
        System.out.println();
        //입금
        System.out.println("------------------서비스 처리------------------");
        manager.service(customers.get(0),Banking.DEPOSIT,10000); //park
        manager.service(customers.get(1),Banking.WITHDRAW,10000); //kim
        manager.service(customers.get(2),Banking.REMITTANCE,20000,customers.get(0)); //lee
        manager.service(customers.get(2),Banking.DEPOSIT,20000);
        manager.service(customers.get(2),Banking.CHECK); //lee
        System.out.println();

        System.out.println("------------------정산------------------");
        manager.safeInfo();
        System.out.println();

        System.out.println("------------------소지금액------------------");
        for(Customer customer : customers) {
            System.out.println(customer.getName()+"님의 소지한 금액: "+customer.getWallet()+"원");
        }
        System.out.println();
        System.out.println("영업 종료");
    }
}
