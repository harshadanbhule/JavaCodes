/*4. A student has passed his 12 th standard exam he thinks he might get marks upto 85
percent. Suggest the better career field depending upon the marks assumption.(take
hardcoded values)
Input 1: percentage >85.00;
Output: Medical
Input 2: percentage <=85.00 and percentage >75.00;
Output: Engineering;
Input 1: percentage<=75.00 and percentage>=65.00;
Output: pharmacy or bachelor in science;
You have to write the code using different values of percentage.*/

class Demo{
        public static void main(String[] args){
                float num = 67.65f;

		if(num>85){
			System.out.println(" Medical ");
		}else if(num<=85 && num>75){
			System.out.println(" Engineering ");
		}else if(num <= 75 && num >=65){
			System.out.println(" pharmacy or bachelor in science ");
		}else{
			System.out.println(" Ghari bas ");
		}

        }
}
