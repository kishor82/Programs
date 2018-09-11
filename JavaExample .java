class JavaExample{
	public static void main(String[] args) {
	int sum=0,i,num;

	for(int j=0;j<=9999;j++){
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