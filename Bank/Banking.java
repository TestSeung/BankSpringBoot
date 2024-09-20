package Bank;

public enum Banking {
    DEPOSIT("입금"),
    WITHDRAW("출금"),
    REMITTANCE("송금"),
    CHECK("조회");

    //instance 이다.

    private final String korean; //final로 정의

    Banking(String korean) {
        this.korean = korean;
    }
    public String getKorean() {
        return korean;
    }
}
