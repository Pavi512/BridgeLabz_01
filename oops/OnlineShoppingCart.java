package oops;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Cart {
    Product product;

    Cart(Product product) {
        this.product = product;
    }

    void displayCart() {
        System.out.println("Product ID: " + product.id);
        System.out.println("Product Name: " + product.name);
        System.out.println("Price: " + product.price);
    }
}

class Order {
    Cart cart;

    Order(Cart cart) {
        this.cart = cart;
    }

    void placeOrder() {
        System.out.println("Order Placed Successfully!");
        cart.displayCart();
    }
}

public class OnlineShoppingCart {
    public static void main(String[] args) {

        Product p = new Product(101, "Laptop", 55000);

        Cart c = new Cart(p);

        Order o = new Order(c);

        o.placeOrder();
    }
}