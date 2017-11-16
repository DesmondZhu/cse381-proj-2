
public class Summation implements Runnable{
	
private int upper;
private Sum sumValue;
private int power;
public Summation(int upper, Sum sumValue, int power){
	this.upper = upper;
	this.sumValue = sumValue;
	this.power = power;
}
public void run() {
	int sum = 0;
	for(int i=0; i<= upper; i++)
		sum += Math.pow(i, power);
	sumValue.setSum(sum);
}
}
