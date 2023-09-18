package taskTwo;

import taskTwo.CollegeStudent;
import taskTwo.Conference;

public class ConferenceDemo {
    public static void main(String[] args) {
        Conference conference = new Conference();

        SchoolStudent schoolStudent1 = new SchoolStudent("Alice");
        SchoolStudent schoolStudent2 = new SchoolStudent("Bob");
        CollegeStudent collegeStudent1 = new CollegeStudent("Charlie");
        CollegeStudent collegeStudent2 = new CollegeStudent("David");

        conference.addParticipant(schoolStudent1);
        conference.addParticipant(schoolStudent2);
        conference.addParticipant(collegeStudent1);
        conference.addParticipant(collegeStudent2);

        System.out.println("Количество школьников на конференции: " + conference.countSchoolStudents());
        System.out.println("Количество студентов на конференции: " + conference.countCollegeStudents());
    }
}
