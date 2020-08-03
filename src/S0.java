
public class S0 implements State {
        
    @Override
    public void execution(char arrayElement, Calculate calculateObject) {
        
        int element = Character.getNumericValue(arrayElement);
        
        if(element==1 || element==2 || element==3 || element==4 || element==5 || element==6 || element==7 || element==8 || element==9)
        {
        	calculateObject.updateN(element);
            State S1 = new S1();
            calculateObject.changeState(S1);
        }
        else
        {
            System.out.println("Please enter a valid Input");
        }
    }

    @Override
    public State getInstance() {
        State S0 = new S0(); 
        return S0;
        }
    
}
