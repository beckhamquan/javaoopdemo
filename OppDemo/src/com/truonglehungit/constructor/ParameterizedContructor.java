package com.truonglehungit.constructor;
class SinhVien {
	private String hoTen;
	private int namSinh;
	private float diem;
	private String lop;
	//default construct of sinhvien
	public SinhVien(){
		
	}
	// paramteterized constructor
	public SinhVien(String ht,int ns){
		hoTen = ht;
		namSinh = ns;
		lop = "10a4";
		System.out.println("Họ Tên: "+hoTen +",Năm sinh: "+ namSinh);
		System.out.println("Lớp: "+lop);
	}
	//overloading constructor
	public SinhVien(String ht,int ns,float d){
		hoTen = ht;
		namSinh = ns;
		diem = d;
		lop = "10a4";
		System.out.println("Họ Tên: "+hoTen +", Năm sinh "+namSinh+",Điểm "+diem);
		System.out.println("Lớp: "+lop);
	}
	//display default
	void HienThi(){
		System.out.println("Họ Tên: "+hoTen +", Năm sinh :"+namSinh+ ",lớp: "+lop);
	}
	
	
}

public class ParameterizedContructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien s1= new SinhVien("hung",1990);
		SinhVien s2 = new SinhVien("hung2",1990,10);
	}

}
