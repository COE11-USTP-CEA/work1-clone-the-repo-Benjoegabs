import java.util.List;

class student_gpa{
	public static void main(String[] args){
		/*
		student gaburno = new student();
		gaburno.setName("Benjoe Gaburno");
		gaburno.setDept("CEA");

		subject oop_class = new subject();
		oop_class.setSubjectName("Object Oriented Programming");
		oop_class.setGrade(75.00f);
		gaburno.addSubject(oop_class);

		subject envi_class = new subject();
		envi_class.setSubjectName("Environmental Engineering");
		envi_class.setGrade(61.17f);
		gaburno.addSubject(gaburno_class);

		System.out.println("Student is " + gaburno.getName());
		System.out.println("Dept: " + gaburno.getDept());
		
		System.out.println("Subjects of Student");
		System.out.println("-------------------");
		List<subject> subjects_ni_abs = gaburno.getSubjects();
		
		for(subject s : subjects_ni_abs){
			System.out.println(" -- Subject: " + s.getSubjectName());
			System.out.println("    Grade is " + s.getGrade());
		}
		*/
		EngSubject coe11 = new EngSubject();
		coe11.setSubjectName("OOP Subject");
		coe11.setGrade(70.11f);

		coe11.setUnits(2,2);

		boolean needsPRC = coe11.getHasPRC();

		System.out.println("Coe11 name is " + coe11.getSubjectName());
		System.out.println("Coe11 lec units are " + coe11.getLecUnits());
		System.out.println("Coe11 lab units are " + coe11.getLabUnits());
	}
}
