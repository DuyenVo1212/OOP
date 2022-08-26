package t7QuanLyThucPham;

import java.util.ArrayList;

public class DanhSachHangHoa {
	private ArrayList<HangHoa> dSHangHoa;
	
	public DanhSachHangHoa() {
		dSHangHoa = new ArrayList<HangHoa>();
	}
	
	public DanhSachHangHoa(int i) {
		dSHangHoa = new ArrayList<HangHoa>(i);
	}
	
	public boolean themHangHoa(HangHoa x) {
		if(dSHangHoa.contains(x)) return false;
		dSHangHoa.add(x);
		return true;
	}
	
	public HangHoa timKiem(String x) {
		for(HangHoa i: dSHangHoa) {
			if(i.getMaHang().equalsIgnoreCase(x))
				return i;
		}
		return null;
	}
	
	public ArrayList getHetDanhSach() {
		return dSHangHoa;
	}
	
	public boolean xoa(String x) {
		if(timKiem(x) == null) return false;
		dSHangHoa.remove(timKiem(x));
		return true;
	}
	
	public void sua(HangHoa x) {
		int viTri = dSHangHoa.indexOf(x);
		if(viTri >= 0)
			dSHangHoa.set(viTri, x);
	}
	
	public String toString() {
		String str = "";
		str += "\nHang Thuc Pham: \n" + HangThucPham.tieuDe() + "\n";
		for(HangHoa i: dSHangHoa)
			if(i instanceof HangThucPham) str += i + "\n";
		str += "\nHang Dien May: \n" + HangDienMay.tieuDe() + "\n";
		for(HangHoa i: dSHangHoa)
			if(i instanceof HangDienMay) str += i + "\n";
		str += "\nHang Sanh Su: \n" + HangSanhSu.tieuDe() + "\n";
		for(HangHoa i: dSHangHoa)
			if(i instanceof HangSanhSu) str += i + "\n";
		return str;
	}
}
