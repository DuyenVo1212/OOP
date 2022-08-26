package X_HANGHOA;
import java.util.ArrayList;
public interface MethodofDSHH {

	public HangHoa timKiem(String maHang) throws Exception;
	
	public int timKiemViTri(String maHang) throws Exception;
	
	public boolean themVao(HangHoa hhoa) throws Exception;
	
	public boolean xoaRa(String maHang) throws Exception;
	
	public boolean suaThongTin(HangHoa hhoa) throws Exception;
	
	public ArrayList <HangHoa> getDsHangHoa();
	
	public ArrayList<HangHoa> getDsHTP();
	
	public ArrayList<HangHoa> getDsHSS();
	
	public ArrayList<HangHoa> getDsHDM();
	
	public ArrayList<HangHoa> getDsHHKhoBan();
	
	public void sortTheoTenHangHoa();
	
	public void sortTheoSoLuongTon(); 
	
	public void sortTheo2ThuocTinh();
}
