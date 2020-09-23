package co.edu.miremington.programming.forms;

import co.edu.miremington.programming.Enum.Documents;
import co.edu.miremington.programming.data.Data;
import co.edu.miremington.programming.data.Widget;
import co.edu.miremington.programming.entity.Reservations;
import co.edu.miremington.programming.entity.Room;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reservation extends JFrame implements Data {
    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;
    private JTextField txtName;
    private JTextField txtLastName;
    private JTextField txtDocumentNumber;
    private JTextField txtEmail;
    private JTabbedPane tabbedPane2;
    private JComboBox cbRoom;
    private JButton reservarButton;
    private JComboBox cbDocumentType;
    private JLabel lbRommCost;
    private JButton integrantesButton;
    private JLabel lbAllCost;

    public Reservation() throws HeadlessException {
        add(rootPanel);
        setTitle("Reserva");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        cbRoom.addItem(new Widget(0, "Seleccionar"));
        for (Room room: ROOM_LIST){
            cbRoom.addItem(new Widget(room.getId(), "Room " + room.getId()));
        }

        List<Documents> documentsList = new ArrayList<>();
        documentsList.add(Documents.IDENTIFICATION_CARD);
        documentsList.add(Documents.FORENG_IDENTIFICATION_CARD);
        documentsList.add(Documents.NIT);
        cbDocumentType.addItem(new Widget(0, "Seleccionar"));
        for (Documents documents: documentsList) {
            cbDocumentType.addItem(new Widget(documents.getId(), documents.getName()));
        }

        reservarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validate(txtName.getText())){
                    Reservations reservations = new Reservations();
                    Optional<Room> room = ROOM_LIST.stream().filter(item -> item.getId() == cbRoom.getSelectedIndex()).findFirst();
                    reservations.setRoom(room.get());
                    if(reservations.rommReserver()){
                        lbRommCost.setText("$" + reservations.getRoom().getPrice());
                        ROOM_LIST.stream().filter(item -> item.getId() == cbRoom.getSelectedIndex()).forEach(i -> i.setState("reserved"));
                        JOptionPane.showMessageDialog(null, "Reservada realizada");
                        clean();
                    } else {
                        JOptionPane.showMessageDialog(null, "La habitación ya se encuentra reservada");
                    }
                }
            }
        });
        cbRoom.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Optional<Room> room = ROOM_LIST.stream().filter(item -> item.getId() == cbRoom.getSelectedIndex()).findFirst();
                if (room.isPresent()){
                    lbRommCost.setText("$" + room.get().getPrice());
                }
            }
        });
        integrantesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Integrantes:\n Santiago Amaya\n Oscar Gomez\n Nixon Sanchez");
            }
        });
    }

    public boolean validate(String... params) {
        for (int i = 0; i <= params.length - 1; i++) {
            if (params[i].toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
                return false;
            }
        }
        return true;
    }

    public void clean(){
        txtName.setText("");
        txtLastName.setText("");
        txtDocumentNumber.setText("");
        cbDocumentType.setSelectedIndex(0);
        cbRoom.setSelectedIndex(0);
        txtEmail.setText("");
        lbRommCost.setText("");
    }
}
