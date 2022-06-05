package pl.air.hr.init;

import java.math.BigDecimal;
import java.time.LocalDate;

import pl.air.hr.model.*;

public class DataLoader {

	public void insertData() {
		/* działy */
		Department marketing =  createDepartment("Marketing",  "Pokój 2.3");
		Department sales =      createDepartment("Sprzedaż",   "Budynek A");
		Department accounting = createDepartment("Księgowość", "Budynek B, piętro 2");
		
		/* stanowiska */
		Position manager =    createPosition("Kierownik");
		Position expert =     createPosition("Ekspert");
		Position specialist = createPosition("Specjalista");
		
		/* pracownicy */
		Employee zk = createEmployee("Zofia",   "Kowalska",  "2019-02-01", "6900", marketing, manager);
		Employee jn = createEmployee("Jan",     "Nowak",     "2009-07-15", "4900", marketing, expert);
		Employee uk = createEmployee("Urszula", "Kowalczyk", "2005-01-01", "3500", marketing, specialist);
		Employee ap = createEmployee("Anna",    "Petros",    "2017-08-20", "2900", marketing, specialist);

		Employee em = createEmployee("Ewa",      "Mucha",    "1997-01-01", "9200", sales,     manager);
		Employee js = createEmployee("Jacek",    "Szymczak", "1999-06-01", "7200", sales,     expert);
		Employee wt = createEmployee("Wojciech", "Trzaska",  "2012-10-01", "4500", sales,     expert);
		Employee mk = createEmployee("Marek",    "Kania",    "2015-05-01", "2900", sales,     specialist);
		
		Employee md = createEmployee("Monika",   "Daszyńska", "2001-12-01", "8800", accounting, manager);
		Employee wf = createEmployee("Weronika", "Filipiak",  "2008-09-01", "4900", accounting, specialist);
		Employee kt = createEmployee("Kornelia", "Trafas",    "2011-04-01", "5100", accounting, specialist);
	}

	private Employee createEmployee(String firstName, String lastName, String hireDate, String salary, Department department, Position position) {
		Employee one = new Employee();
		one.setFirstName(firstName);
		one.setLastName(lastName);
		one.setHireDate(LocalDate.parse(hireDate));
		one.setSalary(new BigDecimal(salary));
		one.setDepartment(department);
		one.setPosition(position);
		return one;
	}

	private Position createPosition(String name) {
		Position one = new Position();
		one.setName(name);
		return one;
	}

	private Department createDepartment(String name, String location) {
		Department one = new Department();
		one.setName(name);
		one.setLocation(location);
		return one;
	}

}
