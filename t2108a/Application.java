package Test.shop.t2108a;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Repostitory repostitory = new Repostitory();
        Scanner scanner = new Scanner(System.in);
        Menu.mainMenu();
        int choose = scanner.nextInt();
        switch (choose) {
            case 0:
            System.exit(0);
            break;
            case 1:
                System.out.println("Danh sach san pham");
                repostitory.show();
                break;
            case 2:
                System.out.println("Cac san pham co gia tren 10000: ");
                repostitory.filterProductByPrice();
                break;
            case 3:
                repostitory.countProductByAmountSale();
                break;
            case 7:
                repostitory.sortProductByName();
                System.out.println("SAn pham sau khi sap xep: ");
                repostitory.show();

        }
    }
}
