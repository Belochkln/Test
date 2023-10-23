/*
 * Автор: Серебряков Михаил
 * Группа: Программист | будни день | 22.08.23
 * P.S. не нашёл номер группы, взял название из телеграм.
 */
import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        ProdType FizzyDrink = new ProdType("FizzyDrink");

        Product cola = new Product("CokaCola", 50, FizzyDrink);
        Product fanta = new Product("Fanta", 40, FizzyDrink);
        HotDrink cofe = new HotDrink("Macona", 100, 60);
        HotDrink tea = new HotDrink("Lipton", 100, 80);

        List<Product> products = new ArrayList<Product>();
        products.add(cola);
        products.add(fanta); 
        products.add(cofe); 
        products.add(tea); 

        VendingMachine firstVendingMachine = new VendingMachine(products);
        for(Product prod: firstVendingMachine.GetProductList())
        {
            System.out.println(prod);
        }
    }
    
}
