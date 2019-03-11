package service;

import java.util.List;
import java.util.Scanner;

import dao.StudentDao;
import model.Student;

public class StudentService {

	static Scanner input = new Scanner(System.in);

	public static void inputInformation(Student student) {
		input.nextLine();
		System.out.println("Nhap vao hoten : ");
		student.setHoten(input.nextLine());

		System.out.println("Nhap vao nam sinh : ");
		student.setNamsinh(input.nextInt());

		input.nextLine();
		System.out.println("Nhap vao lop : ");
		student.setLop(input.nextLine());

		System.out.println("Nhap vao diem : ");
		student.setDiem(input.nextDouble());
	}

	public static void addStudent() {
		Student student = new Student();
		inputInformation(student);
		StudentDao.add(student);
	}

	public static void deleteStudent() {
		System.out.println("Nhap vao ma sinh vien : ");
		int masv = input.nextInt();
		Student student = StudentDao.findStudent(masv);
		if (student == null)
			System.out.println("Khong tim thay sinh vien !");
		else
			StudentDao.deleteStudent(student);
	}

	public static void findStudent() {
		System.out.println("Nhap vao ma sinh vien :");
		int masv = input.nextInt();
		Student student = StudentDao.findStudent(masv);
		if (student == null)
			System.out.println("Khong tim thay sinh vien");
		else
			System.out.println(student);
	}

	public static void editStudent() {
		System.out.println("Nhap vao ma sinh vien : ");
		int masv = input.nextInt();
		Student student = StudentDao.findStudent(masv);
		if (student == null)
			System.out.println("Khong tim thay sinh vien !");
		else {
			inputInformation(student);
			StudentDao.updateStudent(student);
		}
	}

	public static void getListStudent() {
		List<Student> list = StudentDao.getListStudent();
		if (list.isEmpty())
			System.out.println("Khong co sinh vien nao trong danh sach !");
		else
			for (Student student : list)
				System.out.println(student);
	}

	public void sortStudent() {

	}

}
