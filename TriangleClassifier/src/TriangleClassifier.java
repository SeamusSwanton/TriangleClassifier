
public class TriangleClassifier {
	

public static String message1 = "";
public static String message2 = "";


	public static boolean isValidTriangle(int i, int j, int k) {
		if( (i + j + k != 180) || (i<1) || (j<1) || (k<1)) {
			return false;
		}
		else{
			return true;
		}
			
		
	}

	public static String classifyByAngle(int i, int j, int k) {
	    if (i < 90 && j < 90 && k < 90) {
	    	return "acute";
	    }
	    else if (i == 90 || j == 90 || k == 90) {
	    	return "right";
	    }
	    else {
	    	return "obtuse";
	    }
	}

	public static String classifyBySide(int i, int j, int k) {
		if ((i == j) && (i == k) && (j == k)) {
			return "equilateral";
		}    
	    
		else if ((i == j) || (i == k) || (j == k)){
			return "isosceles";
	    }   		
	    else {
	    	return "scalene";
	    }
		
	        		
	}
	
	public static String getClassification(int i, int j, int k) {
		if (isValidTriangle(i, j, k) == false){
	        return "INVALID";
		}
		else if(classifyBySide(i, j, k) == "equilateral"){
			return "equilateral";
		}
	    else {
	        return (classifyByAngle(i, j, k)) + ' ' + (classifyBySide(i, j, k));
	    }
	}

}
