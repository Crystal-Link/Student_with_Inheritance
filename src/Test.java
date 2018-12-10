import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        Student s = new Student("Brian", new int[] {90, 94, 99}, "none");
        Student u = new UnderGrad("Tim", new int[] {70, 70, 69}, "none");
        Student g = new GradStudent("Kevin", new int[] {95, 90, 90}, "none", 1234);

/*        s.computeGrade();
        u.computeGrade();
        g.computeGrade();
        System.out.println(s.getName() + ", " + s.getGrade());
        System.out.println(u.getName() + ", " + u.getGrade());
        System.out.println(g.getName() + ", " + g.getGrade());
 */

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s);
        studentList.add(u);
        studentList.add(g);

        for (Student stud : studentList)
        {
            stud.computeGrade();
            System.out.println(stud.getName() + ", " + stud.getGrade());
        }

        int gid = ((GradStudent)g).getID();
        System.out.println(g.getName() + ", " + gid);
    }
}
