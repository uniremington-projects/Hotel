package co.edu.miremington.programming.entity;

import java.util.List;

public class Bill extends Reservations {
    private Integer id;
    private double allCost;
    private Client client;
    private List<Service> services;

    public Bill() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getAllCost() {
        for (Service service: services){
            allCost += service.getCost();
        }
        allCost += getPrice();
        return allCost;
    }

    public void setAllCost(double allCost) {
        this.allCost = allCost;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }


    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", allCost=" + allCost +
                ", client=" + client +
                ", services=" + services +
                '}';
    }
}
