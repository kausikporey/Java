class Finally{
	public static void main(String []args) {
		int i=0;
		String mystring[]= {"Hello","Java","Welcome"};
		while(i<4) {
			try {
				System.out.println(mystring[i]);
			    i++;
			    }
			catch(Exception e) {
				System.out.println(e.toString());
			                   }
			finally {
				if(i<3)
				System.out.println("Hi");
				else 
					System.out.println("You should quit and reset index value");
				break;
			        }
		}
	}
}