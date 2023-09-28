package com.github.ismail2ov;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RecordsTest {

    public static final String REG_NUMBER = "4794YBK";
    public static final String JOHN_DOE = "John Doe";
    private static Car car;
    private static CarRecord carRecord;

    @BeforeAll
    static void beforeAll() {

        // Regular class
        car = new Car(REG_NUMBER, JOHN_DOE);

        // Using a record
        carRecord = new CarRecord(REG_NUMBER, JOHN_DOE);
    }

    @Test
    void testClassAndRecord() {
        assertThat(carRecord.toString()).isNotEqualTo(car.toString());
        assertThat(carRecord.regNumber()).isEqualTo(car.getRegNumber());
        assertThat(carRecord.owner()).isEqualTo(car.getOwner());

        assertThat(carRecord.isNewCar()).isFalse();
    }

    @Test
    void testRecordWithInstanceMethod() {

        assertThat(carRecord.isNewCar()).isFalse();
    }
}
