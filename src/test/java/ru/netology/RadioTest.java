package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //constructor

    @Test

    public void overMinStationConstructor() {
        Radio radio = new Radio (10, 0, 0, 0, 0, 0);
        radio.reduceStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test

    public void overMaxStationConstructor() {
        Radio radio = new Radio (10, 0, 11, 0, 0, 0);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void overMaxVolumeConstructor() {
        Radio radio = new Radio (0, 0, 0, 100, 0, 101);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldGetAndSet() {
        Radio radio = new Radio();
        String expected = "Rad";

        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void increaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.increaseStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void increaseStationMaxValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void reduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.reduceStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void reduceStationMinValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.reduceStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeMaxValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void reduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.reduceVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void reduceVolumeMinValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}

