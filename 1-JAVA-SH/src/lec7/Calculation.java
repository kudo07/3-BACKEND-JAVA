package lec7;

public class Calculation {
public int sum(int val1, int val2){
    int total=val1+val2;
    //doing some logger stuff
    System.out.println("addition"+total);
    return total;
}
public int getPriceOfPen(){
    int capPrice=2;
    int penBodyPrice=5;
    int totalPenPrice=sum(capPrice,penBodyPrice);
    return totalPenPrice;
}


}
