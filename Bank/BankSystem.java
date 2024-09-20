package Bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankSystem {
    protected Map<Customer,Integer> accounts =new HashMap<>(); //변수명 중요

    public void createBankSystemDB(List<Customer> customers){
        for(Customer customer : customers){
            accounts.put(customer,100000); //100000 시작
        }

    }
}
