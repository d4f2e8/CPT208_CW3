/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author ren
 */
public class Hotel {
    private String hotelImg;
    private String name;
    private String address;
    private int favorableRate;
    // single room
    private String room1Img;
    private int room1Num;
    // double room
    private String room2Img;
    private int room2Num;
    // standard room
    private String room3Img;
    private int room3Num;

    public Hotel(String hotelImg, String name, String address, int favorableRate, String room1Img, int room1Num, String room2Img, int room2Num, String room3Img, int room3Num) {
        this.hotelImg = hotelImg;
        this.name = name;
        this.address = address;
        this.favorableRate = favorableRate;
        this.room1Img = room1Img;
        this.room1Num = room1Num;
        this.room2Img = room2Img;
        this.room2Num = room2Num;
        this.room3Img = room3Img;
        this.room3Num = room3Num;
    }

    public String getHotelImg() {
        return hotelImg;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getFavorableRate() {
        return favorableRate;
    }

    public String getRoom1Img() {
        return room1Img;
    }

    public int getRoom1Num() {
        return room1Num;
    }

    public String getRoom2Img() {
        return room2Img;
    }

    public int getRoom2Num() {
        return room2Num;
    }

    public String getRoom3Img() {
        return room3Img;
    }

    public int getRoom3Num() {
        return room3Num;
    }

    public void setRoom1Num(int room1Num) {
        this.room1Num = room1Num;
    }

    public void setRoom2Num(int room2Num) {
        this.room2Num = room2Num;
    }

    public void setRoom3Num(int room3Num) {
        this.room3Num = room3Num;
    }
}
