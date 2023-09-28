package com.github.ismail2ov;

public record CarRecord(String regNumber, String owner) {

    public static final String LICENSE_PLATE_LETTERS = "MDG";

    public CarRecord(String regNumber, String owner) {
        if (regNumber.length() != 7) {
            throw new IllegalArgumentException("regNumber must be 7 characters");
        }
        this.regNumber = regNumber;
        this.owner = owner;
    }

    public static CarRecord createBlankCarRecord() {
        return new CarRecord("", "");
    }

    public boolean isNewCar() {
        return regNumber().substring(3, 3).equals(LICENSE_PLATE_LETTERS);
    }

}
