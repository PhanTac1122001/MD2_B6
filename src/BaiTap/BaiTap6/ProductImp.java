package BaiTap.BaiTap6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ProductImp {
    public static void main(String[] args) {


        Product[] arrProduct = new Product[100];


        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            showMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự enter
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sản phẩm cần nhập: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ ký tự enter
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
                        Product product = new Product();
                        product.inputData(scanner, arrProduct);
                        for (int j = 0; j < arrProduct.length; j++) {
                            if (arrProduct[j] == null) {
                                arrProduct[j] = product;
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    for (Product product : arrProduct) {
                        if (product != null) {
                            product.displayData();
                            System.out.println("---");
                        }
                    }
                    break;
                case 3:
                    for (Product product : arrProduct) {
                        if (product != null) {
                            product.calProfit();
                        }
                    }
                    break;
                case 4:
                    Arrays.sort(arrProduct, (p1, p2) -> {
                        if (p1 == null || p2 == null) {
                            return 0;
                        }
                        return Float.compare(p2.getProfit(), p1.getProfit());
                    });
                    break;
                case 5:
                    System.out.print("Nhập giá từ: ");
                    float fromPrice = scanner.nextFloat();
                    System.out.print("Nhập giá đến: ");
                    float toPrice = scanner.nextFloat();
                    int count = 0;
                    for (Product product : arrProduct) {
                        if (product != null && product.getExportPrice() >= fromPrice && product.getExportPrice() <= toPrice) {
                            count++;
                        }
                    }
                    System.out.println("Số lượng sản phẩm có giá bán trong khoảng từ " + fromPrice + " đến " + toPrice + " là: " + count);
                    break;
                case 6:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String searchName = scanner.nextLine();
                    for (Product product : arrProduct) {
                        if (product != null && product.getProductName().contains(searchName)) {
                            product.displayData();
                            System.out.println("---");
                        }
                    }
                    break;
                case 7:
                    System.out.print("Nhập mã sản phẩm cần nhập: ");
                    String productId = scanner.nextLine();
                    System.out.print("Nhập số lượng sản phẩm cần nhập: ");
                    int inputQuantity = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ ký tự enter
                    for (Product product : arrProduct) {
                        if (product != null && product.getProductId().equals(productId)) {
                            product.setQuantity(product.getQuantity() + inputQuantity);
                            break;
                        }
                    }
                    break;
                case 8:
                    System.out.print("Nhập tên sản phẩm cần bán: ");
                    String sellName = scanner.nextLine();
                    System.out.print("Nhập số lượng sản phẩm cần bán: ");
                    int sellQuantity = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ ký tự enter
                    for (Product product : arrProduct) {
                        if (product != null && product.getProductName().equals(sellName)) {
                            product.setQuantity(product.getQuantity() - sellQuantity);
                            break;
                        }
                    }
                    break;
                case 9:
                    System.out.print("Nhập mã sản phẩm cần cập nhật trạng thái: ");
                    String updateId = scanner.nextLine();
                    for (Product product : arrProduct) {
                        if (product != null && product.getProductId().equals(updateId)) {
                            product.setStatus(!product.isStatus());
                            break;
                        }
                    }
                    break;
                case 10:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }while (true);
    }
    public static void showMenu() {
        System.out.println("========== QUẢN LÝ SẢN PHẨM ==========");
        System.out.println("1. Nhập thông tin sản phẩm");
        System.out.println("2. Hiển thị thông tin sản phẩm");
        System.out.println("3. Tính lợi nhuận");
        System.out.println("4. Sắp xếp sản phẩm theo lợi nhuận");
        System.out.println("5. Tìm sản phẩm theo khoảng giá");
        System.out.println("6. Tìm sản phẩm theo tên");
        System.out.println("7. Nhập thêm số lượng sản phẩm");
        System.out.println("8. Bán sản phẩm");
        System.out.println("9. Cập nhật trạng thái sản phẩm");
        System.out.println("10. Thoát chương trình");
        System.out.print("Lựa chọn của bạn: ");
    }
}