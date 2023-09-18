package taskTwo;

import taskTwo.CollegeStudent;

import java.util.ArrayList;

class Conference {
    private ArrayList<Student> participants;

    public Conference() {
        participants = new ArrayList<>();
    }

    public void addParticipant(Student student) {
        participants.add(student);
    }

    public int countSchoolStudents() {
        int count = 0;
        for (Student student : participants) {
            if (student instanceof SchoolStudent) {
                count++;
            }
        }
        return count;
    }

    public int countCollegeStudents() {
        int count = 0;
        for (Student student : participants) {
            if (student instanceof CollegeStudent) {
                count++;
            }
        }
        return count;
    }
}