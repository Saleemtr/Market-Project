package matala1java;

public interface ISeller {
    public void addProduct(Product p1);
    public void printProducts();
    public Product[] makeCopyArr(Product[] l1, int len);
}
