package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void createRadio() {
        Radio radio = new Radio();
    }

    Radio radio = new Radio();
    String expected = "Rad";

    assertNull(radio.getName());
    radio.setName(expected);

    assertEquals(expected, radio.getName());
}