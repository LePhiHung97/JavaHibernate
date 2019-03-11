package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Student;
import util.HibernateUtil;

public class StudentDao {

	public static void add(Student student) {
		try {
			SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
			Session session = sessionfactory.openSession();
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static Student findStudent(int masv) {
		Student student = null;
		try {
			SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
			Session session = sessionfactory.openSession();
			session.beginTransaction();
			student = (Student) session.get(Student.class, masv);
			session.getTransaction().commit();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return student;
	}

	public static void deleteStudent(Student student) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(student);
			session.getTransaction().commit();
			session.close();
			System.out.println("Xoa thanhg cong !");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void updateStudent(Student student) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(student);
			session.getTransaction().commit();
			session.close();
			System.out.println("Cap nhat thanh cong !");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static List<Student> getListStudent() {
		List<Student> list = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			list = (List<Student>) session.createQuery("from Student").list();
			session.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return list;
	}
}
