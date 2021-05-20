package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int numberRadiostation;
    private int numberRadiostationMax = 10;
    private int numberRadiostationMin = 0;
    private int volume;
    private int volumeMax = 100;
    private int volumeMin = 0;



    public Radio(int numberRadiostationMax) {
        this.numberRadiostationMax = numberRadiostationMax;
    }



    public void increaseRadiaStation() {
        if (numberRadiostation == numberRadiostationMax) {
            numberRadiostation = numberRadiostationMin;
            return;
        }
        numberRadiostation++;
    }

    public void decreaseRadiostation() {
        if (numberRadiostation == numberRadiostationMin) {
            numberRadiostation = numberRadiostationMax;
            return;
        }
        numberRadiostation--;
    }

    public void increaseVolume() {
        if (volume < volumeMax) {
            volume++;
        }

    }

    public void decreaseVolume() {
        if (volume > volumeMin) {
            volume--;
        }

    }


    public void setNumberRadiostation(int numberRadiostation) {
        if (numberRadiostation > numberRadiostationMax) {
            this.numberRadiostation = numberRadiostationMax;
            return;
        }
        if (numberRadiostation < numberRadiostationMin) {
            this.numberRadiostation = numberRadiostationMin;
            return;
        }
        this.numberRadiostation = numberRadiostation;
    }





    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > volumeMax) {
            this.volume = volumeMax;
            return;
        }
        if (volume < volumeMin) {
            this.volume = volumeMin;
            return;
        }
        this.volume = volume;
    }


}



