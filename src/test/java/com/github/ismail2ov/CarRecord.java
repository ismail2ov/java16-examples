package com.github.ismail2ov;

public record CarRecord(String regNumber, String owner) {

    public boolean isNewCar() {
        return regNumber().substring(3, 3).equals("MDG");
    }

}
