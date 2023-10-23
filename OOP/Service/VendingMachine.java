import java.util.List;

public class VendingMachine 
{
    private List<Product> products;

    public VendingMachine(List<Product> products)
    {
        this.products = products;
    }

    public Product byProduct(int index)
    {
        return this.products.get(index);
    }

    public List<Product> GetProductList()
    {
        return products;
    }
}
