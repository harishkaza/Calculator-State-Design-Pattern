
public class S1 implements State{

    @Override
    public void execution(char arrayElement, Calculate calculateObject) {
        
        int element = Character.getNumericValue(arrayElement);
        
        if(element==0 || element==1 || element==2 || element==3 || element==4 || element==5 || element==6 || element==7 || element==8 || element==9)
        {
            State S2 = new S2();
            int b;
            b =  (calculateObject.getN()*10) + element;
            calculateObject.updateN(b);
            calculateObject.changeState(S2);
        }
        else if(arrayElement == '+')
        {
            State S4 = new S4();
            calculateObject.updateT(calculateObject.getN());
            calculateObject.changeState(S4);
        }
        else if(arrayElement == '-')
        {
            State S3 = new S3();
            calculateObject.updateT(calculateObject.getN());
            calculateObject.changeState(S3);
        }
        else 
        {
            System.out.println("Please enter a valid Input");
        }
    }

    @Override
    public State getInstance() {
        State S1 = new S1(); 
        return S1;
    }
}
