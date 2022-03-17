
public class TriangleClassifier {
	

private static boolean isValidTriangle = true;
private static boolean isEquilateral = false;
public static String message1 = "";
public static String message2 = "";


	public static boolean isValidTriangle(int i, int j, int k) {
		if( (i + j + k != 180) && (i<1) && (j<1) && (k<1)) {
			isValidTriangle = false;
		}
		return isValidTriangle;
			
		
	}

	public static String classifyByAngle(int i, int j, int k) {
	    if (i < 90 && j < 90 && k < 90) {
	    	message1 = "acute";
	    }
	    else if (i == 90 || j == 90 || k == 90) {
	    	message1 = "right";
	    }
	    else {
	    	message1 = "obtuse";
	    }
	    return message1;
	}

	public static String classifyBySide(int i, int j, int k) {
		if ((i == j) && (i == k) && (j == k)) {
			message2 = "equilateral";
		}    
	    
		else if ((i == j) || (i == k) || (j == k)){
			message2 = "isosceles";
	    }   		
	    else {
	    	message2 = "scalene";
	    }
		
		return message2;
	        		
	}
	
	public static String getClassification(int i, int j, int k) {
		if (isValidTriangle == false) {
	        return "INVALID";
		}
	    else {    
	        return (message1) + ' ' + (message2);
	    }
	}

}
