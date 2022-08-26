package BT3;

import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    //tạo phương thức nhập thông tin cho xe
      static void nhapXe(Xe xe){
            System.out.print("Nhập mã xe: ");
            xe.setMaXe(sc.nextInt());
            
            sc.nextLine();
            System.out.print("Nhập tên chủ xe: ");
            xe.setChuXe(sc.nextLine());
            
            //sc.nextLine();
            System.out.print("Nhập loại xe: ");
            xe.setLoaixe(sc.nextLine());
            
            System.out.print("Nhập dung tích xe: ");
            xe.setDungTich(sc.nextInt());
            
            System.out.print("Nhập trị giá xe: ");
            xe.setTriGia(sc.nextDouble());
                   
        }
        //tạo phương thức main để chạy các phương thức khác ở class Vehicle
    public static void main(String[] args) {
        Xe v[]= null;//mang chua xe
        int a,n=0;
        boolean flag = true;
        //sử dụng switch case để tạo menu cho chương trình
        do{
            System.out.println("Nhập lựa chọn");
            System.out.println("1.Tạo các đối tượng xe1,xe2,xe3 \n"+
                    "2.Xuất bảng \n"+
                    "3.Thoát");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhập số lượng xe: ");
                    n=sc.nextInt();
                    //khai báo mảng v[] 
                    v= new Xe[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i+1));
                        v[i] = new Xe();
                        nhapXe(v[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %5s %5s %10s %10s %8s \n","Mã xe","Tên chủ xe","Loại xe","Dung tích","Trị giá","Thuế phải nộp");
                    for (int i = 0; i < n; i++) {
                        v[i].inThue();
                    }
                    break;
                default:
                    System.out.println("Kết thúc");
                    flag=false;
                    break;
            }
        }while (flag);
    }
}

