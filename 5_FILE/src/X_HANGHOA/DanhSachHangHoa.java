package X_HANGHOA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachHangHoa {
	// Khai báo Danh Sách
	ArrayList<HangHoa> dsHangHoa;
	
	public DanhSachHangHoa () {
		dsHangHoa= new ArrayList<HangHoa>();
	}
	// Tìm kiếm trả Sách
	public HangHoa timKiem(String maHang) throws Exception 
	{
		for (HangHoa hhoa : dsHangHoa)
		{
			if (hhoa.getMaHang().compareToIgnoreCase(maHang)==0)
				return hhoa;
		}
		return null;
	}
	
	// Tìm kiếm trả vị trí
	public int timKiemViTri(String maHang) throws Exception {
		HangHoa hhoa = timKiem(maHang);
		if (hhoa != null)
			return dsHangHoa.indexOf(hhoa);
		return -1;
	}
	
	// Hàm kiểm tra thêm
	public boolean themVao(HangHoa hhoa) throws Exception
	{
		if(dsHangHoa.contains(hhoa)) 
			throw new Exception("Hàng Hóa này đã tồn tại trong Danh Sách!");
		else
			dsHangHoa.add(hhoa);
		return true;
	}

	// Hàm kiểm tra xóa
	public boolean xoaRa(String maHang) throws Exception
	{
		HangHoa hhoa=timKiem(maHang);
		if(hhoa!=null)
		{
			dsHangHoa.remove(hhoa);
			return true;
		}
		else throw new Exception("Không tìm thấy mã Hàng Hóa trong Danh sách");
	}

	// Hàm kiểm tra sửa
	public boolean suaThongTin(HangHoa hhoa) throws Exception
	{
		int vitri=dsHangHoa.indexOf(hhoa);
		if (vitri>=0)
		{
			dsHangHoa.set(vitri, hhoa);
			return true;
		}
		else throw new Exception("Sửa thất bại!");
	}
	
	// Hàm lấy danh sách toàn bộ Hàng hóa
	public ArrayList <HangHoa> getDsHangHoa()
	{
		return dsHangHoa;
	}
	
	// Hàm lấy danh sách Hàng Thực Phẩm
	public ArrayList<HangHoa> getDsHTP()
	{
		ArrayList<HangHoa> dsHTP = new ArrayList<HangHoa>();
		for (HangHoa hhoa: dsHangHoa)		
		{
			if (hhoa instanceof HangThucPham)		
				dsHTP.add(hhoa);				
		}
		return dsHTP;
	}
	
	// Hàm lấy danh sách Hàng Sành Sứ
	public ArrayList<HangHoa> getDsHSS()
	{
		ArrayList<HangHoa> dsHSS = new ArrayList<HangHoa>();
		for (HangHoa hhoa: dsHangHoa)		
		{
			if (hhoa instanceof HangSanhSu)		
				dsHSS.add(hhoa);				
		}
		return dsHSS;
	}
	// Hàm lấy danh sách Hàng Điện máy
	public ArrayList<HangHoa> getDsHDM()
	{
		ArrayList<HangHoa> dsHDM = new ArrayList<HangHoa>();
		for (HangHoa hhoa: dsHangHoa)		
		{
			if (hhoa instanceof HangDienMay)		
				dsHDM.add(hhoa);				
		}
		return dsHDM;
	}
	
	// Hàm lấy Danh sách hàng hóa khó bán
	public ArrayList<HangHoa> getDsHHKhoBan()
	{
		ArrayList<HangHoa> dsHHKhoBan = new ArrayList<HangHoa>();
		for (HangHoa hhoa: dsHangHoa)		
		{
			if (hhoa.mucDoBuonBan().compareToIgnoreCase("Khó Bán")==0)
				dsHHKhoBan.add(hhoa);					
		}
		return dsHHKhoBan;
	}
	
	// Sắp xếp theo tên Hàng Hóa tăng dần
	public void sortTheoTenHangHoa() {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
			}

		});
	}
	// Sắp xếp theo Số lượng tồn giảm dần
	public void sortTheoSoLuongTon() {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				Integer s1=o1.getSoLuongTon();
				Integer s2=o2.getSoLuongTon();
				return s2.compareTo(s1);
			}
		});
	}
	// Sắp xếp 2 thuộc tính theo Thành Tiền->Tên
	public void sortTheo2ThuocTinh() { 
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) 
			{
				Double s1 = o1.thanhTien();
				Double s2 = o2.thanhTien();
				int comp1 = s1.compareTo(s2);
				
				// Nếu Thành Tiền bằng nhau thì so sánh theo Tên
				if (comp1 == 0) 
					return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
				else
					return comp1;
			}
		});
	}
}
