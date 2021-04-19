package ru.netology;

public class Radio {
    private String name;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void reduceStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume >= 0) {
            setCurrentVolume(currentVolume + 1);
        }

    }

    public void reduceVolume() {
        if (currentVolume >= 0) {
            setCurrentVolume(currentVolume - 1);
        }

    }
}
