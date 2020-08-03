
public class S5 implements State{

    @Override
    public void execution(char arrayElement, Calculate calculateObject) {
        
    	int element = Character.getNumericValue(arrayElement);
        
    	if(element==0 || element==1 || element==2 || element==3 || element==4 || element==5 || element==6 || element==7 || element==8 || element==9)
        {        	
            int b,temp;
            State S5 = new S5();
            b =  (calculateObject.getN()*10) + element;
            calculateObject.updateN(b);            
        	temp = calculateObject.getT() - calculateObject.getN();	                        
        	calculateObject.updateT(temp);
        	calculateObject.changeState(S5);
        	calculateObject.updateN(0);
        }
        else if(arrayElement == '+')
        {
            State S4 = new S4();
            int b;
            b = calculateObject.getT() - calculateObject.getN(); 
            calculateObject.updateT(b);
            calculateObject.changeState(S4);
        }
        else if(arrayElement == '-')
        {
            State S3 = new S3();
            int b;
            b = calculateObject.getT() - calculateObject.getN(); 
            System.out.println("am in s5 -");
            calculateObject.updateT(b);
            calculateObject.changeState(S3);            
        }
        else 
        {
            System.out.println("Please enter a valid Input");
        }
    }

    @Override
    public State getInstance() {
        State S5 = new S5(); 
        return S5;
    }
    
    
}
