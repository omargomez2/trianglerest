package net.osgg.trianglerest;

public class TriangleUtils {
	
    private boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        return true;
    }
    
    private int getPerimeter(String a, String b, String c) {
    	return Integer.valueOf(a) + Integer.valueOf(b) + Integer.valueOf(c);
    }
     
    public Mensaje getTriangleType(String a, String b, String c) {
    	if ( !isInteger(a) || !isInteger(b) || !isInteger(c) )
    	   return new Mensaje("los tres valores a ingresar deben ser números enteros", "");
    	else if ( (Integer.valueOf(a) + Integer.valueOf(b)) <= Integer.valueOf(c) || 
    			  (Integer.valueOf(a) + Integer.valueOf(c)) <= Integer.valueOf(b) || 
    			  (Integer.valueOf(b) + Integer.valueOf(c)) <= Integer.valueOf(a) ) 
    		return new Mensaje("los valores ingresados no corresponden con los de un triángulo", ""); 
    	else if(Integer.valueOf(a)==Integer.valueOf(b) && Integer.valueOf(b)==Integer.valueOf(c))
    		return new Mensaje("Equilatero", String.valueOf(getPerimeter(a,b,c)));
    	else if (Integer.valueOf(a)==Integer.valueOf(b)  || Integer.valueOf(a)==Integer.valueOf(c) || 
    			 Integer.valueOf(c)==Integer.valueOf(b) )
    		return new Mensaje("Isósceles", String.valueOf(getPerimeter(a,b,c)));
    	else
    		return new Mensaje("Escaleno", String.valueOf(getPerimeter(a,b,c)));
    }

}