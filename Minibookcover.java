public class Minibookcover
{
    public static void main (String[] args)
    {
        String[] categories={"Friction","Nepali"};
        String[][] titles=new String[2][1];
        double[][] prices=new double[2][1];
        titles[0][0]="King of Pride";
        prices[0][0]=400;
        
        titles[1][0]="Asahamati-5";
        prices[1][0]=750;
        
        System.out.println("----Mini Book Cover Inventory----");
        for(int i=0; i<categories.length; i++)
        {
            System.out.println("Category: "+categories[i]);
            for(int j=0; j<titles[i].length; j++)
            {
                if(titles[i][j]!=null)
                {
                    System.out.printf("Titles :%s",titles[i][j]);
                    System.out.printf("\nPrice: %.2f%n",prices[i][j]);
                }
            }
        }
    }
}