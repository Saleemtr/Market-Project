package matala1java;

public class Buyer implements Comparable<Buyer>, IBuyer {
    private String userName;
    private String password;
    private Address address;
    private Cart cart;
    private int cartlen = 0;

    public Buyer(String userName, String password, Address address) {
        this.userName = userName;
        this.password = password;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCart(Cart c1) {
        this.cart = c1;
        this.cartlen = c1.getProducts().length;
    }

    public Cart getCart() {
        return cart;
    }

    public void addToCart(Product p1) {
        if (cartlen == 0) {
            cart = new Cart(p1);
            cartlen++;
        } else {
            cart.addProductToCart(p1, cartlen);
            cartlen++;
        }
    }

    public float getCartTotal() {
        return cart.getCartSum();
    }

    public void resetCart() {
        this.cart = null;
        this.cartlen = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.userName).append(",  Address: ").append(this.address).append(", cart:");
        if (cartlen == 0) {
            sb.append("empty");
            return sb.toString();
        } else {
            sb.append("\n").append(this.cart).append("\n");
        }
        return sb.toString();
    }


    @Override
    public int compareTo(Buyer other) {
        return this.userName.compareTo(other.userName);
    }
}

