
public class NumberOfCoins {
	
	public int count;
	
	public NumberOfCoins(){
		count = 0;
	}
	
	private enum Coins{
		QUARTERS(25), DIMES(10), NICKLES(5), PENNIES(1);
		
		private int value;
		
		Coins(int v){
			value = v;
		}
		
		public Coins nextLargest(Coins coin){
			if(coin == QUARTERS) return DIMES;
			if(coin == DIMES) return NICKLES;
			else return null;
		}
	}
	
	public int countNumbers(int n){
		countNumbersHelper(n, Coins.QUARTERS);
		return count;
	}

	private void countNumbersHelper(int n, Coins coin) {
		if(coin == Coins.NICKLES) count += n / Coins.NICKLES.value + 1;
		else{
			for(int i = 0; i <= n / coin.value; i++){
				countNumbersHelper(n - i * coin.value, coin.nextLargest(coin));
			}
		}
	}
}
