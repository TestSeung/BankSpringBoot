package Bank;

public class Customer {
    private static int serialNumber;

    private String name;
    private int age;
    private int myNumber;


    private int wallet;
    private BankName bankName;
    private Banking banking;

    //입금
    public int deposit(int money) {
        this.wallet -= money;
        return money;
    }

    //출금
    public int withdraw(int money) {
        this.wallet += money;
        return money;
    }
    //송금
//    public void Remittance(int money) {
//        this.money -= money;
//    }

    public Customer(String name, int age, int wallet, BankName bankName) {
        this.myNumber = serialNumber++;
        this.name = name;
        this.age = age;
        this.bankName = bankName;
        this.wallet = wallet;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public BankName getBankName() {
        return bankName;
    }

    public Banking getBanking() {
        return banking;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "MyNumber= " + myNumber +
                " name='" + name + '\'' +
                ", age=" + age +
                ", wallet=" + wallet +
                ", bankName=" + bankName +
                "}\n";
    }
}
