package com.github.ismail2ov;

public record CarRecord(String regNumber, String owner) {

    public static final String LICENSE_PLATE_LETTERS = "MDG";

    public boolean isNewCar() {
        return regNumber().substring(3, 3).equals(LICENSE_PLATE_LETTERS);
    }

}
