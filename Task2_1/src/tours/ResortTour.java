package tours;

import enums.*;

public class ResortTour extends Tour {

    private int hotelStars;


    public ResortTour() {
        super();
    }

    public ResortTour(int days, double price, Country country, Transport transport, Food food, int hotelStars) {
        super(days, price, country, transport, food);
        this.hotelStars = hotelStars;
    }

    public int getStars() {
        return hotelStars;
    }

    public void setStars(int hotelStars) {
        this.hotelStars = hotelStars;
    }


    @Override
    public String toString() {
        return "\nТур[" +
                "Страна: " + this.getCountry() +
                ", Продолжительность: " + String.format("%8.3f", this.getDays()) +
                ", Цена: " + String.format("%8.2f", this.getPrice()) +
                ", Транспорт: " + this.getTransport() +
                ", Питание: " + this.getFood() +
                ", Отель: " + hotelStars +
                ']';
    }
}
