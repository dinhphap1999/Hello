/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien;
import java.util.Scanner;

public class SinhVien {

    private String hoTen;
    private int maSV;
    private String diaChi;
    private double diemTB;
     Scanner sc = new Scanner(System.in);
    
    public SinhVien(){
        this.hoTen = " ";
        this.maSV = 0;
        this.diaChi = " ";
        this.diemTB = 0;
    }
     public SinhVien(String hT, int mSV, String dC, double dTB)
     {
        this.hoTen = hT;
        this.maSV = mSV;
        this.diaChi = dC;
        this.diemTB = dTB;
     }
     public void nhapThongTinSV(){
         System.out.print("\nNhập mã SV:");
         maSV = Integer.parseInt(sc.nextLine());
         System.out.print("Nhập họ tên:");
         hoTen = sc.nextLine();
         System.out.print("Nhập Địa chỉ:");
         diaChi = sc.nextLine();
         System.out.print("Nhập điểm trung bình:");
         diemTB = Double.parseDouble(sc.nextLine());
     }
    public String toString(){
        return "Họ tên: "+hoTen+"Mã sinh viên: "+maSV+"Địa chỉ: "+diaChi+"Điểm trung bình: "+diemTB;
    }
}
