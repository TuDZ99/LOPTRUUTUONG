package Rikkei;

public abstract class Shape {
    public abstract double area();

    // Phuong thuc hien thi thong tin
    public String toString() {
        return "Dien tich la: " + area();
    }
}
