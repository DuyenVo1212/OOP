package BTSACH_THAY;

import java.util.Iterator;
import java.util.Scanner;

public class ListSach {
	private Sach[] sachArr = new Sach[100];
	private int countSach,countSTK=0;
	private double sum1=0, sum2=0,tbcdg=0,sumdg=0;
	public ListSach()
	{
		countSach=0;
		for(int i=0; i<100; i++)
		{
			sachArr[i] = new Sach();
		}
	}
	public void addSach(int loaisach,Scanner sc)
	{
		if(countSach>100)
			System.out.println("Khong the them du lieu!");
		else
		{
			if(loaisach==1)
			{
				sachArr[countSach] = new SachGiaoKhoa();
				SachGiaoKhoa sgk = new SachGiaoKhoa();
				sgk.nhap(sc);
				sachArr[countSach]=sgk;
				sum1 += sgk.thanhTien();
				sgk.setLoaiSach(loaisach);
			}
			else
			{
				sachArr[countSach] = new SachThamKhao();
				SachThamKhao stk = new SachThamKhao();
				stk.nhap(sc);
				sachArr[countSach]=stk;
				sum2 += stk.thanhTien();
				sumdg += stk.getDonGia();
				stk.setLoaiSach(loaisach);
				countSTK++;
			}
			countSach++;
		}
	}
	
	public void xuattt() {
		for (int i = 0; i < countSach; i++) {
			System.out.println(sachArr[i].toString());
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
		for (int i = 0; i < countSach; i++) {
			if(sachArr[i].getLoaiSach()==1 && (sachArr[i].getNhaXB().equalsIgnoreCase(nxb)))
				System.out.println(sachArr[i].toString());
		}
	}
	
	public void sapxeptheoma() {
		for (int i = 0; i < countSach; i++) {
			for (int j = i+1; j < countSach; j++) {
				if(sachArr[i].getMaSach().compareToIgnoreCase(sachArr[j].getMaSach())>0)
				{	
					Sach tmp = sachArr[i]; 
					sachArr[i] = sachArr[j];
					sachArr[j] = tmp;
					
				}
					
			}
			
		}
	}
}
