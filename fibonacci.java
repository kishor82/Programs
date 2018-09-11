class fibonacci{
	public static void main(String[] args) {
		int pre=0,current=1,next;
		for (int i=0;i<10;i++){ 
			next=pre+current;
			System.out.print(next+",");
			pre=current;
			current=next;
		}
		
	}
}