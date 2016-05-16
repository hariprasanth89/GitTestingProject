
class super_class{
	
	int b;
	 super_class(int b) {
		 this.b=(b+10);
	}
	 public void display() {
		System.out.println(" Values of B:"+ b);
	
	}
} 
	 class sub_class extends super_class
	 {
		 int a;
		 sub_class(int a, int b)
		 {
			 super(b);
			 this.a=a;
			 for (int i = 5; i < a; i++) {
				a=i;
			}
		}
		 public void display() {
		
			 System.out.println(" Values of : dinote sub class");
			 System.out.println(" Values of A:"+ a);
			 System.out.println(" Values of B:"+ b);
		}
	 }



 class MethodOverRiding 
{
	public static void main(String[] args) 
	{
		sub_class hari = new sub_class(10, 20);
		hari.display();
	}

}
