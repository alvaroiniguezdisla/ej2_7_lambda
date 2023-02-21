package dominio;
import java.util.stream.Stream;
public class ej2_7_lambda {
    public static int sumapares(int n){
        return Stream.iterate(0,i->i+1).limit(n+1).filter(i->i%2==0).reduce(0,(a,b)->a+b);
    }
}


