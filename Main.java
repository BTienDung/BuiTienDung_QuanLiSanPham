package QuanLiSanPham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManagerlmpl productManagerlmpl = new ProductManagerlmpl();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            menu();
            System.out.println("Choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:{
                    productManagerlmpl.showProduct();
                    break;}
                case 2:{
                    Product product = inputProduct();
                    int checkStatusAdd = productManagerlmpl.addProduct(product);
                    if (checkStatusAdd==-1){
                        System.out.println("Add product failed");
                    } else {
                        System.out.println("Add product success");
                    }
                    break;}
                case 3:{
                    Product product = inputProduct();
                    boolean checkStatusEdit = productManagerlmpl.editProduct(product);
                    if (checkStatusEdit){
                        System.out.println("Edit product success");
                    }else {
                        System.out.println("Edit product failed");
                    }
                    break;}
                case 4:{
                    System.out.println("Input id need delete: ");
                    int id = sc.nextInt();
                    boolean checkStatusDelete = productManagerlmpl.deleteProduct(id);
                    if (checkStatusDelete){
                        System.out.println("Delete product succes ");
                    }else {
                        System.out.println("Delete product failed");
                    }
                    break;}
                case 5:{
                    System.out.println("Input id need find: ");
                    int id = sc.nextInt();
                    boolean checkStatusFind = productManagerlmpl.findProduct(id);
                    if (checkStatusFind){
                        System.out.println("\nFind product success");
                    } else {
                        System.out.println("\nFind product failed");
                    }
                    break;}
                case 6:{
                    productManagerlmpl.sortProduct();
                    System.out.println("Sort product success");
                    System.out.println("sort");
                    break;}
                case 0:
                    break;
            }
        }while (choice!=0);
    }

    public static void menu(){
        System.out.println("\n-----ProductManager-----");
        System.out.println("1. Show product");
        System.out.println("2. Add product");
        System.out.println("3. Edit product");
        System.out.println("4. Delete product");
        System.out.println("5. Find product by price");
        System.out.println("6. Sort product");
        System.out.println("0. Exit");
    }
    public static Product inputProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        int id = sc.nextInt();
        System.out.println("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Description: ");
        String description = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextInt();
        System.out.println("Status: ");
        sc.nextLine();
        String status = sc.nextLine();
        Product product = new Product(id, name, description, price, status);
        return product;
    }
}
