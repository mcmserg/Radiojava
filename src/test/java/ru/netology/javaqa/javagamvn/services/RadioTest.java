package ru.netology.javaqa.javagamvn.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {



    @Test
    void testDefaultConstructor() { //тест начальных значений
        Radio radio = new Radio();
        assertEquals(10, radio.getStationCount());
        assertEquals(0, radio.getMinStation());
        assertEquals(9, radio.getMaxStation());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testConstructorWithValidStationCount() { //Тест возможно допустимых станций
        Radio radio = new Radio(15);
        assertEquals(15, radio.getStationCount());
        assertEquals(0, radio.getMinStation());
        assertEquals(14, radio.getMaxStation());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testConstructorWithZeroStationCount() { //тестов с нулевым количеством станций
        Radio radio = new Radio(0);
        assertEquals(10, radio.getStationCount());
        assertEquals(0, radio.getMinStation());
        assertEquals(9, radio.getMaxStation());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    void SetCurrentStation() { //тест Установить текущую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void SetCurrentStationMin() { // Тест минимальной станции радио
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void SetCurrentStationMax() { // Тест макс станции радио
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void SetCurrentStationErrorMax() { // Тест на несуществующую станцию 10.
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void SetCurrentStationErrorMin() { // Тест на несуществующую станцию -1.
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void SetNextRadio() { // Переключение станции далее NEXT
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void SetNextMaxRadio() { // Переключение станции далее NEXT
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void SetPrevStationRadio() { // Переключение станции назад
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void SetPrevMinStationRadio() { // Переключение станции назад с 0 на 9
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() { //тест Установить заданную громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentMaxTestVolume() { //тест установки максимальной громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentMinTestVolume() { //тест установки минимальной громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentMaxVolume() { //тест Установки больше максимальную громкость
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentMinVolume() { //тест Установки меньше минимальной громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentIncreaseVolume() { //тест увеличения звука
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentIncreaseMaxVolume() { //тест увеличения максимального звука
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentDecreaseVolume() { //тест уменьшения звука
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        radio.decreaseVolume();
        int expected = 29;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentDecreaseMinVolume() { //тест уменьшения звука
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}