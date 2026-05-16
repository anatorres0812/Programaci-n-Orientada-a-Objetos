package model;

public class Pedido {

    private int id;
    private String cliente;
    private int platoId;
    private int cantidad;

    public Pedido() {
    }

    public Pedido(String cliente, int platoId, int cantidad) {
        this.cliente = cliente;
        this.platoId = platoId;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getPlatoId() {
        return platoId;
    }

    public void setPlatoId(int platoId) {
        this.platoId = platoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}