package QuanLiSanPham;

import java.util.ArrayList;
import java.util.List;

public interface ProductManager {

    void showProduct();
    int addProduct(Product product);
    boolean editProduct(Product product);
    boolean deleteProduct(int id);
    boolean findProduct(int id);
    void sortProduct();
}
