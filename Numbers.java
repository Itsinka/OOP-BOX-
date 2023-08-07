import java.util.ArrayList;
import java.util.List;
public class Numbers<T extends Comparable<T>>{
    private List<T> numlist= new ArrayList<>();
    public void addNumber(T number){
        numlist.add(number);
    }
    public void sortNumbers(){
        for(int i=0;i<numlist.size()-1;i++)
        {
            for(int j=0;j<numlist.size()-i-1;j++)
            {
                if(numlist.get(j).compareTo(numlist.get(j+1))>0){
                    T temp=numlist.get(j);
                    numlist.set(j,numlist.get(j+1));
                    numlist.set(j+1,temp);
                }
            }
        }
    }
    public void printNumbers(){
        for(T number:numlist){
            System.out.println(number);
        }
    }
    public<T,V> void printTwoParameters(T param1,V param2){
        System.out.println(param1 + "and" + param2);
    }
}
