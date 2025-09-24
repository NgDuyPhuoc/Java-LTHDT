public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(29, 2, 2024);
        Date d2 = new Date(31, 4, 2023);

        d1.xuat();
        System.out.println(d1.kiemTraDate() ? "Hợp le" : "Không hợp lệ");

        d2.xuat();
        System.out.println(d2.kiemTraDate() ? "Hợp lệ" : "Không hợp lệ");
    }
}
