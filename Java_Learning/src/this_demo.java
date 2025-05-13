class Product {
    int id;
    String name;

    // Constructor using this keyword
    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println("Product ID: " + id + ", Product Name: " + name);
    }
}

public class this_demo {
    public static void main(String[] args) {
        Product p = new Product(10, "Laptop");
        p.show();
    }
}
