package tours;
import enums.*;

public abstract class Tour {
    private int days;
    private double price;
    private Transport transport;
    private Country country;
    private Food food;

    public Tour(){

    }

    public Tour(int days, double price, Country country, Transport transport, Food food) {
        this.days = days;
        this.price = price;
        this.country = country;
        this.transport = transport;
        this.food = food;
    }

    public double getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "\nТур[" +
                "Страна: " + country +
                ", Продолжительность: " + String.format("%8.3f",days) +
                ", Цена: " + String.format("%8.2f",price) +
                ", Транспорт: " + transport +
                ", Питание: " + food +
                ']';
    }
}