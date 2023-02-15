import Device.VendingMachine;
import Products.Chocolate;
import Products.Milk;
import Products.Product;

public class Program {
    public static void main(String[] args)
    {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100, "02-01-2023"));
        machine.addProduct(new Product("Mars", 70, "02-012-2022"));
        machine.addProduct(new Product("Twix", 70.99, "23-12-2022"));
        machine.addProduct(new Product("Алёнка", 90, "11-11-2023"));
        machine.addProduct(new Product("Колокольчик", 85, "02-05-2020"));

        machine.addProduct(new Milk("Семол", 45, "03-03-2022", 0.9, 2.5));
        machine.addProduct(new Milk("Семол", 30, "13-02-2023", 0.45, 2.5));
        machine.addProduct(new Milk("Семол", 50, "13-02-2023", 0.9, 3.0));
        machine.addProduct(new Milk("Сернур", 43, "14-02-2023", 0.9, 2.5));
        machine.addProduct(new Milk("РМЗ", 46, "10-02-2023", 0.9, 2.5));

        machine.addProduct(new Chocolate("Аленка",  67, "12-01-2023", 100));
        machine.addProduct(new Chocolate("Россия", 90, "21-01-2023", 90));
        machine.addProduct(new Chocolate("Красный октябрь", 120, "31-01-2023", 110));
        machine.addProduct(new Chocolate("AlpenGold", 87, "12-02-2022", 100));

        System.out.println(machine);
    }
}
