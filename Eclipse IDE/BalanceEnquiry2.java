 class BalanceEnquiry2{
	public static void main(String args[]) {
		Balance h[]=new Balance[3];
		h[0]=new Balance("Kausik",160);
		h[1]=new Balance("Pradip",340);
		h[2]=new Balance("Sayan",560);
	    for (int i=0;i<3;i++) 
		     h[i].show();
	}
}
