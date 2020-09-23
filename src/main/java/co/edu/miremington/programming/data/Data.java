package co.edu.miremington.programming.data;

import co.edu.miremington.programming.entity.Client;
import co.edu.miremington.programming.entity.Reception;
import co.edu.miremington.programming.entity.Reservations;
import co.edu.miremington.programming.entity.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * test data
 * @author devnix
 *
 */
public interface Data {
    List<Reception> RECEPTION_LIST = new ArrayList<>();
    List<Client> CLIENT_LIST = new ArrayList<>();
    List<Reservations> WORKING_DAY_LIST = new ArrayList<>();
    List<Room> ROOM_LIST = new ArrayList<>();
}
