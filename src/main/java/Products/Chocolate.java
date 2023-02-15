package Products;

public class Chocolate extends Product{
    private Integer weight;     //вес


    public Chocolate(String name, double cost, String productionDate, Integer weight) {
        super(name, cost, productionDate);
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return super.toString() + String.format(" Вес: %d", this.weight);
    }
}
