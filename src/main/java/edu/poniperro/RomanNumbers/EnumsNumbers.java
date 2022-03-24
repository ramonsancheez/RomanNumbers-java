package edu.poniperro.RomanNumbers;

public enum EnumsNumbers {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000),
    IV(-2),
    IX(-2),
    XL(-20),
    XC(-20),
    CD(-200),
    CM(-200);

    public int value;

    private EnumsNumbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

