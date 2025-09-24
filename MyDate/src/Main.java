public class Main {
    public static void main(String[] args) {
        // Date d1 = new Date(29, 2, 2024);
        // Date d2 = new Date(31, 4, 2023);

        // d1.xuat();
        // System.out.println(d1.kiemTraDate() ? "Hop le" : "Khong hop le");

        // d2.xuat();
        // System.out.println(d2.kiemTraDate() ? "Hop le" : "Khong hop le");

        Date d1 = new Date(25, 8, 2006);
        Date d2 = new Date(10, 3, 2006);

        Employee emp = new Employee("Nguyen", "Phuoc", d1, d2);

        emp.xuat();

    }
}
