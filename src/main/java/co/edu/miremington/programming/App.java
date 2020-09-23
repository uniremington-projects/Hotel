package co.edu.miremington.programming;

import co.edu.miremington.programming.data.Data;
import co.edu.miremington.programming.entity.Room;
import co.edu.miremington.programming.forms.Reservation;
import org.apache.log4j.Logger;

import javax.swing.*;


/**
 * App Reception!
 *
 * @author devnix
 * @version 1.0.0
 *
 */
public class App implements Data {
    static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        logger.info("welcome!");
        try {
            /**
             * Exercise 1
             *
             * Process process = new Process(false);
             * process.start();
             */

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Room room1 = new Room();
                    room1.setId(1);
                    room1.setPrice(50000);
                    room1.setRoomFloor(3);
                    room1.setRoomType(1);

                    Room room2 = new Room();
                    room2.setId(2);
                    room2.setPrice(60000);
                    room2.setRoomFloor(4);
                    room2.setRoomType(2);

                    Room room3 = new Room();
                    room3.setId(3);
                    room3.setPrice(80000);
                    room3.setRoomFloor(5);
                    room3.setRoomType(3);
                    room3.setState("reserved");


                    ROOM_LIST.add(room1);
                    ROOM_LIST.add(room2);
                    ROOM_LIST.add(room3);

                    Reservation reservation = new Reservation();
                    reservation.setVisible(true);
                }
            });

        } catch (Exception e) {
            logger.error(e.getMessage());
        }

    }

}
