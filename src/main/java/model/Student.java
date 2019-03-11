package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Student")
@Entity
public class Student {

	@Id
	@Column(name = "masv")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int masv;

	@Column(name = "hoten")
	private String hoten;

	@Column(name = "namsinh")
	private int namsinh;

	@Column(name = "lop")
	private String lop;

	@Column(name = "diem")
	private double diem;

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	@Column(name = "diem")
	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	@Override
	public String toString() {
		return this.masv + " - " + this.getHoten() + " - " + this.getNamsinh() + " - " + this.getLop() + " - "
				+ this.getDiem();
	}

}