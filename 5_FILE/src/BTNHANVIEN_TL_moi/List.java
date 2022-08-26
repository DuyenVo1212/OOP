package BTNHANVIEN_TL_moi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class List {
	ArrayList<NhanVien> ds;
	Scanner sc;
	public List() {
		ds=new ArrayList<>();
		sc=new Scanner(System.in);
	}
	public void them() {
		NhanVien nv=new NhanVien();
		System.out.println("Nhap ma: ");
		nv.setManv(sc.nextLine());
		System.out.println("Nhap so sp");
		nv.setSosp(sc.nextInt());
		ds.add(nv);
		sc.hasNextLine();
	}
	//xuat ds
	public void thongtin() {
		ds.get(0).tieude();
		for(int i=0;i<ds.size();i++) {
			System.out.println(ds.get(i));
		}
	}
	//xuat tt vuot chuan
	public void ttvuotchuan() {
		System.out.println("Thong tin nv vuot chuan");
		for(int i=0;i<ds.size();i++) {
			if(ds.get(i).vuotchuan()==true) {
				System.out.println(ds.get(i));
			}
		}
	}
	//dem so luong nv ko vuot chuan
	public int demkovuotchuan() {
		System.out.println("Thong tin nv ko vuot chuan");
		int count=0;
		for(int i=0;i<ds.size();i++) {
			if(ds.get(i).vuotchuan()==false) {
				++count;
			}
		}
		return count;
	}
	//tim nhan vien co luong cao nhat va thap nhat
	public void timluongminmax() {
		NhanVien luongmax=ds.get(0);
		NhanVien luongmin=ds.get(0);
		for(int i=0;i<ds.size();i++) {
			if(ds.get(i).getluong()>luongmax.getluong()) {
				luongmax=ds.get(i);
			}
			if(ds.get(i).getSosp()<luongmin.getSosp()) {
				luongmin=ds.get(i);
			}
		}
		System.out.println("Nhan vien luong cao nhat"+luongmax);
		System.out.println("Nhan vien luong cao nhat"+luongmin);
		
	}
	
	//tim nv ko vuot chuan nhung co so luong cao nhat
	public void nvkovuotchuanluongcao() {
		NhanVien nv;
		int j=0;
		for(int i=0;i<ds.size();i++)
		{
			if(ds.get(i).vuotchuan()==false) {
				j=i;
				break;
			}
		}
		nv=ds.get(j);
		for(int i=j+1;i<ds.size();i++) {
			if(ds.get(i).vuotchuan()==false) {
				if(ds.get(i).getluong()>nv.getluong()) {
					nv=ds.get(i);
				}
			}
		}
		System.out.println("Ket qua");
	}
	public void timkirm(String ma) {
		int j=-1;
		for(int i=j+1;i<ds.size();i++) {
			if(ds.get(i).getManv().equals(ma)) {
				j=i;
				break;
			}
		}
		if(j!=-1) {
			System.out.println(ds.get(j));
		}
		else System.out.println("Ko thay");
	}
	public void sortmatangdan() {
		Collections.sort(ds);
	}
	public void xuatnv() {
		for(NhanVien d:ds) {
			System.out.println(d);
		}
	}
	public void xoanv(int n) {
		if(n>0&&n<ds.size()) {
			ds.remove(n);
		}
	}
}
