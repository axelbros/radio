package ru.netology;

public class Radio {
    private int numberRadiostation;
    private int numberRadiostationMax = 10;
    private int numberRadiostationMin = 0;
    private int volume;
    private int volumeMax = 100;
    private int volumeMin = 0;

    public Radio() {
    }

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

    public int getNumberRadiostation() {
        return numberRadiostation;
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

    public int getNumberRadiostationMax() {
        return numberRadiostationMax;
    }

    public void setNumberRadiostationMax(int numberRadiostationMax) {
        this.numberRadiostationMax = numberRadiostationMax;
    }

    public int getNumberRadiostationMin() {
        return numberRadiostationMin;
    }

    public void setNumberRadiostationMin(int numberRadiostationMin) {
        this.numberRadiostationMin = numberRadiostationMin;
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

    public int getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public int getVolumeMin() {
        return volumeMin;
    }

    public void setVolumeMin(int volumeMin) {
        this.volumeMin = volumeMin;
    }

}



