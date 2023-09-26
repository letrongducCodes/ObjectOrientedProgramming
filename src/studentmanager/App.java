package studentmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                /*
                TODO

                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
                */
                StudentManager newStudent = StudentManager.getInstance();
                Student.StudentBuilder id = new Student.StudentBuilder(dataList.get(0));
                Student.StudentBuilder lastname = new Student.StudentBuilder(dataList.get(1));
                Student.StudentBuilder firstname = new Student.StudentBuilder(dataList.get(2));
                Student.StudentBuilder yearOfBirth = new Student.StudentBuilder(dataList.get(3));
                Student.StudentBuilder mathsGrade = new Student.StudentBuilder(dataList.get(4));
                Student.StudentBuilder physicsGrade = new Student.StudentBuilder(dataList.get(5));
                Student.StudentBuilder chemistryGrade = new Student.StudentBuilder(dataList.get(6));
                newStudent.append(id.build());
                newStudent.append(lastname.build());
                newStudent.append(firstname.build());
                newStudent.append(yearOfBirth.build());
                newStudent.append(mathsGrade.build());
                newStudent.append(physicsGrade.build());
                newStudent.append(chemistryGrade.build());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void main(String[] args) {
        testOriginalData();
        System.out.println();
//        testFilterStudentsHighestAverageGrade();
//        System.out.println();
//        testFilterStudentsHighestChemistryGrade();
//        System.out.println();
//        testFilterStudentsHighestMathsGrade();
//        System.out.println();
//        testFilterStudentsHighestPhysicsGrade();
//        System.out.println();
//        testSortChemistryGradeIncreasing();
//        System.out.println();
//        testSortChemistryGradeDecreasing();
//        System.out.println();
//        testSortMathsGradeIncreasing();
//        System.out.println();
//        testSortMathsGradeDecreasing();
//        System.out.println();
//        testSortPhysicsGradeIncreasing();
//        System.out.println();
//        testSortPhysicsGradeDecreasing();
//        System.out.println();
        testSortYearOfBirthIncreasing();
//        System.out.println();
//        testSortYearOfBirthDecreasing();
//        System.out.println();
//        testFilterStudentsLowestMathsGrade();
//        System.out.println();
//        testFilterStudentsLowestPhysicsGrade();
//        System.out.println();
//        testFilterStudentsLowestChemistryGrade();
//        System.out.println();
//        testFilterStudentsLowestAverageGrade();
    }

    public static void init() {
        String filePath = "D:/OOP/src/data/students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
    }

    public static void testSortYearOfBirthIncreasing() {
        String student = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().sortYearOfBirthIncreasing());
        System.out.print(student);
    }

    public static void testSortYearOfBirthDecreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortYearOfBirthDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortMathsGradeIncreasing() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortMathsGradeDecreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortPhysicsGradeIncreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortPhysicsGradeDecreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortChemistryGradeIncreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortChemistryGradeIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortChemistryGradeDecreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortChemistryGradeDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsHighestMathsGrade() {
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowestMathsGrade() {
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        List<Student> nLowestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestMathsGradeStudents.add(students.get(i));
        }

        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestMathsGradeStudents);
        System.out.print(codeString);
    }

    public static void testFilterStudentsHighestPhysicsGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeDecreasing();
        List<Student> nHighestPhysicsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestPhysicsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestPhysicsGradeStudents);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowestPhysicsGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeIncreasing();
        List<Student> nLowestPhysicsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestPhysicsGradeStudents.add(students.get(i));
        }

        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestPhysicsGradeStudents);
        System.out.print(codeString);
    }

    public static void testFilterStudentsHighestChemistryGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortChemistryGradeDecreasing();
        List<Student> nHighestChemistryGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestChemistryGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestChemistryGradeStudents);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowestChemistryGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortChemistryGradeIncreasing();
        List<Student> nLowestChemistryGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestChemistryGradeStudents.add(students.get(i));
        }

        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestChemistryGradeStudents);
        System.out.print(codeString);
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortAverageGradeDecreasing();
        List<Student> nHighestAverageGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestAverageGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestAverageGradeStudents);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortAverageGradeIncreasing();
        List<Student> nLowestAverageGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestAverageGradeStudents.add(students.get(i));
        }

        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestAverageGradeStudents);
        System.out.print(codeString);
    }
}
