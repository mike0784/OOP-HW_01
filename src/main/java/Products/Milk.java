package Products;

public class Milk extends Product {
    private  Double volum;      //Объём
    private Double fatContent;  //Жирность

    public Milk(String name, double cost, String productionDate, Double volum, Double fatContent) {
        super(name, cost, productionDate);
        this.volum = volum;
        this.fatContent = fatContent;
    }

    @Override
    public String toString()
    {
        return super.toString() + String.format(" Объём: %.1f; Жирность: %.1f", this.volum, this.fatContent);
    }
}
