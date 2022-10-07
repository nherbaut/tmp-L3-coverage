package fr.pantheonsorbonne;

public class IntegerSumComputer {

    private IntegerSumComputer(){}

    public static int getSumOfInteger(int begining, int end){
        int result=0;
        if(begining<0 || begining>end){
            throw new IllegalArgumentException("begining should be >0");
        }
        for(int i=begining; i<=end;i++){
            result+=i;
        }
        return result;
    }
    
}
