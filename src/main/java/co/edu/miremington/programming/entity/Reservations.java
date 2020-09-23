package co.edu.miremington.programming.entity;

import co.edu.miremington.programming.Enum.Shift;
import co.edu.miremington.programming.data.Data;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Optional;

/**
 * Record of a work day for an client
 * @author devnix
 */
public class Reservations extends Room implements Data {
    private Integer id;
    private Date startDate;
    private Date endDate;
    private Room room;
    private Client client;


    static final Logger logger = Logger.getLogger(Reception.class);

    public Reservations() {
    }

    public boolean rommReserver(){
        Optional<Room> opRoom = ROOM_LIST.stream().filter(item -> item.getId() == room.getId() && !room.getState().equalsIgnoreCase("reserved")).findFirst();
        if (opRoom.isPresent()){
            return true;
        }else {
            return false;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return super.getPrice();
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Reservations{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", room=" + room +
                ", client=" + client +
                '}';
    }
}
