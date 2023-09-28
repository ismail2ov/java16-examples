package com.github.ismail2ov;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RecordsTest {

    @Test
    void testClassAndRecord() {
        String regNumber = "4794YBK";
        String name = "John Doe";

        // Regular class
        Car car = new Car(regNumber, name);

        // Using a record
        CarRecord carRecord = new CarRecord(regNumber, name);

        assertThat(carRecord.toString()).isNotEqualTo(car.toString());
        assertThat(carRecord.regNumber()).isEqualTo(car.getRegNumber());
        assertThat(carRecord.owner()).isEqualTo(car.getOwner());

        assertThat(carRecord.isNewCar()).isFalse();
    }

    @Test
    void testRecordWithInstanceMethod() {
        String regNumber = "4794YBK";
        String name = "John Doe";

        CarRecord carRecord = new CarRecord(regNumber, name);

        assertThat(carRecord.isNewCar()).isFalse();
    }
}
