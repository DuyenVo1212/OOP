package X_PHONG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class DanhSachPhong {
	
	// Khai báo mảng DSPhong
	private ArrayList<PhongHoc> DSPhong;

	// Constructor
	public DanhSachPhong() {
		DSPhong = new ArrayList<PhongHoc>();
	}

	// Hàm Thêm Phòng h�?c
	public void themVao(PhongHoc phong) throws Exception {
		if (DSPhong.contains(phong))
			throw new Exception("Mã phòng đã tồn tại!");
		else DSPhong.add(phong);
	}

	// Hàm Tìm kiếm trả v�? Phòng
	public PhongHoc timKiem(String maPhong) {
		for (PhongHoc phong : DSPhong) {
			if (phong.getMaPhong().equalsIgnoreCase(maPhong))
				return phong;
		}
		return null;
	}

	// Hàm Tìm kiếm trả v�? vị trí
	public int timKiemViTri(String maPhong) {
		PhongHoc find = timKiem(maPhong);
		if (find != null)
			return DSPhong.indexOf(find);
		return -1;
	}

	// Hàm kiểm tra xóa
	public boolean xoaRa(String maPhong) throws Exception
	{
		PhongHoc phong=timKiem(maPhong);
		if(phong!=null) {
			DSPhong.remove(phong);
			return true;
		}
		else throw new Exception("Không tìm thấy mã Phòng!");
	}
	// Hàm kiểm tra sửa
	public boolean suaDoi(PhongHoc phong) throws Exception 
	{
		int vitri=DSPhong.indexOf(phong);
		if (vitri>=0)
		{
			DSPhong.set(vitri, phong);
			return true;
		}
		else throw new Exception("Sửa thất bại!");
	}
	// Hàm lấy Danh sách các phòng �?ạt chuẩn
	public ArrayList<PhongHoc> getDSPhongDatChuan() {
		ArrayList<PhongHoc> temp = new ArrayList<PhongHoc>();
		for (PhongHoc phong : DSPhong) {
			if (phong.datChuan())
				temp.add(phong);
		}
		return temp;
	}

	// Hàm lấy Danh sách các phòng có 60 máy
	public ArrayList<PhongHoc> DSPhongCo60May() {
		ArrayList<PhongHoc> temp = new ArrayList<PhongHoc>();
		for (PhongHoc phong : DSPhong) {
			if (phong instanceof PhongMayTinh && ((PhongMayTinh) phong).getSoLuongMayTinh() == 60)
				temp.add(phong);
		}
		return temp;
	}
	
	// Lấy danh sách Phòng Lý thuyết
	public ArrayList<PhongHoc> getDsPLT()
	{
		ArrayList<PhongHoc> dsPLT = new ArrayList<PhongHoc>();
		for (PhongHoc phong: DSPhong)		
		{
			if (phong instanceof PhongLyThuyet)		
				dsPLT.add(phong);				
		}
		return dsPLT;
	}
	
	// Lấy danh sách Phòng Máy tính
	public ArrayList<PhongHoc> getDsPMT()
	{
		ArrayList<PhongHoc> dsPMT = new ArrayList<PhongHoc>();
		for (PhongHoc phong: DSPhong)		
		{
			if (phong instanceof PhongMayTinh)		
				dsPMT.add(phong);				
		}
		return dsPMT;
	}
	// Lấy danh sách Phòng tn
	public ArrayList<PhongHoc> getDsPTN()
	{
		ArrayList<PhongHoc> dsPTN = new ArrayList<PhongHoc>();
		for (PhongHoc phong: DSPhong)		
		{
			if (phong instanceof PhongThiNghiem)		
				dsPTN.add(phong);				
		}
		return dsPTN;
	}
	// Sắp xếp Tăng dần theo dãy nhà
	public void sortTheoDayNha() {
		Collections.sort(DSPhong, new Comparator<PhongHoc>() {
			public int compare(PhongHoc o1, PhongHoc o2) {
				return o1.getDayNha().compareToIgnoreCase(o2.getDayNha());
			}

		});
	}

	// Sắp xếp Giảm dần theo diện tích
	public void sortTheoDienTich() {
		Collections.sort(DSPhong, new Comparator<PhongHoc>() {
			public int compare(PhongHoc o1, PhongHoc o2) {
				Double s1 = o1.getDienTich();
				Double s2 = o2.getDienTich();
				return s2.compareTo(s1);
			}
		});
	}

	// Sắp xếp Tăng dần theo số bóng đèn
	public void sortTheoBongDen() {
		Collections.sort(DSPhong, new Comparator<PhongHoc>() {
			public int compare(PhongHoc o1, PhongHoc o2) {
				Integer s1 = o1.getSoBongDen();
				Integer s2 = o2.getSoBongDen();
				return s1.compareTo(s2);
			}
		});
	}

	

	// Tổng số phòng h�?c
	public int getSoLuongPhong() {
		return DSPhong.size();
	}
	
	// �?ếm số dãy nhà không trùng nhau
	public int demSoDayNha() {
		HashMap<String, PhongHoc> ht = new HashMap<String, PhongHoc>();
		for (PhongHoc phongHoc : DSPhong) {
			ht.put(phongHoc.getDayNha(), phongHoc);
		}
		return ht.size();
	}
	
	// �?ếm số dãy nhà không trùng nhau
	public int demSoDayNha2() {
		HashSet<String> ht = new HashSet<String>();
		for (PhongHoc phongHoc : DSPhong) {
			ht.add(phongHoc.getDayNha());
		}
		return ht.size();
	}
	
	// Sắp xếp theo 3 thuộc tính
	// Từ số bóng đèn đến -> diện tích -> mã phòng
	public void sortTheo3ThuocTinh() { 
		Collections.sort(DSPhong, new Comparator<PhongHoc>() {
			public int compare(PhongHoc o1, PhongHoc o2) {
				int comp1 = ((Integer) o1.getSoBongDen()).compareTo((Integer) o2.getSoBongDen());
				if (comp1 == 0) 
				{
					Double s1 = o1.getDienTich();
					Double s2 = o2.getDienTich();
					int comp2 = s2.compareTo(s1);
					if (comp2 == 0)
						return o1.getMaPhong().compareToIgnoreCase(o2.getMaPhong());
					else
						return comp2;

				} else
					return comp1;
			}
		});
	}

	// Get & Set danh sách Phòng
	public void setDSPhong(ArrayList<PhongHoc> dSPhong) {
		DSPhong = dSPhong;
	}
	public ArrayList<PhongHoc> getDSPhong() {
		return DSPhong;
	}
}
