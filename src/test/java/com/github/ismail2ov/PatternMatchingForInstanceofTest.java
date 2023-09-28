package com.github.ismail2ov;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PatternMatchingForInstanceofTest {

    @Test
    void testPatternMatchingForInstanceof() {
        
        assertThat(patternMatchingForInstanceof(5)).isEqualTo(processData(5));
        assertThat(patternMatchingForInstanceof("Java")).isEqualTo(processData("Java"));
        assertThat(patternMatchingForInstanceof("Hello World")).isEqualTo(processData("Hello World"));
    }

    private Object processData(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            if (s.length() > 5) {
                return s.toUpperCase();
            }
        } else if (obj instanceof Integer) {
            Integer i = (Integer) obj;
            return i * i;
        }
        return obj;
    }

    private Object patternMatchingForInstanceof(Object obj) {
        if (obj instanceof String s && s.length() > 5) {
            return s.toUpperCase();
        } else if (obj instanceof Integer i) {
            return i * i;
        }
        return obj;
    }
}
