package BaiTap.BaiTap6;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean status;

    public Product() {
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, int quantity, String descriptions, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = exportPrice - importPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
    }

    // Getters and Setters
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

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(Scanner scanner, Product[] arrProduct) {
        boolean valid;
        do {
            System.out.print("Nhập mã sản phẩm (4 ký tự bắt đầu bằng P): ");
            this.productId = scanner.nextLine();
            valid = this.productId.matches("^P\\w{3}$");
            if (!valid) {
                System.out.println("Mã sản phẩm không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!valid);

        do {
            System.out.print("Nhập tên sản phẩm (6-50 ký tự): ");
            this.productName = scanner.nextLine();
            valid = this.productName.length() >= 6 && this.productName.length() <= 50;
            if (!valid) {
                System.out.println("Tên sản phẩm không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!valid);

        do {
            System.out.print("Nhập giá nhập (lớn hơn 0): ");
            this.importPrice = scanner.nextFloat();
            valid = this.importPrice > 0;
            if (!valid) {
                System.out.println("Giá nhập không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!valid);

        do {
            System.out.print("Nhập giá xuất (lớn hơn giá nhập ít nhất 20%): ");
            this.exportPrice = scanner.nextFloat();
            valid = this.exportPrice > this.importPrice * 1.2;
            if (!valid) {
                System.out.println("Giá xuất không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!valid);

        do {
            System.out.print("Nhập số lượng (lớn hơn 0): ");
            this.quantity = scanner.nextInt();
            valid = this.quantity > 0;
            if (!valid) {
                System.out.println("Số lượng không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!valid);

        scanner.nextLine(); // Consume newline character
        System.out.print("Nhập mô tả sản phẩm: ");
        this.descriptions = scanner.nextLine();

        do {
            System.out.print("Nhập trạng thái sản phẩm (true/false): ");
            this.status = scanner.nextBoolean();
            valid = true;
        } while (!valid);

        this.profit = this.exportPrice - this.importPrice;
    }

    public void displayData() {
        System.out.printf("Mã sản phẩm: %s, Tên sản phẩm: %s, Giá nhập: %.2f, Giá xuất: %.2f, Lợi nhuận: %.2f, Số lượng: %d, Mô tả: %s, Trạng thái: %s\n",
                this.productId, this.productName, this.importPrice, this.exportPrice, this.profit, this.quantity, this.descriptions, this.status ? "Đang bán" : "Không bán");
    }

    public void calProfit() {
        this.profit = this.exportPrice - this.importPrice;
    }
}
