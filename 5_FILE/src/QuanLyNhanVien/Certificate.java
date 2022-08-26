package QuanLyNhanVien;

import java.util.Scanner;

public class Certificate {
	private String CertificatedID, CertificateName, CertificateRank;
	private Date CertificatedDate = new Date();

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(String certificatedID, String certificateName, String certificateRank, Date certificatedDate) {
		super();
		CertificatedID = certificatedID;
		CertificateName = certificateName;
		CertificateRank = certificateRank;
		CertificatedDate = certificatedDate;
	}

	public void nhap(Scanner sc) {
		System.out.print("nhap ma bang cap: ");
		this.CertificatedID = sc.nextLine();
		System.out.print("nhap ten bang cap: ");
		this.CertificateName = sc.nextLine();
		System.out.print("nhap loai bang cap: ");
		this.CertificateRank = sc.nextLine();
		System.out.println("nhap ngay duoc cap bang cap: ");
		this.CertificatedDate.nhap();
	}

	@Override
	public String toString() {
		return "Certificate [CertificatedID=" + CertificatedID + ", CertificateName=" + CertificateName
				+ ", CertificateRank=" + CertificateRank + ", CertificatedDate=" + CertificatedDate.toString() + "]";
	}

}
