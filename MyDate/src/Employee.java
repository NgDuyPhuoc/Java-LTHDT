public class Employee {
    private String lastname;
    private String firstname;
    private Date birthdate;
    private Date hiredate;

    public Employee(String lastname, String firstname, Date birthdate, Date hiredate) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthdate = birthdate;
        this.hiredate = hiredate;
    }

    public String getLastName() {
        return lastname;
    }

    public void lastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void firstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void birthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void hiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public void xuat() {
        System.out.print("Ho: " + lastname + "\nTen: " + firstname);
        System.out.print("\nNgay sinh: ");
        birthdate.xuat();
        System.out.print("\nNgay bat dau lam: ");
        hiredate.xuat();
        System.out.println();
    }
}
