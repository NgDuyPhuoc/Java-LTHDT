public class Date {
    private int day, month, year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1990;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void xuat() {
        System.out.print(day + "/" + month + "/" + year);
    }

    public boolean kiemTraDate() {
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

        int maxDay;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> maxDay = 31;
            case 4, 6, 9, 11 -> maxDay = 30;
            case 2 -> {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
            }
            default -> {
                return false;
            }
        }
        return day <= maxDay;
    }
}
