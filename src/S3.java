
public class S3 implements State{

    @Override
    public void execution(char arrayElement, Calculate calculateObject) {
        
        int element = Character.getNumericValue(arrayElement);
        
        if(element==1 || element==2 || element==3 || element==4 || element==5 || element==6 || element==7 || element==8 || element==9)
        {
            int temp;
            State S5 = new S5();
            calculateObject.updateN(element);            
            temp = calculateObject.getT();            
            calculateObject.updateT(temp);
            calculateObject.changeState(S5);
        }
        else
        {
            System.out.println("Please enter a valid Input");
        }
    }

    @Override
    public State getInstance() {
        State S3 = new S3(); 
        return S3;
    }
    
    
    
}
