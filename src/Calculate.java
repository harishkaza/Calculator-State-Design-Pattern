import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {
    
    State state;
    State S0= new S0();
    State S1= new S1();
    State S2= new S2();
    State S5= new S5();
    State S6= new S6();
    int c,t,n;
    
    Scanner scannerObject= new Scanner(System.in);
    
    public static void main(String args[])
    {          
    	try {
    		Calculate calculateObject = new Calculate();
    	       String input = calculateObject.getinput(); 
    	       int len = input.length();       
    	       char arr[] = new char[len];
    	       arr = input.toCharArray();
    	       if(input.indexOf(".")>-1 || input.indexOf("*")>-1) {
    	    	   throw new java.util.InputMismatchException();
    	       }             
    	       calculateObject.assignState();    	       
    	       for(int i=0;i<input.length();i++)
    	       {
    	           try{
    	        	   calculateObject.state.getInstance().execution(arr[i],calculateObject);
    	           }
    	           catch(Exception e){
    	                System.out.println("Error");
    	            }
    	       }
    	       int b = calculateObject.check(calculateObject);
    	       if(b==1)
    	       {    	
    	        System.out.println(calculateObject.getN());
    	       }
    	       else if(b==2)
    	       {    	   
    	           System.out.println(calculateObject.getT() - calculateObject.getN());
    	       }
    	       else if(b==3)
    	       {    	   
    	           System.out.println(calculateObject.getT() + calculateObject.getN());
    	       }	
    	}
    	catch(InputMismatchException exception) {
    		System.out.println("Please check the input");
    	}
    	catch(Exception e) {
    		System.out.println("Error");
    	}
       
    }
    
    public int check(Calculate calculateObject)
    {
        State check = state.getInstance();
        int b=0;        
        if(check.getInstance().toString().substring(0,2).equals("S1") || check.getInstance().toString().substring(0,2).equals("S2"))      
        {
           b=1;
        }
        else if(check.getInstance().toString().substring(0,2).equals("S5")) 
        {            
            b=2;
        }
        else if(check.getInstance().toString().substring(0,2).equals("S6")) 
        {           
            b=3;
        }
        return b;
    }
    
    
    public String getinput()
    {  
       String in;
       System.out.println("Enter your string:  ");
       in = scannerObject.nextLine();
       return in;
    }
    
    public void assignState()
    {
        this.state = S0;
    }
    
    public void updateN(int x)
    {
        n = x;
    }
    
    public void updateT(int y)
    {
        t = y;
    }
    
    public int getN()
    {
        return n;
    }
    
    public int getT()
    {
        return t;
    }
    
    public void changeState(State z)
    {
        state = z;
    }
    
    public State getState()
    {
        return state;
    }
    
}
