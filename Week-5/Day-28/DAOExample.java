class StudentDAO {

    public void saveStudent(String name) {
        System.out.println("Student " + name + " saved to database");
    }
}

public class DAOExample {
    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();
        dao.saveStudent("Sangmesh");
    }
}