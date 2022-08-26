package Phim_ThiThucHanh;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachPhim {
	private List<Phim> dsPhim;

	public DanhSachPhim(int soLuong) {
		dsPhim = new ArrayList<Phim>(soLuong);
	}
	
	public DanhSachPhim() {
		dsPhim = new ArrayList<Phim>();
	}
	
	public Phim searchMa(String x) {
		for(Phim i: dsPhim) {
			if(i.getMaPhim().compareToIgnoreCase(x) == 0) return i;
		}
		return null;
	}
	
	public boolean themPhim(Phim x) {
		if(dsPhim.contains(x)) 
			return false;
		else
			dsPhim.add(x);
			return true;
	}
	
	public boolean xoaPhim(String x) {
		if(searchMa(x) == null) 
			return false;
		else
			dsPhim.remove(searchMa(x));
			return true;
	}
	
	public int soLuongPhim() {
		return dsPhim.size();
	}
	
	public String tongDoanhThu() {
		DecimalFormat df = new DecimalFormat("###,###,###");
		int sum = 0;
		for(Phim i: dsPhim) {
			sum += i.doanhThu();
		}
		return df.format(sum);
	}
	
	public void sortTangTenPhim() {
		Collections.sort(dsPhim, new Comparator<Phim>() {
			public int compare(Phim o1, Phim o2) {
				return o1.getTenPhim().compareToIgnoreCase(o2.getTenPhim());
			}
		});
	}
	
	public List<Phim> dsPhimNoi() {
		List<Phim> dsPhimNoi = new ArrayList<Phim>();
		for(Phim i: dsPhim) {
			if(i instanceof PhimNoi) {
				dsPhimNoi.add(i);
			}
		} 
		return dsPhimNoi;
	}
	
	public String xuatHet() {
		String str = "";
		str += "Phim noi: \n" + PhimNoi.tieuDe() + "\n";
		for(Phim i: dsPhim) {
			if(i instanceof PhimNoi) str += i + "\n";
		}
		str += "Phim Ngoai: \n"+ PhimNgoai.tieuDe()+"\n";
		for(Phim i: dsPhim) {
			if(i instanceof PhimNgoai) str += i + "\n";
		}
		return str;
	}
	
	public String xuatHetTheoNgay(LocalDate a) {
		String str = "";
		str += "Phim noi: \n" + PhimNoi.tieuDe() + "\n";
		for(Phim i: dsPhim) {
			if(i instanceof PhimNoi && i.getNgayChieu().isAfter(a) == true) str += i + "\n";
		}
		str += "Phim Ngoai: \n"+ PhimNgoai.tieuDe()+"\n";
		for(Phim i: dsPhim) {
			if(i instanceof PhimNgoai&&i.getNgayChieu().isAfter(a) == true) str += i + "\n";
		}
		return str;
	}
}
