package Test.shop.t2108a;

public class Menu {
    public static void mainMenu() {
        System.out.println("1-xem thoong tin sản phẩm");
        System.out.println("2-In danh sách sản phẩm có giá trên 10.000");
        System.out.println("3-Đếm số sản phẩm có số lượng bán từ 50 trở lên");
        System.out.println("4-Liệt kê sản phẩm dựa theo laoji sản phẩm");
        System.out.println("5-SẮp xếp sản phẩm theo số lượng bán được");
        System.out.println("6-Đưa ra sản phẩm theo số lượng bán được");
        System.out.println("7-Sắp xếp sản phẩm theo tên");
        System.out.println("0-Thoát chương trình");
        System.out.println("Lựa chọn của bạn là ");
    }

    public static void chooseCategory(){
        System.out.println("1-Thực phẩm");
        System.out.println("2-đồ gia dụng");
    }
    public static void secondMenu() {
        System.out.println("!-sửa thông tin sản phẩm");
        System.out.println("2-Xóa sản phẩm");
        System.out.println("0-Quay về trang chủ");
        System.out.println("Lựa chọn của bạn là");
    }
}
