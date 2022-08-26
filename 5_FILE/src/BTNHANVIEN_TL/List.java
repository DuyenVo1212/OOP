package BTNHANVIEN_TL;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class List {
	ArrayList<Employee> ds;
	DecimalFormat dt = new DecimalFormat("#,###.0");
	private int soLuongad = 0, soLuongNha = 0;
	private double thanhTienad = 0;
	private int count;
	private double tbc, sum = 0;
	private double dtln = 0;

	public List() {
		super();
		ds = new ArrayList<Employee>();
		count = 0;
	}

	public void nhapList(int chon, Scanner scanner) {

			if (chon == 1) {
				Administrator admin = new Administrator();
				admin.nhap(scanner);

				if (ds.contains(admin))
					System.out.println("Da ton tai giao dich nay");

				else {
					ds.add(admin);
					soLuongad++;
					thanhTienad += admin.luongthang();
				}
			} else {
				Leader lead = new Leader();
				lead.nhap(scanner);
				if (ds.contains(lead))
					System.out.println("Da ton tai giao dich nay");
				else {
					ds.add(lead);
					soLuongNha++;
				}
			}
			
			 {
				Programmer pro = new Programmer();
				pro.nhap(scanner);
				if (ds.contains(pro))
					System.out.println("Da ton tai giao dich nay");
				else {
					ds.add(pro);
					soLuongNha++;
				}
			}
			
		}
	

	public void xuatList() {
		System.out.println("Danh sach cac giao dich: ");
		for (Employee n : ds) {
			System.out.println(n.toString());
		}
	}
}
