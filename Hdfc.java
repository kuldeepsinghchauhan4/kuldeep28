
public  class Hdfc implements BankInterface{
	public float rateOfInterest() {
		return 9.7f;
		
	}
	public static void main(String args[]) {
		Sbi b=new Sbi();
		Hdfc h=new Hdfc();
		Hdfc h1=h;
		Hdfc h2=h1;
		System.out.println(h2.equals(h1));
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		//System.out.println(h1.equals(h));
		/*System.out.println("rate of interst of sbi:"+b.rateOfInterest());
		System.out.println("rate of interst of sbi:"+h.rateOfInterest());*/
	}
	}

