package ru.netology.domain;

public class Radio {

    private int currentRadioNumber = 5;
    private int maxRadioNumber = 9;
    private int minRadioNumber = 0;

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public Radio() { }

    public Radio(int countRadioNumber, int currentRadioNumber) {
        this.currentRadioNumber = currentRadioNumber;
        this.maxRadioNumber = minRadioNumber + countRadioNumber - 1;

    }

    public void nextRadioNumber() {
        if (currentRadioNumber < maxRadioNumber) {
            currentRadioNumber = currentRadioNumber + 1;
        } else
            currentRadioNumber = minRadioNumber;
    }

    public  void prevRadioNumber() {
        if (currentRadioNumber > minRadioNumber) {
            currentRadioNumber = currentRadioNumber - 1;
        } else
            currentRadioNumber = maxRadioNumber;
    }
}
