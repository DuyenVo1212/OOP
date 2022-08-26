package Sach;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AListSach {
	
	ArrayList<Sach> ds;
	public double gk = 0, tk = 0;
	
	public AListSach() {
		ds = new ArrayList<Sach>();
}

	public boolean ThemSach(Sach s) {
		if(s != null) {
			for(Sach c : ds) {
				if(c.getMaS().equalsIgnoreCase(s.getMaS())) {
					System.out.println("Khong them duoc");
					return false;
				}
			}
			ds.add(s);
			return true;
		}
		return false;
	}
		
	public void XuatSachNXB(String nxb) {
		for(int i = 0; i < ds.size(); i++) {
			if(ds.get(i).getNxb().equalsIgnoreCase(nxb)) {
				System.out.println(ds.get(i).toString());
			} else {
				System.out.println("Khong tim thay");
			}
		}
	}
	
	public void TongTienLoaiSach() {
		for(int i = 0; i < ds.size(); i++) {
			if(ds.get(i) instanceof SachGK) {
				gk += ((SachGK) ds.get(i)).ThanhTien();
			} else {
				tk += ((SachTK) ds.get(i)).ThanhTien();
			}
		}
		System.out.println("Tong tien sach giao khoa: "+ gk);
		System.out.println("Tong tien sach tham khao: "+ tk);
	}
	
//	public void TrungBinh() {
//		double tt = gk+tk;
//		double tb = tt/ds.size();
//		System.out.println("Trung binh: "+ tb);
//	}
//	
	public void TrungBinh() {
		double donGia=0;
		for (int i = 0; i <ds.size(); i++) {
			donGia += ds.get(i).getDonGia();
			double tb = donGia/ ds.size();
			System.out.println("Trung binh: "+ tb);
	}
	}
	
	public void xuatSachGK() {
		for(int i=0;i<ds.size();i++)
			if(ds.get(i) instanceof SachGK)
				System.out.println(ds.get(i));
		
	}
	
	public void xuatSachTK() {
		for(int i=0;i<ds.size();i++)
			if(ds.get(i) instanceof SachTK)
				System.out.println(ds.get(i));
	}
	
	public void SachThang3() {
		System.out.println("Sach thang 3");
		for(int i = 0; i < ds.size(); i++) {
			if(ds.get(i).getNgayNhap().getMonthValue() ==3) {
				System.out.println(ds.get(i).toString());
			}
		}
	}
	
	public void XuatSach() {
		for(int i = 0; i < ds.size(); i++) {
			
			System.out.println(ds.get(i).toString());
			
		}
	}
	
	

}
