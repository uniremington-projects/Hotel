package co.edu.miremington.programming.entity;

import org.apache.log4j.Logger;

public class Room {

    private Integer id;
    private Integer roomNumber;
    private Integer roomType;
    private Integer roomFloor;
    private double price;
    private String state;

    static final Logger logger = Logger.getLogger(Reception.class);

    public Room() {
        state = "without reservation";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public Integer getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(Integer roomFloor) {
        this.roomFloor = roomFloor;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                ", roomType=" + roomType +
                ", roomFloor=" + roomFloor +
                ", price=" + price +
                ", state='" + state + '\'' +
                '}';
    }
}
