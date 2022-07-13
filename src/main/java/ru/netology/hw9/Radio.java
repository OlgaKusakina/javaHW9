package ru.netology.hw9;

public class Radio {

    public int currentVolume;
    public int maxVolume = 10;
    public int minVolume = 0;
    public int maxRadioStation = 9;
    public int minRadioStation = 0;
    public int currentRadioStation;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int SetVolumeAfterMaxPlus() {
        if (currentVolume >= 10) {
            currentVolume = maxVolume;
        }
        return currentVolume;

    }

    public int SetVolumeAfterMinMinus() {
        if (currentVolume <= 0) {
            currentVolume = minVolume;
        }
        return currentVolume;
    } //Радио

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = 9;
    }

    public void setToMinStation() {
        currentVolume = 0;
    }

    public int increaseRadioStation() {
        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        return currentRadioStation;

    }

    public int decreaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation - 1;
        }
        return currentRadioStation;
    }

    public int next() {
        currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = minRadioStation;
        }
        return minRadioStation;
    }


    public int prev() {

        currentRadioStation = currentRadioStation - 1;

        if (currentRadioStation == -1) {
            currentRadioStation = maxRadioStation;

        }
        return maxRadioStation;
    }
}