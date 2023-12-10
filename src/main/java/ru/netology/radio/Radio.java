package ru.netology.radio;

public class Radio {
    private int currentChannel;
    private int maxChannel;

    public Radio() {
        maxChannel = 9;

    }

    public Radio(int channelCount) {
        maxChannel = channelCount - 1;

    }


    public void next() {
        if (currentChannel != maxChannel) {
            currentChannel = currentChannel + 1;
        }
        else {
            currentChannel = 0;
        }
    }

    public void prev() {
        if (currentChannel != 0) {
            currentChannel = currentChannel - 1;
        }
        else {
            currentChannel = maxChannel;
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0) {
            return;
        }
        if (newCurrentChannel > maxChannel) {
            return;
        }
        currentChannel = newCurrentChannel;
    }


    private int currentVolume;

    private int maximumVolume;
    public int minVolume = 0;
    public int maxVolume = 100;




    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        else {
            currentVolume = maxVolume;
        }

    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        else {
            currentVolume = minVolume;
        }

    }

}
