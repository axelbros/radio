package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {
    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    }

    @Test
    public void shouldInitFieldToZeroValues() {
        Radio radio = new Radio();
        assertEquals(0, radio.getNumberRadiostation());
        assertEquals(9, radio.getNumberRadiostationMax());
        assertEquals(0, radio.getNumberRadiostationMin());
        assertEquals(0, radio.getVolume());
        assertEquals(10, radio.getVolumeMax());
        assertEquals(0, radio.getVolumeMin());
    }

    @Test
    public void setFromController() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(1);
        assertEquals(1, radio.getNumberRadiostation());
        radio.setNumberRadiostation(2);
        assertEquals(2, radio.getNumberRadiostation());
        radio.setNumberRadiostation(3);
        assertEquals(3, radio.getNumberRadiostation());
        radio.setNumberRadiostation(4);
        assertEquals(4, radio.getNumberRadiostation());
        radio.setNumberRadiostation(5);
        assertEquals(5, radio.getNumberRadiostation());
        radio.setNumberRadiostation(6);
        assertEquals(6, radio.getNumberRadiostation());
        radio.setNumberRadiostation(7);
        assertEquals(7, radio.getNumberRadiostation());
        radio.setNumberRadiostation(8);
        assertEquals(8, radio.getNumberRadiostation());
        radio.setNumberRadiostation(9);
        assertEquals(9, radio.getNumberRadiostation());

    }

    @Test
    public void increaseRadiostation() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(4);
        radio.increaseRadiaStation();
        assertEquals(5, radio.getNumberRadiostation());
    }

    @Test
    public void decreaseRadioStation() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(7);
        radio.decreaseRadiostation();
        assertEquals(6, radio.getNumberRadiostation());
    }

    @Test
    public void decreaseLimitNumberRadioStation() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(0);
        radio.decreaseRadiostation();
        assertEquals(9, radio.getNumberRadiostation());
    }

    @Test
    public void increaseLimitNumberRadioStation() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(9);
        radio.increaseRadiaStation();
        assertEquals(0, radio.getNumberRadiostation());
    }

    @Test
    public void MaximumRadiostation() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(32);
        assertEquals(9, radio.getNumberRadiostation());
    }

    @Test
    public void MinimumRadiostation() {
        Radio radio = new Radio();
        radio.setNumberRadiostation(-8);
        assertEquals(0, radio.getNumberRadiostation());
    }

    @Test
    public void increaseLimitVolume() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void decreaseLimitVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(8);
        radio.decreaseVolume();
        assertEquals(7, radio.getVolume());
    }

    @Test
    public void MaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(13);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void MinVolume() {
        Radio radio = new Radio();
        radio.setVolume(-3);
        assertEquals(0, radio.getVolume());
    }
}