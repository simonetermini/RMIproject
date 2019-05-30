import java.rmi.Remote; //tag Interface

public interface ServerInterface extends Remote {

    public double getSum(double a, double b);


}
