package tours;

import enums.*;

public class ExcursionTour extends Tour {

    private Excursion excursion;


    public ExcursionTour() {
        super();
    }

    public ExcursionTour(int days, double price, Country country, Transport transport, Food food, Excursion excursion) {
        super(days, price, country, transport, food);
        this.excursion = excursion;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setName(Excursion excursion) {
        this.excursion = excursion;
    }
    @Override
    public String toString() {
        return "\nТур[" +
                "Страна: " + this.getCountry() +
                ", Тип экскурсии: " + this.getExcursion() +
                ", Продолжительность: " + String.format("%8.3f",this.getDays()) +
                ", Цена: " + String.format("%8.2f",this.getPrice()) +
                ", Транспорт: " + this.getTransport() +
                ", Питание: " + this.getFood() +
                ']';
    }
}