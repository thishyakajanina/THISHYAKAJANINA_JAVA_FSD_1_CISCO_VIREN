package cisco.java.program.assignment;

 class Student {
	String name;
	char section;
	char gender ;
	int age;
	int subject1,subject2,subject3,total;
	
	void total(){
		total =subject1+subject2+subject3;
		System.out.println("name :"+ name +" Gender :" +gender+ " Age :"+age+" Section : "+section+" total is :"+total);
	}
}
	class Student1 extends Student{
		public Student1(String n,char g,int a,char s,int i, int j, int k) {
			name =n;
			gender =g;
			age=a;
			section=s;
			subject1=i;
			subject2=j;
			subject3=k;
		}

		void total(){
			total =subject1+subject2+subject3;
			System.out.println("name :"+ name +" Gender :" +gender+ " Age :"+age+" Section : "+section+" total is :"+total);
		}
	}
	class Student2 extends Student{
		public Student2(String n,char g,int a,char s,int i, int j) {
			name =n;
			gender =g;
			age=a;
			section=s;
			subject2=i;
			subject3=j;
		}

		void total(){
			total =subject1+subject2+subject3;
			System.out.println("name :"+ name +" Gender :" +gender+ " Age :"+age+" Section : "+section+" total is :"+total);
		}
	}
	class Student3 extends Student{
		public Student3(String n,char g,int a,char s,int i, int j) {
			name =n;
			gender =g;
			age=a;
			section=s;
			subject2=i;
			subject3=j;
		}

		void total(){
			total =subject1+subject2+subject3;
			System.out.println("name :"+ name +" Gender :" +gender+ " Age :"+age+" Section : "+section+" total is :"+total);
		}
	}
	class Student4 extends Student{
		public Student4(String n,char g,int a,char s,int i, int j, int k) {
			name =n;
			gender =g;
			age=a;
			section=s;
			subject1=i;
			subject2=j;
			subject3=k;
		}

		void total(){
			total =subject1+subject2+subject3;
			System.out.println("name :"+ name +" Gender :" +gender+ " Age :"+age+" Section : "+section+" total is :"+total);
		}
	}
class StudentP{
	public static void main(String[] args) {
		Student s;
		s = new Student1("S1",'f',15,'A',57,57,89);
		s.total();
		s = new Student2("S2",'m',15,'A',56,78);
		s.total();
		s = new Student3("S3",'f',15,'A',56,89);
		s.total();
		s = new Student4("S4",'m',15,'A',78,89,56);
		s.total();

	}
	}
	


