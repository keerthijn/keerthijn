import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] Group_Country=new String[]{"India","Bangladesh","England","New Zealand",
				"Russia","USA","South Korea","Sri Lanka"};
		String[] Group_Animal=new String[]{"Gorilla","Lion","Chimpanzee","Hippo",
				"Monkey","DinoSaur","Porcupine","Mole"};
		int[] Group_Pincode=new int[]{560029,560068,560034,560017,561212,560019,517152,517345};
		char[] Group_Gender=new char[] {'M','M','F','T','F','T','F','M'};
		String[] Group_month=new String[] {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		System.out.println("-------------------------------Countries-------------------------------");
		for (int i = 0; i < Group_Country.length; i++) 
			System.out.print(Group_Country[i]+" |  ");
		System.out.println();System.out.println();
		System.out.println("-------------------------------Animal-------------------------------");
		for (int i = 0; i < Group_Animal.length; i++) 
			System.out.print(Group_Animal[i]+"  |  ");
		System.out.println();System.out.println();
		System.out.println("-------------------------------Pincode-------------------------------");
		for (int i = 0; i < Group_Pincode.length; i++) 
			System.out.print(Group_Pincode[i]+"  |  ");
		System.out.println();System.out.println();
		System.out.println("-------------------------------Gender-------------------------------");
		for (int i = 0; i < Group_Gender.length; i++) 
			System.out.print(Group_Gender[i]+"  |  ");
		System.out.println();System.out.println();
		System.out.println("-------------------------------Months of Year-------------------------------");
		for (int i = 0; i < Group_month.length; i++) 
			System.out.print(Group_month[i]+"  |  ");
		
	}

}
