package griffith;
//Vsevolod Yushchuk 3132335

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GradesTest {

    @Test
    public void testGradesMax() {
        Grades grades = new Grades();
        assertEquals(100, grades.gradesMax(new int[]{100, 90, 80}));
        assertEquals(-5, grades.gradesMax(new int[]{-10, -5, -20}));
        assertEquals(0, grades.gradesMax(new int[]{})); 
    }

    @Test
    public void testGradesTotal() {
        Grades grades = new Grades();
        assertEquals(270, grades.gradesTotal(new int[]{100, 90, 80}));
        assertEquals(-35, grades.gradesTotal(new int[]{-10, -5, -20}));
        assertEquals(0, grades.gradesTotal(new int[]{})); 
    }

    @Test
    public void testGradesAverage() {
        Grades grades = new Grades();
        assertEquals(90.0, grades.gradesAverage(new int[]{100, 90, 80}), 0.001);
        assertEquals(-11.67, grades.gradesAverage(new int[]{-10, -5, -20}), 0.001);
        assertEquals(0.0, grades.gradesAverage(new int[]{})); 
    }

    @Test
    public void testCountFails() {
        Grades grades = new Grades();
        assertEquals(2, grades.countFails(new int[]{50, 40, 60}, 50)); 
        assertEquals(3, grades.countFails(new int[]{-10, -5, -20}, 0));
        assertEquals(0, grades.countFails(new int[]{90, 80, 70}, 50)); 
    }
}
