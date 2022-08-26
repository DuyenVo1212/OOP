package t7_QuanLyPhongHoc_UT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachPhong  {
	private List<Phong> dsPhong;
	
	public DanhSachPhong() {
		dsPhong = new ArrayList<Phong>();
	}
	
	public DanhSachPhong(int i) {
		dsPhong = new ArrayList<Phong>();
	}
	
	public boolean add(Phong x) {
		if(dsPhong.contains(x)) return false;
		dsPhong.add(x);
		return true;
	}
	
	public Phong search(String x) {
		for(Phong i: dsPhong) {
			if(i.getMaPhong().compareToIgnoreCase(x) == 0) return i;
		}
		return null;
	}
	
	public String toString() {
		String str = "";
		str += "Phong ly thuyet:\n" + LyThuyet.tieuDe() + "\n";
		for(Phong i: dsPhong)
			if(i instanceof LyThuyet) str += i + "\n";
		str += "\nPhong may tinh:\n"+ MayTinh.tieuDe() + "\n";
		for(Phong i: dsPhong)
			if(i instanceof MayTinh) str += i + "\n";
		str += "\nPhong thi nghiem:\n"+ ThiNghiem.tieuDe() + "\n";
		for(Phong i: dsPhong)
			if(i instanceof ThiNghiem) str += i+"\n";
		return str;
	}
	
	public List<Phong> datChuan() {
		List<Phong> dsDatChuan = new ArrayList<Phong>();
		for(Phong i: dsDatChuan) {
			if(i.datChuan()) 
				dsDatChuan.add(i);
		}
		return dsDatChuan;
	}
	
	public void sortTangDayNha() {
		Collections.sort(dsPhong, new Comparator<Phong>() {
			@Override
			public int compare(Phong o1, Phong o2) {
				return o1.getDayNha().compareToIgnoreCase(o2.getDayNha());
			}
		});
	}
	
	public void sortGiamDienTich() {
		Collections.sort(dsPhong,new Comparator<Phong>() {
			@Override
			public int compare(Phong o1, Phong o2) {
				return Float.compare(o2.getDienTich(),o1.getDienTich());
			}
		});
	}
	
	public void sortTangSLBongDen() {
		Collections.sort(dsPhong,new Comparator<Phong>() {
			@Override
			public int compare(Phong o1, Phong o2) {
				return Integer.compare(o1.getSoBongDen(), o2.getSoBongDen());
			}
		});
	}
	
	public boolean updateSoMayTinh(String x, int newSL) {
		for(Phong i: dsPhong) {
			if(i instanceof MayTinh && i.getMaPhong().compareToIgnoreCase(x) == 0) {
					((MayTinh)i).setSoLuongMT(newSL);
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String x) {
		if(search(x) == null) return false;
		dsPhong.remove(search(x));
		return true; 
	}
	
	public int tongSoPhongHoc() {
		return dsPhong.size();
	}
	
	public List<Phong> tren60May() {
		List<Phong> ds60May = new ArrayList<Phong>();
		for(Phong i: dsPhong)
			if(i instanceof MayTinh&&((MayTinh)i).getSoLuongMT()>=60)
				ds60May.add(i);
		return ds60May;
	}
}
