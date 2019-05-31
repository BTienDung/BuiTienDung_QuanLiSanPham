package QuanLiSanPham;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductManagerlmpl implements ProductManager {
    List<Product> productList = new ArrayList<>();
    @Override
    public void showProduct(){
        System.out.println("-------------------------------");
        for (Product product: productList){
            System.out.print("\nId: "+ product.getId());
            System.out.print("  Name: "+ product.getName());
            System.out.print("  Description: "+ product.getDesciption());
            System.out.print("  Price: "+ product.getPrice());
            System.out.print("  Status: "+ product.getStatus());
        }
    }

    @Override
    public int addProduct(Product product){
        for (Product add: productList){
            if (add.getName().equals(product.getName())){
                return -1;

            }
            break;
        }
        productList.add(product);
        return 1;
    }

    @Override
    public boolean editProduct(Product product){
        int index = -1;
        for (Product edit: productList){
            if (edit.getId() == product.getId()){
                index = edit.getId()-1;
                break;
            }
        }
        if (index!=-1){
            productList.get(index).setName(product.getName());
            productList.get(index).setDesciption(product.getDesciption());
            productList.get(index).setPrice(product.getPrice());
            productList.get(index).setStatus(product.getStatus());
            return true;
        }
        return  false;
    }

    @Override
    public boolean deleteProduct(int id){
        int index =-1;
        for (Product delete: productList){
            if (delete.getId() == id){
                index = delete.getId()-1;
                break;
            }
        }
        if (index!=-1){
            productList.remove(index);
            return true;
        }
        return false;
    }
    @Override
    public boolean findProduct(int id){
        for (Product find: productList){
            if (find.getId() == id){
                show(find);
                return true;
            }
        }
        return false;
    }
    @Override
    public void sortProduct(){
        Collections.sort(productList);
    }
    public void show(Product product){
        System.out.println("\n-----------------------");
        System.out.print("\nId: "+product.getId());
        System.out.print("  Name: "+product.getName());
        System.out.print("  Depcription: "+product.getDesciption());
        System.out.print("  Price: "+product.getPrice());
        System.out.print("  Status: "+product.getStatus());
    }
}
