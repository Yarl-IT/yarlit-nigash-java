class ElseIfMarks {
	public static void main(String args[]) {
		int marks=13;
		
		if ((marks>=75) && (marks<=100)) {
			System.out.println("A");
		}else if ((marks>=65) && (marks<=74)) {
			System.out.println("B");
		}else if ((marks>=55) && (marks<=64)) {
			System.out.println("C");
		}else if ((marks>=35)  && (marks<=54)){
			System.out.println("S");
		}else if ((marks>=0)  && (marks<=44)) {
			System.out.println("fail");
		}else {
			System.out.println("Invalid MARKS1! Please enter marks between 0 and 100.");
		}
	}
}