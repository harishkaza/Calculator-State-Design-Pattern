
public class S4 implements State{

    @Override
    public void execution(char arrayElement, Calculate calculateObject) {
        
    	int element = Character.getNumericValue(arrayElement);
        
    	if(element==1 || element==2 || element==3 || element==4 || element==5 || element==6 || element==7 || element==8 || element==9)
        {            
            State S6 = new S6();
            calculateObject.updateN(element);            
            calculateObject.changeState(S6);
        }
        else
        {
            System.out.println("Please enter a valid Input");
        }
    }

    @Override
    public State getInstance() {
        State S4 = new S4(); 
        return S4;    
    }
    
}
