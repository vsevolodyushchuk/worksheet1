package griffith;

//Vsevolod Yushchuk 3132335

public class Grades {
	public int gradesMax(int[] grades) {
	    if (grades.length == 0) return 0; // Edge case: empty array
	    int max = grades[0];
	    for (int grade : grades) {
	        if (grade > max) {
	            max = grade;
	        }
	    }
	    return max;
	}


	public int gradesTotal(int[] grades) {
	    int total = 0;
	    for (int grade : grades) {
	        total += grade;
	    }
	    return total;
	}


	public double gradesAverage(int[] grades) {
	    if (grades.length == 0) return 0.0; // empty array
	    return (double) gradesTotal(grades) / grades.length; // numerator to double

	}



	public int countFails(int[] grades, int minGrade) {
	    int count = 0;
	    for (int grade : grades) {
	        if (grade < minGrade) { // Count values below minGrade
	            count++;
	        }
	    }
	    return count;
	}

}

