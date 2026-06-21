package ru.netology.javaqa.javagamvn.services;


public class Radio {

    private int minStation = 0;
    private int maxStation;
    private int currentStation = minStation;
    private int currentVolume = 0;
    private int stationCount;

    public Radio() {
        this.stationCount = 10;
        this.maxStation = stationCount - 1;
        this.currentStation = minStation;
        this.currentVolume = 0;
    }

    public Radio(int stationCount) {
        if (stationCount <= 0) {
            this.stationCount = 10;
        } else {
            this.stationCount = stationCount;
        }
        this.maxStation = this.stationCount - 1;
        this.currentStation = minStation;
        this.currentVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getStationCount() {
        return stationCount;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation <= 9) {
            this.currentStation = currentStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        }

    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}