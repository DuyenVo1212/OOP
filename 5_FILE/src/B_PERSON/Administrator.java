package B_PERSON;

import java.util.ArrayList;

public class Administrator {
	private ArrayList<Person> listStudent = new ArrayList<>();
	private ArrayList<Person> listEmployee = new ArrayList<>();
	private ArrayList<Person> listCustomer = new ArrayList<>();

	private void addStudent(Student sd) {
		listStudent.add(sd);
	}

	private void addEmployee(Employee el) {
		listStudent.add(el);
	}

	private void addCustomer(Customer cs) {
		listStudent.add(cs);
	}

	private void showStudent() {
		if (listStudent.size() == 0) {
			System.out.println("No person");
			return;
		}
		for (Person p : listStudent) {
			System.out.println(p.toString());
		}
	}

	private void showCustomer() {
		if (listCustomer.size() == 0) {
			System.out.println("No person");
			return;
		}
		for (Person p : listCustomer) {
			System.out.println(p.toString());
		}
	}

	private void showEmployee() {
		if (listEmployee.size() == 0) {
			System.out.println("No person");
			return;
		}
		for (Person p : listEmployee) {
			System.out.println(p.toString());
		}
	}

	private void menusub(int choice) {
		if (choice == 1) {
			System.out.println("1.Them student");
			System.out.println("2.Them employee");
			System.out.println("3.Them customer");
		}

		else if (choice == 2) {
			System.out.println("1.Show student");
			System.out.println("2.Show employee");
			System.out.println("3.Show customer");
		}
	}

	public void menu() {
		while (true) {
			System.out.println("1.add person");
			System.out.println("2.show list person");
			System.out.println("3.exit");
			int choice=Input.inputInt("Nhap lua chon");
			menu(0);

		}
	}

	private void menu(int choice) {
		int choice1 = 0;
		switch (choice) {
		case 1:
			menusub(1);
			choice1 = Input.inputInt("Nhap choice");
			if (choice == 1) {
				Student t = Student.inputStudent();
				addStudent(t);
			} else if (choice == 2) {
				Employee el = Employee.inputEmployee();
				addEmployee(el);
			} else {
				Customer ct = Customer.inputCustomer();
				addCustomer(ct);
			}
			break;
		case 2:
			menusub(2);
			choice1 = Input.inputInt("Nhap lua chon");
			if (choice == 1) {
				showStudent();
			} else if (choice == 2) {
				showEmployee();
			} else {
				showCustomer();
			}
			break;
		case 3:
			System.exit(0);
			break;
		}
	}
}