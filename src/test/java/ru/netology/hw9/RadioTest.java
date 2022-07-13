package ru.netology.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    //звука громкость
    @Test
    //текущая громкость
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(14);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-4);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio();

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);

    }

    // Прибавление и уменьшение громкости
    @Test
    public void shoulSetToVolumePlus() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 6;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetToVolumeMinus() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 4;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVoidAfterMaxPlus() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.SetVolumeAfterMaxPlus();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetVoidAfterMinMinus() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.SetVolumeAfterMinMinus();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVoidAfterMinMinus2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-3);

        int expected = 0;
        int actual = radio.SetVolumeAfterMinMinus();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetVolumeAfterMaxPlus2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.SetVolumeAfterMaxPlus();

        Assertions.assertEquals(expected, actual);
    }

    //радио


    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(14);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-4);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation() {
        Radio radio = new Radio();

        radio.setToMaxRadioStation();

        int expected = 9;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetToMinRadioStation() {
        Radio radio = new Radio();

        radio.setToMinStation();

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulSetToRadioStationPlus() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 6;
        int actual = radio.increaseRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulSetToRadioStationMinus() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 4;
        int actual = radio.decreaseRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(50);

        int expected = 0;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoualdpref() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 9;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldpref2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(50);

        int expected = 9;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldnext3() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }
}