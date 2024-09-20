package Bank;

public enum BankName {
    IBK("국민은행"),
    SHINHAN("신한은행"),
    HANA("하나은행"),
    WOORI("우리은행");

    //instance 이다.

    private final String korean; //final로 정의

    BankName(String korean) {
        this.korean = korean;
    }
    public String getKorean() {
        return korean;
    }
}
