package BaiTap.BaiTap5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private String catalogName;
    private int productStatus;

    public Product() {
    }

    public Product(String productId, String productName, float price, String description, Date created, String catalogName, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.catalogName = catalogName;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mã sản phẩm ID (C/S/A theo sau là 3 chữ số): ");
        this.productId = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm (10-50 ký tự)");
        this.productName = scanner.nextLine();
        System.out.print("Nhập giá (lớn hơn 0):");
        this.price = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Nhập mô tả");
        this.description = scanner.nextLine();
        System.out.print("Nhập ngày tạo (dd/MM/yyyy): ");
        String createdDate = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.created = dateFormat.parse(createdDate);
        } catch (ParseException e) {
            System.out.println("Định dạng ngày tháng hợp lệ. Sử dụng ngày hiện tại.");
            this.created = new Date();
        }
        System.out.print("Nhập tên danh mục:");
        this.catalogName = scanner.nextLine();
        System.out.print("Nhập trạng thái sản phẩm (0: Đang bán, 1: Hết hàng, 2: Không bán): ");
        this.productStatus = scanner.nextInt();
    }

    public void displayData() {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: " + this.price);
        System.out.println("Description: " + this.description);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Created: " + dateFormat.format(this.created));
        System.out.println("Catalog Name: " + this.catalogName);
        System.out.println("Product Status: " + this.getProductStatusString());
    }

    private String getProductStatusString() {
        switch (this.productStatus) {
            case 0:
                return "Đang bán";
            case 1:
                return "Hết hàng";
            case 2:
                return "Không bán";
            default:
                return "Mời nhập lại từ 0-2";
        }
    }
}
