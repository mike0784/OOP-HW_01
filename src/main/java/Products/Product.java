package Products;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {

    private final String name;      //Наименование товара

    private final double cost;      //Цена

    private String loadDate;        //Загрузка

    private Date productionDate;    //Дата производства
    private Integer expirationDate; //Срок годности

    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    public Date getProductionDate() {
        return productionDate;
    }

    public Integer getExpirationDate() {
        return expirationDate;
    }

    public Product() {
        this("0", 0, "01-01-1980");
    }

    public Product(String name, double cost, String productionDate) {
        this.name = name;
        this.cost = cost;
        try {
            this.productionDate = this.formatter.parse(productionDate);
        } catch (ParseException e) {
            this.productionDate = new Date(0);
        }
    }


    public void setLoadDate(String loadDate) {
        this.loadDate = loadDate;
    }

    @Override
    public String toString() {
        return String.format("Продукт: '%s'; Цена %.2fр.; Дата загрузки: %s; Дата производства: %td %tB %tY года;", name, cost, loadDate, this.productionDate, this.productionDate, this.productionDate);
    }


    @Override
    public boolean equals(Object obj) {
        return (this.name.equals(((Product) obj).name) && this.cost == (((Product) obj).cost));
    }

    @Override
    public int hashCode() {
        return name.hashCode() + (int) cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
