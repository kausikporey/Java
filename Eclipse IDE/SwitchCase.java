class SwitchCase{
	public static void main(String args[])throws java.io.IOException {
	char choice;
	do {
	System.out.println("Your Birth Date");
	System.out.println("Your Name");
	System.out.println("Your Father Name");
	System.out.println("Your Place of Birth");
	System.out.println("Choose Your Option : ");
	choice=(char)System.in.read();
	}while(choice<'1'||choice>'5');
	switch(choice) {
	case '1':
		System.out.println("21 october 1998");
		break;
	case '2':
		System.out.println("Kausik Porey");
		break;
	case '3':
		System.out.println("Joydev Porey");
		break;
	case '4':
		System.out.println("KAMARDANGA");
		break;
	
                   }
                                                                   }
	            }