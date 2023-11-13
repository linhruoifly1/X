package com.example.x.model;

public class Bill {
    private int id,idClient,idRoom,idReceptionist,costRoom,costService,sumCost;

    public Bill(int id, int idClient, int idRoom, int idReceptionist, int costRoom, int costService, int sumCost) {
        this.id = id;
        this.idClient = idClient;
        this.idRoom = idRoom;
        this.idReceptionist = idReceptionist;
        this.costRoom = costRoom;
        this.costService = costService;
        this.sumCost = sumCost;
    }

    public Bill(int idClient, int idRoom, int idReceptionist, int costRoom, int costService, int sumCost) {
        this.idClient = idClient;
        this.idRoom = idRoom;
        this.idReceptionist = idReceptionist;
        this.costRoom = costRoom;
        this.costService = costService;
        this.sumCost = sumCost;
    }

    public Bill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getIdReceptionist() {
        return idReceptionist;
    }

    public void setIdReceptionist(int idReceptionist) {
        this.idReceptionist = idReceptionist;
    }

    public int getCostRoom() {
        return costRoom;
    }

    public void setCostRoom(int costRoom) {
        this.costRoom = costRoom;
    }

    public int getCostService() {
        return costService;
    }

    public void setCostService(int costService) {
        this.costService = costService;
    }

    public int getSumCost() {
        return sumCost;
    }

    public void setSumCost(int sumCost) {
        this.sumCost = sumCost;
    }
}
