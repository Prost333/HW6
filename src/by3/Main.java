package by3;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = inizialaiz();
        med [] bolnoi = inizialaiz1();
//        1.a
//        getstudentbyfaculty(students, "istfac");
//        1.b
//        getcursandfacultet(students, "fiz", 3);
//        1.c
//        ageofconsent(students, 1998);
//        1.d
//        getStudenandGruppa(students, "fp3");
//        1.e
//        changefacultet();
//        2.a
//        getbolnoidiagnoz(bolnoi,"гепатит");


//Task1


    }

    static Student[] inizialaiz() {
        Student[] students = new Student[6];
        Student students1 = new Student(123, "Bobovich", "Boba", 1998, "istfac", 2, "fp2");
        Student students2 = new Student(321, "Rend", "Aen", 1934, " filfac", 3, "Ka3");
        Student students3 = new Student(356, "Schiller", "Fridrich", 1999, " filfac", 2, "ka2");
        Student students4 = new Student(183, "Erofeev", "Venia", 2000, "fiz", 3, "fp3");
        Student students5 = new Student(197, "Gumilev", "Lev", 1999, " filfac", 2, "ka2");
        Student students6 = new Student(653, "Fycks", "Eduard", 1999, "fiz", 3, "fp3");
        students[0] = students1;
        students[1] = students2;
        students[2] = students3;
        students[3] = students4;
        students[4] = students5;
        students[5] = students6;
        return students;
    }
    //        1.a
    public static Student[] getstudentbyfaculty(Student[] students, String facultet) {
        Student[] newstudents = new Student[students.length];
        int j = 0;
        for (Student student : students) {
            if (student.getFacultet().equals(facultet)) {
                newstudents[j] = student;
                System.out.println(student.information());
                j++;
            }

        }
        return newstudents;
    }
    //        1.b
    public static Student[] getcursandfacultet(Student[] students, String facultet, int curs) {
        Student[] studentsfac = new Student[students.length];
        int i = 0;
        for (Student student : students) {
            if (student.getFacultet().equals(facultet) && (student.getCurs() == curs)) {
                studentsfac[i] = student;
                System.out.println(student.information());
                i++;
            }

        }
        return studentsfac;
    }
    //        1.c
    public static Student[] ageofconsent(Student[] students, int data) {
        Student[] studentsage = new Student[students.length];
        int i = 0;
        for (Student student : students) {
            if (student.getdata() > data) {
                studentsage[i] = student;
                System.out.println(student.information());
                i++;
            }
        }
        return studentsage;
    }
//1.d
    public static Student[] getStudenandGruppa(Student[] students, String gruppa) {
        Student[] studgruppa = new Student[students.length];
        int i = 0;
        for (Student student : students) {
            if (student.getGruppa().equals(gruppa)) {
                studgruppa[i] = student;
                System.out.println(student.information());
            }
        }
        return studgruppa;
    }

    static void changefacultet() {
        Student[] students = inizialaiz();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFacultet().equals("fiz")) {
                students[i].setFacultet("filfac");
            }
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].information());
        }
    }

//    Task2


    static med[] inizialaiz1() {
        med[] bolnoi = new med[6];
        med bolnoi1 = new med(111, "Жопин", "Жопа", "Жопович",
                "Ул. Прямой кишки 12", "1111111", 1, "порванная жопа");
        med bolnoi2 = new med(112, "Хрухин", "Хряк", "Xрякович",
                "ул.Сеновальная", "121212", 2, "опьянения");
        med bolnoi3 = new med(113, "Йен", "Кертис", " ",
                "Манчестер", "323232", 3, "грустит");
        med bolnoi4 = new med(114, "Горшок", "Михаил", "Юрьевич",
                "ул.елимясомужики", "4343434", 4, "наркоман");
        med bolnoi5 = new med(115, "Хой", "Юрий", "Николаевич",
                "ул.Воронеж", "545454", 5, "гепатит");
        med bolnoi6 = new med(116, "Летов", "Егор", "Федорович",
                "ул.моейобороны", "65656", 6, "алкаш");
        bolnoi[0] = bolnoi1;
        bolnoi[1] = bolnoi2;
        bolnoi[2] = bolnoi3;
        bolnoi[3] = bolnoi4;
        bolnoi[4] = bolnoi5;
        bolnoi[5] = bolnoi6;
        return bolnoi;
    }

    public  static med[] getbolnoidiagnoz (med[] bolnoi,String diagnoz){
        med [] pation = new med[bolnoi.length];
        int i=0;
        for (med bolnoi1 :bolnoi) {
            if (bolnoi1.getDiagnoz().equals(diagnoz)){
               pation[i]=bolnoi1;
                System.out.println(bolnoi1.inf());
            }
            i++;
        }
        return pation;
    }



}
