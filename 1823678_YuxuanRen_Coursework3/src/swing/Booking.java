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
public class Booking {

    private String hotelName;
    private String hotelAddress;
    private String roomType;
    private int roomNum;
    private int peopleNum;
    private String startDate;
    private String endDate;
    private String bookerName;
    private String phoneNum;

    public Booking(String hotelName, String hotelAddress, String roomType, int roomNum, int peopleNum, String startDate, String endDate, String bookerName, String phoneNum) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.roomType = roomType;
        this.roomNum = roomNum;
        this.peopleNum = peopleNum;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bookerName = bookerName;
        this.phoneNum = phoneNum;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setBookerName(String bookerName) {
        this.bookerName = bookerName;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public int getPeopleNum() {
        return peopleNum;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getBookerName() {
        return bookerName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public String toString() {
        return "Hotel Name:"+hotelName + "    Hotel Address:" +hotelAddress+ "    Room Type:" + roomType + "    Number Of Rooms:" + roomNum + "    Number Of People:" + peopleNum + "    Start Date:" + startDate + "    End Date:" + endDate + "    Booker's Name:" + bookerName + "    Phone number:" + phoneNum;
    }

}
