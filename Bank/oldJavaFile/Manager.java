package Bank;

import java.util.List;

public class Manager extends BankSystem {

//    private String name;
//    private int age;
//    private Banking service;

    public void service(Customer customer, Banking service) {
        if (service == Banking.CHECK) {
            accounts.get(customer);
            System.out.println(customer.getName() + "님 계좌 조회 :" + super.accounts.get(customer) + "원입니다.");
        }
    }

    public void service(Customer customer, Banking service, int money) {

        if (service == Banking.DEPOSIT) {
            if (money > customer.getWallet()) {
                System.out.println("갖고계신 돈보다 많은 금액을 입력하였습니다.");
            } else {
                accounts.put(customer, accounts.get(customer) + money);
                System.out.println(customer.getName() + "님의 계좌에 " + money + "원 입금 완료하였습니다.");
                customer.deposit(money);
            }

        } else if (service == Banking.WITHDRAW) {
            if (accounts.get(customer) < money) {
                System.out.println("계좌에 금액이 부족하여 출금요청이 취소되었습니다.");
            } else {
                System.out.println(customer.getName() + "님이 " + money + "원 이체하였습니다.");
                accounts.put(customer, accounts.get(customer) - money);
                customer.withdraw(money);
            }
        }
    }

    //transactional
    public void service(Customer customer, Banking service, int money, Customer target) {
        if (service == Banking.REMITTANCE) {
            if (accounts.get(customer) < money) {
                System.out.println("계좌에 금액이 부족하여 출금요청이 취소되었습니다.");
            } else {
                System.out.println(customer.getName() + "님이 " + target.getName() + "님께 " + money + "원 송금완료했습니다.");// 0번 한테 있는 돈 송금
                accounts.put(target, accounts.get(target) + money); // 타겟에 입금
                accounts.put(customer, accounts.get(customer) - money); // 본인계좌에서 이체
            }
        }
    }

    public void safeInfo() {
        for (Customer customer : super.accounts.keySet()) {
            System.out.println(customer.getName() + "님의 계좌: " + accounts.get(customer) + "원");
        }
    }
}
