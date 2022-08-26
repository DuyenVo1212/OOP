package Tuan8_NhaDat_nomenu;
 
import java.util.Scanner;
 
public class GiaoDich {
    private String maGiaoDich, ngayGiaoDich;
    private long donGia;
    private float dienTich;
    Scanner scanner = new Scanner(System.in);
     
    public GiaoDich() {
        super();
    }
 
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich) {
        super();
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
 
    public String getMaGiaoDich() {
        return maGiaoDich;
    }
 
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
 
    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }
 
    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
 
    public long getDonGia() {
        return donGia;
    }
 
    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
 
    public float getDienTich() {
        return dienTich;
    }
 
    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
     
    public void nhap() {
        System.out.print("Nh?p m� giao d?ch: ");
        maGiaoDich = scanner.nextLine();
        System.out.print("Nh?p ng�y giao d?ch (ng�y/th�ng/n?m): ");
        ngayGiaoDich = scanner.nextLine();
        System.out.print("Nh?p ??n gi�: ");
        donGia = Long.parseLong(scanner.nextLine());
        System.out.print("Nh?p di?n t�ch: ");
        dienTich = Float.parseFloat(scanner.nextLine());
    }
     
    @Override
    public String toString() {
        return "M� giao d?ch: " + this.maGiaoDich + ", ng�y giao d?ch: " + this.ngayGiaoDich + 
            ", ??n gi�: " + this.donGia + ", di?n t�ch: " + this.dienTich;
    }
}

	