package Programming_Test_Vaeso;
import java.util.Scanner;
public class Goodies 
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("List of Goodies");
        System.out.println("________________________________\r\n"
                + "|Goodies           |Prices     |\r\n"
                + "|------------------|-----------|\r\n"
                + "|1.Fitbit Plus     |7980       | \r\n"
                + "|2.IPods           |22349      | \r\n"
                + "|3.MI Band         |999        |\r\n"
                + "|4.Cult Pass       |2799       |\r\n"
                + "|5.Macbook Pro     |229900     |\r\n"
                + "|6.Digital Camera  |11101      | \r\n"
                + "|7.Alexa           |9999       | \r\n"
                + "|8.Sandwich Toaster|2195       | \r\n"
                + "|9.Microwave Oven  |9800       |\r\n"
                + "|10.Scale          |4999       |\r\n"
                + "|__________________|___________|");
       System.out.print("Number of the employees:");
        int n=scan.nextInt();
        int arr1[]=new int[n];
        String arr2[]=new String[n];
        System.out.println("Please select Goodies");
        for(int i=0;i<n;i++)
        {
        	int itemSelection = scan.nextInt();

        	switch (itemSelection) 
        	{
            	case 1:
            		System.out.println("Fitbit Plus: 7980");
            		arr1[i]=7980;
            		arr2[i]="Fitbit Plus: 7980";
            		break;
            	case 2:
            		System.out.println("IPods: 22349");
            		arr1[i]=22349;
            		arr2[i]="IPods: 22349";
            		break;
            	case 3:
            		System.out.println("MI Band: 999");
            		arr1[i]=999;
            		arr2[i]="MI Band: 999";
            		break;
            	case 4:
            		System.out.println("Cult Pass: 2799");
            		arr1[i]=2799;
            		arr2[i]="Cult Pass: 2799";
            		break;
            	case 5:
            		System.out.println("Macbook Pro: 229900");
            		arr1[i]=229900;
            		arr2[i]="Macbook Pro: 229900";
            		break;
            	case 6:
            		System.out.println("Digital Camera: 11101");
            		arr1[i]=11101;
            		arr2[i]="Digital Camera: 11101";
            		break;
            	case 7:
            		System.out.println("Alexa: 9999");
            		arr1[i]=9999;
            		arr2[i]="Alexa: 9999";
            		break;
            	case 8:
            		System.out.println("Sandwich Toaster: 2195");
            		arr1[i]=2195;
            		arr2[i]="Sandwich Toaster: 2195";
            		break;
            	case 9:
            		System.out.println("Microwave Oven: 9800");
            		arr1[i]=9800;
            		arr2[i]="Microwave Oven: 9800";
            		break;
            	case 10:
            		System.out.println("Scale: 4999");
            		arr1[i]=4999;
            		arr2[i]="Scale: 4999";
            		break;
        	}
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Here the goodies that are selected for distribution are: ");
        for (int j = 0; j <n; j++) 
        {
            System.out.print(arr2[j] + "\n");
        }
        int max_val = arr1[0];
    	int min = arr1[0];
    	for(int i = 1; i < arr1.length; i++)
    	{
    		if(arr1[i] > max_val)
    			max_val = arr1[i];
    		else if(arr1[i] < min)
    			min = arr1[i];
    	}
    	System.out.println("The difference between the chosen goodie with highest price and the lowest price is "+(max_val-min));	
	}
	
	
}
