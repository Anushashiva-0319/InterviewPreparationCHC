
public class Grades {

	
	
	
	
	    public static void main(String args[])
	    {
	 
	   
	        int marks[] = { 25, 65, 46, 98, 78, 65 };
	 
	        
	        int max_marks = marks.length * 100;
	 
	       
	        int total = 0;
	 
	        
	        char grade = 'F';
	 
	       
	        for (int i = 0; i < marks.length; i++) {
	            total += marks[i];
	        }
	 
	       
	        double percentage
	            = ((double)(total) / max_marks) * 100;
	 
	     
	        if (percentage >= 90) {
	            grade = 'A';
	        }
	        else {
	            if (percentage >= 80 && percentage <= 89) {
	                grade = 'B';
	            }
	            else {
	                if (percentage >= 60 && percentage <= 79) {
	                    grade = 'C';
	                }
	                else {
	                    if (percentage >= 33 && percentage <= 59) {
	                        grade = 'D';
	                    }
	                    else {
	                        grade = 'F';
	                    }
	                }
	            }
	        }
	 
	        System.out.println(grade);
	    }
	}

	
	/*
	 * public static String[] caluGrade(double[] array) {
	 * 
	 * 
	 * String[] grades = new String[array.length]; for (int i = 0; i < array.length;
	 * i++){ if (array[i] >= 80 && array[i] <= 100) grades[i] = "A"; else if
	 * (array[i] >= 65 && array[i] < 80) grades[i] = "B"; else if (array[i] >= 50 &&
	 * array[i] < 65) grades[i] = "C"; else if (array[i] >= 0 && array[i] < 50)
	 * grades[i] = "D"; else grades[i] = "Invalid"; } return grades; }
	 */
	
