package com.phihung.JavaHibernate;

import java.util.Scanner;
import service.StudentService;
import util.ScreenUtil;

public class App {
	public static void main(String[] args) {
	
		int num = 0;
		do {

			ScreenUtil.printMenu();
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			switch (num) {
			case 1: {
				StudentService.addStudent();
				break;
			}
			case 2: {
				StudentService.editStudent();
				break;
			}
			case 3: {
				StudentService.deleteStudent();
				break;
			}
			case 4: {
				StudentService.findStudent();
				break;
			}
			case 5: {
				StudentService.getListStudent();
				break;
			}

			case 6: {
				// StudentService.sortStudent();
				break;
			}
			case 7:
				System.exit(0);
				break;
			}

		} while (num != 7);
	}
}
