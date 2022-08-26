package BTSACH_HIEU;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListGiaoDich {
	private List<GiaoDich> giaoDichArr;
	private int soLuongDat = 0, soLuongNha = 0;
	private double thanhTienDat = 0;
	public ListGiaoDich() {
		super();
		giaoDichArr = new ArrayList<GiaoDich>();
	}

	public void nhapList(int chon, Scanner scanner) {
		if(chon == 1) {
			GiaoDichDat giaoDichDat = new GiaoDichDat();
			giaoDichDat.nhap(scanner);
			if(giaoDichArr.contains(giaoDichDat))
				System.out.println("Da ton tai giao dich nay");
			else {
				giaoDichArr.add(giaoDichDat);
				soLuongDat++;
				thanhTienDat+=giaoDichDat.thanhTien();
			}
		}
		else {
			GiaoDichNha giaoDichNha = new GiaoDichNha();
			giaoDichNha.nhap(scanner);
			if(giaoDichArr.contains(giaoDichNha))
				System.out.println("Da ton tai giao dich nay");
			else {
				giaoDichArr.add(giaoDichNha);
				soLuongNha++;
			}
		}
		
	}
	
	public void xuatList() {
		System.out.println("Danh sach cac giao dich: " );
		for (int i = 0; i < giaoDichArr.size(); i++) {
			System.out.println(giaoDichArr.get(i));
		}
	}

	public int getSoLuongDat() {
		return soLuongDat;
	}


	public int getSoLuongNha() {
		return soLuongNha;
	}
	
	public float thanhTienGiaoDichDat() {
		if(soLuongDat == 0)
			return 0;
		else return (float) (thanhTienDat/soLuongDat);
	}
	
	public void xuatGiaDichNgay() {
		System.out.println("Giao dich trong 9/2013: ");
		for (int i = 0; i < giaoDichArr.size(); i++) {
			if(giaoDichArr.get(i).getThoiGian().getThang() == 9 &&
					giaoDichArr.get(i).getThoiGian().getNam() == 2013)
				System.out.println(giaoDichArr.get(i).toString());
		}
	}
	
	public void sepXepTheoMa() {
		Collections.sort(giaoDichArr);
		// dao nguoc = revert
//		Collections.reverse(giaoDichArr);
		
		// so sanh so hay chuoi la nhung kieu du lieu nguyen thuy co kha nang tu so sanh
		// nen dung sort binh thuong Collections.sort(<ten_mang>)
		
		// cac thuoc tinh so
		// > return 1 || < return -1 || == return 0
		
		/*
		 * if(this.ten.comparetoInore(o.getTen > 0)
		 * return 1
		 * else < 0 
		 * return -1
		 * else 
		 * {
		 * 	if(this.tuoi > o.getTuoi)
		 * 		return 1;
		 * else < return -1
		 * else 0;
		 * }
		 *  
		 * 
		 * 
		 */
		
		
	}
	
}
