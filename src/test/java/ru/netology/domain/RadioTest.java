package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

//    Radio radio = new Radio(5, 3);
    Radio radio = new Radio();
    Radio radio1 = new Radio(5, 4);
    Radio radio2 = new Radio(5, 0);
    Volume volume = new Volume();
    Volume volume1 = new Volume(100);
    Volume volume2 = new Volume(0);


    @Test
    void nextRadioNumber() {

//        radio.nextRadioNumber();
 //       int actual = radio.getCurrentRadioNumber();
//        assertEquals(4, actual);

        radio.nextRadioNumber();
        int actual2 = radio.getCurrentRadioNumber();
        assertEquals(6, actual2);

        radio1.nextRadioNumber();
        int actual3 = radio1.getCurrentRadioNumber();
        assertEquals(0, actual3);
    }

    @Test
    void prevRadioNumber() {

//        radio.prevRadioNumber();
//        int actual = radio.getCurrentRadioNumber();
//        assertEquals(2, actual);

        radio.prevRadioNumber();
        int actual2 = radio.getCurrentRadioNumber();
        assertEquals(4, actual2);

        radio2.prevRadioNumber();
        int actual4 = radio2.getCurrentRadioNumber();
        assertEquals(4, actual4);
    }

    @Test
    void increaseVolume() {
        volume.increaseVolume();
        int actual5 = volume.getCurrentVolume();
        assertEquals(78, actual5);

        volume1.increaseVolume();
        int actual7 = volume1.getCurrentVolume();
        assertEquals(100, actual7);



    }

    @Test
    void decreaseVolume() {
        volume.decreaseVolume();
        int actual6 = volume.getCurrentVolume();
        assertEquals(76, actual6);

        volume2.decreaseVolume();
        int actual8 = volume2.getCurrentVolume();
        assertEquals(0, actual8);
    }
}