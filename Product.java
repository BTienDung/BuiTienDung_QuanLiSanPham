package QuanLiSanPham;

import java.util.Collection;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private String desciption;
    private double price;
    private String status;

    public Product() {
    }

    public Product(int id, String name, String desciption, double price, String status) {
        this.id = id;
        this.name = name;
        this.desciption = desciption;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int compareTo(Product product){
        if (this.price > product.getPrice()){
            return 1;
        } else if (this.price == product.getPrice()){
            return 0;
        } else {
            return -1;
        }
    }
}
