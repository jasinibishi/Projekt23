class ArimetickaSredina{
	int a;
	int b;
	int c;
	
	 ArimetickaSredina (int a, int b, int c){
		 this.a = a;
		 this.b = b;
		 this.c = c;
	 }
	 void calculateAS() {
		 System.out.println((a+b+c) / 3);
	 }
	 public static void main(String[]args){
		 ArimetickaSredina firstN = new ArimetickaSredina (3,5,7);
		 ArimetickaSredina secondN = new ArimetickaSredina(13,25,29);
		 
		 firstN.calculateAS();
		 secondN.calculateAS();
	 }
}