package Rikkei;

public class Rectangle {
    private double chieuDai;
    private double chieuRong;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public Rectangle() {

    }

    // Ham khoi tao co doi so
    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Ham tinh chu vi hinh chu nhat
    public double chuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    // Viet lai ham tinh dien tich

    @Override
    public String toString() {
        return "Rectangle{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
