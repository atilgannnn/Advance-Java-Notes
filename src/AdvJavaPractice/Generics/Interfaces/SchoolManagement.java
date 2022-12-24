package AdvJavaPractice.Generics.Interfaces;

        /*

        Task: Okul yönetimi için öğrenci ve öğretmen kayıtlarını
        -oluşturan
        -görüntüleyen
        -güncelleyen
        -silen
        bir program yazınız.

        Her iki sınıf için aynı methodlara ihtiyacımız var(add,delete...)
        Implement edip bu methodları oluşturabilmek ve her iki classın nesnelerini
        parametre olarak alabilmek için generic tipte interface tanımladık.

        */

public class SchoolManagement {

    public static void main(String[] args) {

        Student student = new Student("Tolstoy");
        StudentRepo studentRepo = new StudentRepo();
        Teacher teacher = new Teacher("Dostoyevski");
        TeacherRepo teacherRepo = new TeacherRepo();
        //List<Teacher> teacherList = new ArrayList<>(); Listler ve Mapler de generic type oldugu için bu dataları alabilirler.(Örnek olarak yazdı hoca)

        studentRepo.add(student);
        studentRepo.update(student);
        studentRepo.get(student);
        studentRepo.delete(student);

        teacherRepo.add(teacher);
        teacherRepo.update(teacher);
        teacherRepo.get(teacher);
        teacherRepo.delete(teacher);


    }

}
