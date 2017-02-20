package com.series.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {

	StudentAddress studentAddress = new StudentAddress();
	studentAddress.setAddress("VIA Vittorio Emanuele");

	StudentContact studentContact = new StudentContact();
	studentContact.setContact_type("email");
	studentContact.setContact_detail("james@gmail.com");

	StudentContact studentContact_ = new StudentContact();
	studentContact_.setContact_type("mobile");
	studentContact_.setContact_detail("+1 809 665 7801");

	Student student = new Student();
	studentContact.setStudent(student);
	student.setStudent_name("Mattew");
	student.setStudentAddress(studentAddress);
	student.getStudentContact().add(studentContact);

	Student student1 = new Student();
	studentContact.setStudent(student1);
	student1.setStudent_name("james");
	student1.setStudentAddress(studentAddress);
	student1.getStudentContact().add(studentContact);

	Student student2 = new Student();
	studentContact_.setStudent(student2);
	student2.setStudent_name("Giacomo");
	student2.setStudentAddress(studentAddress);
	student2.getStudentContact().add(studentContact_);

	Student student3 = new Student();
	studentContact_.setStudent(student3);
	student3.setStudent_name("Magnus");
	student3.setStudentAddress(studentAddress);
	student3.getStudentContact().add(studentContact_);

	Student student4 = new Student();
	studentContact_.setStudent(student4);
	student4.setStudent_name("Alessandro");
	student4.setStudentAddress(studentAddress);
	student4.getStudentContact().add(studentContact_);

	(studentAddress.getStudents()).add(student);
	(studentAddress.getStudents()).add(student1);
	(studentAddress.getStudents()).add(student2);
	(studentAddress.getStudents()).add(student3);
	(studentAddress.getStudents()).add(student4);

	Director director = new Director();
	director.setLevel(5);
	director.setName("Giacomo Girolamo");

	Director director_ = new Director();
	director_.setLevel(3);
	director_.setName("Giulio Medici");

	Director director_1 = new Director();
	director_1.setLevel(3);
	director_1.setName("Janio Medici");

	Professor professor = new Professor();
	professor.setExperience(20);
	professor.setTitle("DR. Donatelo");

	Professor professor_ = new Professor();
	professor_.setExperience(25);
	professor_.setTitle("DR. Michelangelo");

	Professor professor_1 = new Professor();
	professor_1.setExperience(12);
	professor_1.setTitle("DR. Maldini");

	Professor professor_2 = new Professor();
	professor_2.setExperience(15);
	professor_2.setTitle("DR. De Rossi");

	Professor professor_3 = new Professor();
	professor_3.setExperience(15);
	professor_3.setTitle("DR. Luca Toni");

	Professor professor_4 = new Professor();
	professor_4.setExperience(32);
	professor_4.setTitle("DR. GianLuigi Buffon");

	Professor professor_5 = new Professor();
	professor_5.setExperience(4);
	professor_5.setTitle("DR. Stefano D'alessio");

	Telephone tel_5 = new Telephone();
	tel_5.setArea_code(99);
	tel_5.setTelephone_number("80056665");

	Telephone tel_6 = new Telephone();
	tel_6.setArea_code(44);
	tel_6.setTelephone_number("35799810");

	professor_4.getPhones().add(tel_5);
	professor_5.getPhones().add(tel_6);

	professor.getDirectors().add(director);
	professor.getStudents().add(student);
	professor.getStudents().add(student);
	professor.getStudents().add(student1);
	professor.getStudents().add(student2);

	Telephone tel_7 = new Telephone();
	tel_7.setArea_code(78);
	tel_7.setTelephone_number("80054551");

	professor.getPhones().add(tel_7);

	professor_.getDirectors().add(director);
	professor_.getStudents().add(student);
	professor_.getStudents().add(student1);
	professor_.getStudents().add(student2);
	professor_.getStudents().add(student3);
	professor_.getStudents().add(student4);

	Telephone tel_8 = new Telephone();
	tel_8.setArea_code(87);
	tel_8.setTelephone_number("710540880");

	professor_.getPhones().add(tel_8);

	professor_1.getDirectors().add(director_);
	professor_1.getStudents().add(student);
	professor_1.getStudents().add(student1);
	professor_1.getStudents().add(student2);
	professor_1.getStudents().add(student3);
	professor_1.getStudents().add(student4);

	Telephone tel_9 = new Telephone();
	tel_9.setArea_code(96);
	tel_9.setTelephone_number("635632560");

	professor_1.getPhones().add(tel_9);

	professor_2.getDirectors().add(director);
	professor_2.getStudents().add(student);
	professor_2.getStudents().add(student1);
	professor_2.getStudents().add(student2);
	professor_2.getStudents().add(student3);
	professor_2.getStudents().add(student4);

	professor_3.getDirectors().add(director_);
	professor_3.getStudents().add(student);
	professor_3.getStudents().add(student1);
	professor_3.getStudents().add(student2);
	professor_3.getStudents().add(student3);
	professor_3.getStudents().add(student4);

	professor_4.getDirectors().add(director);
	professor_4.getStudents().add(student);
	professor_4.getStudents().add(student1);
	professor_4.getStudents().add(student2);
	professor_4.getStudents().add(student3);
	professor_4.getStudents().add(student4);

	professor_5.getDirectors().add(director);
	professor_5.getDirectors().add(director_1);
	professor_5.getStudents().add(student);
	professor_5.getStudents().add(student1);
	professor_5.getStudents().add(student2);
	professor_5.getStudents().add(student3);
	professor_5.getStudents().add(student4);

	HighSchool school = new HighSchool();
	school.setSchool_name("Notre Dame");
	school.getStudents().add(student);
	school.getStudents().add(student1);
	school.getStudents().add(student2);
	school.getStudents().add(student3);
	school.getStudents().add(student4);
	school.getDirectors().add(director);
	school.getDirectors().add(director_);
	school.getDirectors().add(director_1);
	school.getProfessors().add(professor);
	school.getProfessors().add(professor_);

	HighSchool school_ = new HighSchool();
	school_.setSchool_name("Dante Aleghieri");
	school_.getStudents().add(student);
	school_.getStudents().add(student1);
	school_.getStudents().add(student2);
	school_.getStudents().add(student3);
	school_.getStudents().add(student4);
	school_.getDirectors().add(director);
	school_.getDirectors().add(director_);
	school_.getDirectors().add(director_1);
	school_.getProfessors().add(professor);
	school_.getProfessors().add(professor_);
	school_.getProfessors().add(professor_1);
	school_.getProfessors().add(professor_2);
	school_.getProfessors().add(professor_3);
	school_.getProfessors().add(professor_4);

	Telephone tel_2 = new Telephone();
	tel_2.setArea_code(40);
	tel_2.setTelephone_number("800465465");

	director.getPhones().add(tel_2);
	director.setHighSchool(school);
	director.setHighSchool(school_);
	director.getProfessors().add(professor);
	director.getProfessors().add(professor_1);
	director.getProfessors().add(professor_2);
	director.getProfessors().add(professor_3);
	director.getProfessors().add(professor_4);

	HighSchool school_1 = new HighSchool();
	school_1.setSchool_name("Vittorio Emanuele");
	school_1.getStudents().add(student);
	school_1.getStudents().add(student1);
	school_1.getStudents().add(student2);
	school_1.getStudents().add(student3);
	school_1.getStudents().add(student4);
	school_1.getDirectors().add(director);
	school_1.getDirectors().add(director_);
	school_1.getDirectors().add(director_1);
	school_1.getProfessors().add(professor_);
	school_1.getProfessors().add(professor_1);
	school_1.getProfessors().add(professor_3);
	school_1.getProfessors().add(professor_4);

	HighSchool school_2 = new HighSchool();
	school_2.setSchool_name("Giuliano Medici");
	school_2.getStudents().add(student);
	school_2.getStudents().add(student1);
	school_2.getStudents().add(student2);
	school_2.getStudents().add(student3);
	school_2.getStudents().add(student4);
	school_2.getDirectors().add(director);
	school_2.getDirectors().add(director_);
	school_2.getDirectors().add(director_1);
	school_2.getProfessors().add(professor);
	school_2.getProfessors().add(professor_);
	school_2.getProfessors().add(professor_1);
	school_2.getProfessors().add(professor_2);
	school_2.getProfessors().add(professor_3);
	school_2.getProfessors().add(professor_4);

	director_.setHighSchool(school);
	director_.setHighSchool(school_);
	director_.setHighSchool(school_1);
	director_.setHighSchool(school_2);
	director_.getProfessors().add(professor);
	director_.getProfessors().add(professor_);
	director_.getProfessors().add(professor_1);
	director_.getProfessors().add(professor_2);
	director_.getProfessors().add(professor_3);
	director_.getProfessors().add(professor_4);

	HighSchool school_3 = new HighSchool();
	school_3.setSchool_name("Medici Toscano");
	school_3.getStudents().add(student);
	school_3.getStudents().add(student1);
	school_3.getStudents().add(student2);
	school_3.getStudents().add(student3);
	school_3.getStudents().add(student4);
	school_3.getDirectors().add(director);
	school_3.getDirectors().add(director_);
	school_3.getProfessors().add(professor);
	school_3.getProfessors().add(professor_);
	school_3.getProfessors().add(professor_1);
	school_3.getProfessors().add(professor_2);
	school_3.getProfessors().add(professor_3);
	school_3.getProfessors().add(professor_4);

	HighSchool school_4 = new HighSchool();
	school_4.setSchool_name("Empoli Napoli");
	school_4.getStudents().add(student);
	school_4.getStudents().add(student1);
	school_4.getStudents().add(student2);
	school_4.getStudents().add(student3);
	school_4.getStudents().add(student4);
	school_4.getDirectors().add(director);
	school_4.getDirectors().add(director_);
	school_4.getProfessors().add(professor);
	school_4.getProfessors().add(professor_);
	school_4.getProfessors().add(professor_1);
	school_4.getProfessors().add(professor_2);
	school_4.getProfessors().add(professor_3);
	school_4.getProfessors().add(professor_4);

	HighSchool school_5 = new HighSchool();
	school_5.setSchool_name("Calabrea Figli");
	school_5.getStudents().add(student);
	school_5.getStudents().add(student1);
	school_5.getStudents().add(student2);
	school_5.getStudents().add(student3);
	school_5.getStudents().add(student4);
	school_5.getDirectors().add(director);
	school_5.getDirectors().add(director_);
	school_5.getProfessors().add(professor);
	school_5.getProfessors().add(professor_);
	school_5.getProfessors().add(professor_1);
	school_5.getProfessors().add(professor_2);
	school_5.getProfessors().add(professor_3);
	school_5.getProfessors().add(professor_4);

	HighSchool school_6 = new HighSchool();
	school_6.setSchool_name("Lorenzo & Da Vinci");
	school_6.getStudents().add(student);
	school_6.getStudents().add(student1);
	school_6.getStudents().add(student2);
	school_6.getStudents().add(student3);
	school_6.getStudents().add(student4);
	school_6.getDirectors().add(director);
	school_6.getDirectors().add(director_);
	school_6.getProfessors().add(professor);
	school_6.getProfessors().add(professor_);
	school_6.getProfessors().add(professor_1);
	school_6.getProfessors().add(professor_2);
	school_6.getProfessors().add(professor_3);
	school_6.getProfessors().add(professor_4);

	HighSchool school_7 = new HighSchool();
	school_7.setSchool_name("Donatelo");
	school_7.getStudents().add(student);
	school_7.getStudents().add(student1);
	school_7.getStudents().add(student2);
	school_7.getStudents().add(student3);
	school_7.getStudents().add(student4);
	school_7.getDirectors().add(director);
	school_7.getDirectors().add(director_);
	school_7.getProfessors().add(professor);
	school_7.getProfessors().add(professor_);
	school_7.getProfessors().add(professor_1);
	school_7.getProfessors().add(professor_2);
	school_7.getProfessors().add(professor_3);
	school_7.getProfessors().add(professor_4);

	Telephone tel_3 = new Telephone();
	tel_3.setArea_code(40);
	tel_3.setTelephone_number("870870182");

	Telephone tel_4 = new Telephone();
	tel_4.setArea_code(55);
	tel_4.setTelephone_number("002899889");

	director_.getPhones().add(tel_3);
	director_.getPhones().add(tel_4);
	director_.setHighSchool(school_3);
	director_.setHighSchool(school_4);
	director_.setHighSchool(school_5);
	director_.setHighSchool(school_6);
	director_.setHighSchool(school_7);
	director_.getProfessors().add(professor);
	director_.getProfessors().add(professor_);
	director_.getProfessors().add(professor_1);
	director_.getProfessors().add(professor_2);
	director_.getProfessors().add(professor_3);
	director_.getProfessors().add(professor_4);

	director_1.setHighSchool(school);
	director_1.setHighSchool(school_);
	director_1.setHighSchool(school_1);
	director_1.setHighSchool(school_2);
	director_1.setHighSchool(school_3);
	director_1.setHighSchool(school_4);
	director_1.setHighSchool(school_5);
	director_1.setHighSchool(school_6);
	director_1.setHighSchool(school_7);
	director_1.getProfessors().add(professor);
	director_1.getProfessors().add(professor_1);
	director_1.getProfessors().add(professor_2);
	director_1.getProfessors().add(professor_3);
	director_1.getProfessors().add(professor_4);

	City city = new City();
	city.setArea_code("809");
	city.setCity_name("Los Angeles");
	city.setPopulation(800000L);
	city.getHighSchools().add(school);
	city.getHighSchools().add(school_);

	City city_ = new City();
	city_.setArea_code("805");
	city_.setCity_name("San Diego");
	city_.setPopulation(999990L);
	city_.getHighSchools().add(school_1);
	city_.getHighSchools().add(school_2);

	City city_1 = new City();
	city_1.setArea_code("805");
	city_1.setCity_name("Monroe");
	city_1.setPopulation(999990L);
	city_1.getHighSchools().add(school_3);
	city_1.getHighSchools().add(school_4);

	City city_2 = new City();
	city_2.setArea_code("604");
	city_2.setCity_name("Boca Raton");
	city_2.setPopulation(805040L);
	city_2.getHighSchools().add(school_5);

	City city_3 = new City();
	city_3.setArea_code("402");
	city_3.setCity_name("Michigan");
	city_3.setPopulation(1000500L);
	city_3.getHighSchools().add(school_6);

	City city_4 = new City();
	city_4.setArea_code("402");
	city_4.setCity_name("Chicago");
	city_4.setPopulation(405000L);
	city_4.getHighSchools().add(school_7);

	State state = new State();
	state.setState_name("California");
	state.setState_acronym("CA");
	state.setState_shares("Nasdaq");
	state.getCities().add(city);
	state.getCities().add(city_);
	state.getCities().add(city_1);
	state.getCities().add(city_2);
	state.getCities().add(city_3);
	state.getCities().add(city_4);

	Street highStreet = new Street();
	highStreet.setMulti_directional(true);
	highStreet.setStreet_name("green st");
	highStreet.getDirectors().add(director);
	director.setStreet(highStreet);

	highStreet.getStudents().add(student);
	highStreet.getStudents().add(student1);
	student.setStreet(highStreet);
	student1.setStreet(highStreet);

	highStreet.getProfessors().add(professor);
	highStreet.getProfessors().add(professor_);
	highStreet.getProfessors().add(professor_1);
	highStreet.getProfessors().add(professor_2);
	professor.setStreet(highStreet);
	professor_.setStreet(highStreet);
	professor_1.setStreet(highStreet);
	professor_2.setStreet(highStreet);

	Street highStreet_ = new Street();
	highStreet_.setMulti_directional(false);
	highStreet_.setStreet_name("blue st");
	highStreet_.getDirectors().add(director_);
	director_.setStreet(highStreet_);

	highStreet_.getStudents().add(student2);
	highStreet_.getStudents().add(student3);
	highStreet_.getStudents().add(student4);
	student2.setStreet(highStreet_);
	student3.setStreet(highStreet_);
	student4.setStreet(highStreet_);

	highStreet_.getProfessors().add(professor_3);
	highStreet_.getProfessors().add(professor_4);
	highStreet_.getProfessors().add(professor_5);
	professor_3.setStreet(highStreet_);
	professor_4.setStreet(highStreet_);
	professor_5.setStreet(highStreet_);

	Street highStreet_1 = new Street();
	highStreet_1.setMulti_directional(false);
	highStreet_1.setStreet_name("yellow st");
	highStreet_1.getDirectors().add(director_1);
	director_1.setStreet(highStreet_1);

	highStreet_1.getStudents().add(student2);
	highStreet_1.getStudents().add(student3);
	highStreet_1.getStudents().add(student4);
	student2.setStreet(highStreet_1);
	student3.setStreet(highStreet_1);
	student4.setStreet(highStreet_1);

	highStreet_1.getProfessors().add(professor_3);
	highStreet_1.getProfessors().add(professor_4);
	highStreet_1.getProfessors().add(professor_5);
	professor_3.setStreet(highStreet_1);
	professor_4.setStreet(highStreet_1);
	professor_5.setStreet(highStreet_1);

	city.getStreet().add(highStreet);
	city_.getStreet().add(highStreet_);
	city_.getStreet().add(highStreet_1);

	Church church = new Church();
	church.setChurch_name("basilica john");
	church.setChurchTypes(ChuchTypes.ORTHODOX);
	church.setStreet(highStreet);

	Telephone tel_1 = new Telephone();
	tel_1.setArea_code(40);
	tel_1.setTelephone_number("800465465");

	church.getPhones().add(tel_1);

	Devout devout = new Devout();
	devout.setName("cristina princh");
	devout.setStreet(highStreet);

	Devout devout_ = new Devout();
	devout_.setName("calandra princh");
	devout_.setStreet(highStreet);

	Devout devout_1 = new Devout();
	devout_1.setName("neuer manuela");
	devout_1.setStreet(highStreet);

	Church church_ = new Church();
	church_.setChurch_name("basilica james");
	church_.setChurchTypes(ChuchTypes.ORTHODOX);
	church_.setStreet(highStreet_);

	Telephone tel_ = new Telephone();
	tel_.setArea_code(40);
	tel_.setTelephone_number("800465465");

	church_.getPhones().add(tel_);

	church.getDevouts().add(devout);
	devout.setChurch(church);

	church_.getDevouts().add(devout_);
	devout_.setChurch(church_);

	Church church_1 = new Church();
	church_1.setChurch_name("basilica luca");
	church_1.setChurchTypes(ChuchTypes.ORTHODOX);
	church_1.setStreet(highStreet_1);

	Telephone tel = new Telephone();
	tel.setArea_code(40);
	tel.setTelephone_number("800465465");

	church_1.getPhones().add(tel);
	church_1.getDevouts().add(devout_1);
	devout_1.setChurch(church_1);

	highStreet.getChurchies().add(church);
	highStreet.getDevouts().add(devout);
	highStreet.getDevouts().add(devout_);
	highStreet.getDevouts().add(devout_1);

	highStreet_.getChurchies().add(church_);

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();

	session.saveOrUpdate(state);

	Query query = session.createQuery("select new Student (student_id, student_name) from Student");
	List<Student> students = query.list();

	Criteria criteria = session.createCriteria(State.class);
	List<State> states = criteria.list();

	for (State state_ : states) {
	    System.out.println(state_.getState_name() + " : " + state_.getState_shares() + " : " + state_.getState_acronym());

	    for (City cCity : state_.getCities()) {
		System.out.println("\n");
		System.out.println(cCity.getCity_name() + " : " + cCity.getArea_code() + " : " + cCity.getPopulation());

		for (HighSchool highSchool : cCity.getHighSchools()) {
		    System.out.println("\n");
		    System.out.println(highSchool.getSchool_name());

		    for (Director direct : highSchool.getDirectors()) {
			System.out.println(direct.getName() + " : " + direct.getLevel());
		    }

		    System.out.println("\n");
		    for (Student stAux : highSchool.getStudents()) {
			System.out.println(stAux.getStudent_id() + " : " + stAux.getStudent_name() + " : " + stAux.getStudentAddress().getAddress());

			for (StudentContact contact : stAux.getStudentContact()) {
			    System.out.println(contact.getContact_type() + " : " + contact.getContact_detail());
			}
		    }
		}
	    }
	}

	session.getTransaction().commit();
	session.close();
	sessionFactory.close();
    }

}
