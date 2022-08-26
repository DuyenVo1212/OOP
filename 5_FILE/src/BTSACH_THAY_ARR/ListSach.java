package BTSACH_THAY_ARR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListSach {
	private ArrayList<Sach> sachArr = new ArrayList<Sach>();
	private int countSach,countSTK=0;
	private double sum1=0, sum2=0,tbcdg=0,sumdg=0;
	public ListSach()
	{
		countSach=0;
	}
	public void addSach(int loaisach,Scanner sc)
	{
		if(countSach>100)
			System.out.println("Khong the them du lieu!");
		else
		{
			if(loaisach==1)
			{
				SachGiaoKhoa sgk = new SachGiaoKhoa();
				sgk.nhap(sc);
				sum1 += sgk.thanhTien();
				sgk.setLoaiSach(loaisach);
				sachArr.add(sgk); 
			}
			else
			{
				SachThamKhao stk = new SachThamKhao();
				stk.nhap(sc);
				sum2 += stk.thanhTien();
				sumdg += stk.getDonGia();
				stk.setLoaiSach(loaisach);
				sachArr.add(stk);
				countSTK++;
			}
			countSach++;
		}
	}
	
	public void xuattt() {
		
		/*for (int i = 0; i < sachArr.size(); i++) {
			System.out.println(sachArr.get(i).toString());
		}*/
		
		for (Sach sach : sachArr) {
			System.out.println(sach.toString());
		}
	}
	
	public void xuatTongTT() {
		System.out.println("----------------Tong Thanh tien-----------------");
		System.out.println("| Sach Giao Khoa: " + sum1 + "|");
		System.out.println("| Sach Tham Khao: " + sum2 + "|");
		System.out.println("------------------------------------------");
	}
	
	public void xuatTongTBC() {
		tbcdg = sumdg / countSTK;
		System.out.println("----------------Trung binh cong don gia-----------------");
		System.out.println("| Sach Tham Khao: " + tbcdg + "|");
		System.out.println("------------------------------------------");
	}
	public void xuatTTSGK_NXB(String nxb) {
		for (int i = 0; i < sachArr.size(); i++) {
			if(sachArr.get(i).getLoaiSach()==1 && (sachArr.get(i).getNhaXB().equalsIgnoreCase(nxb)))
				System.out.println(sachArr.get(i).toString());
		}
	}
	
	public void sapxeptheoma() {
		Collections.sort(sachArr);
	}
}
