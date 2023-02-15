package Device;

import Products.Product;

import java.text.DateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class VendingMachine {
    protected List<Product> listOfProducts = new ArrayList<>();     //Список товаров в машине
    private double cash;
    private final Locale locale = new Locale("ru","RU");
    private final DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, locale);

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder();
        for (Product product : listOfProducts) {
            localString.append(product.toString());
            localString.append("\n");
        }
        return localString.toString();
    }

    public void addProduct(Product inputProduct) {
        listOfProducts.add(inputProduct);
        inputProduct.setLoadDate(dateFormat.format(new Date()));
    }

    public List<Product> findProduct(String name) {
        List<Product> foundProduct = new ArrayList<>();
        for (Product product : listOfProducts) {
            if (product.getName().contains(name)) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public Product sellProduct(Product sallingProduct) {
        Product sellProduct = new Product();
        if (listOfProducts.contains(sallingProduct)) {
            for (int i = 0; i < listOfProducts.size(); i++) {
                if (listOfProducts.get(i) == sallingProduct) {
                    sellProduct = listOfProducts.get(i);
                    listOfProducts.remove(i);
                    cash += sellProduct.getCost();
                    return sellProduct;
                }
            }
        }

        return sellProduct;
    }
    public DateFormat getDateFormat(){
        return dateFormat;
    }
}
