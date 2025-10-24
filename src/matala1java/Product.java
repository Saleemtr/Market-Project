package matala1java;

import java.util.Random;

public class Product {
    private String productName;
    private float price;
    private Category category;
    private String serialNumber;
    private float extraPackaging = 0;

    public Product() {
        productName = "";
        price = 0;
    }

    public Product(String productName , float price , Category category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.serialNumber = setRandomSerialNumber();
    }

    private String setRandomSerialNumber() {
        String serialNum = "";
        Random random = new Random();
        for (int i = 0; i < 13; i++) {
            serialNum += random.nextInt(10);
        }
        return serialNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategoryName(){
        if(category != null)
            return category.name();
        return "";
    }
    public void setExtraPackaging(float e){
        extraPackaging = e;
        price += e;
    }

    @Override
    public String toString() {
        if(extraPackaging == 0) {
            return " " + productName + ", price : $" + price + ",  Category : " + category.name() + ", serialNumber : " + serialNumber;
        }else{
            return " " + productName + ", price : $" + (price-extraPackaging) + ", extraPackaging price : $" + extraPackaging +
                    ", total price: $"+ price + ",  Category : " + category.name() + ", serialNumber : " + serialNumber;
        }
    }
}

