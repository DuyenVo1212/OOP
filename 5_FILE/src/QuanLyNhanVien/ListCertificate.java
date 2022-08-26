package QuanLyNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class ListCertificate {
	private ArrayList<Certificate> lc = new ArrayList<Certificate>();

	public ListCertificate() {
		lc = new ArrayList<Certificate>();
	}
	public ArrayList<Certificate> getLc() {
		return lc;
	}

	public void setLc(ArrayList<Certificate> lc) {
		this.lc = lc;
	}
	
	public void them(Scanner sc) {
		Certificate x = new Certificate();
		x.nhap(sc);
		lc.add(x);
		System.out.println("them bang cap thanh cong!");
	}
	public ArrayList<String> xuat() {
		ArrayList<String> listCer = new ArrayList<String>();
		for(Certificate i : lc) {
			listCer.add(i.toString());
		}
		return listCer;
	}
}
