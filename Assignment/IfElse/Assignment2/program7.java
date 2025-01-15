/*Calculate the profit or loss.
Write a program that takes cost price and selling price(take it hardcoded) and calculates its
profit or loss.
Input 1:
sellingPrice: 1200
costPrice: 1000
Output: Profit of 200
Input 2:
sellingPrice: 300
costPrice: 500
Output: loss of 200
Input 3:
sellingPrice: 900
costPrice: 900
Output: No profit no loss*/

class Demo{
        public static void main(String[] args){
                int sell = 100;
		int cost = 1000;
		int prof = sell-cost;
		int loss = cost-sell;

                if(sell>cost){
                        System.out.println("Profit of "+prof);
                }else if(sell<cost){
			System.out.println("Loss of "+loss);
		}else{
                        System.out.println(" No profit no loss");
                }

        }
}
