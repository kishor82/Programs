class JavaExample{
	public static void main(String[] args) {
	int sum=0,i,num;
	// Program to find armstrong
	for(int j=99;j<=999;j++){
		num=j;
		while(num!=0){
		i=num% 10;	
		sum+=i*i*i;
		num=num/10;	
		}
		if(j==sum)
			System.out.println("Number "+j+" is Armstrong Number");
		sum=0;
		}
	}
	
}