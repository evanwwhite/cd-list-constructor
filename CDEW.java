//Evan White
    import java.util.Scanner;
	import java.io.*;
	import java.util.ArrayList;
	
  public class CDEW {
	
	private String title;
	private String artist;
	private double price;
	private int numTracks;
	
		//=========================================================

				CDEW()			            // Constructor (default)
				{
					title = "";
					artist = "";
					price = 0.0;
					numTracks = 0;
				}
				
				
				CDEW(String Tit, String Art, double Pri, int Num)
				{
					title = Tit;
					artist = Art;
					price = Pri;
					numTracks = Num;
				}
				
				
				public String getTitle()    // accessor "getter" methods
				{
					return title;
				}

				public String getArtist()
				{
					return artist;
				}

				public double getPrice()
				{
					return price;
				}

				public int getNumTracks()
				{
					return numTracks;
				}
				//=======================================================
				public void setTitle(String n)                // mutator "setter" methods
				{
					title = n;
				}
				public void setLastName(String n)
				{
					artist = n;
				}
				public void setPrice(double s)
				{
					price = s;
				}
				public void setNumTracks(int a)
				{
					numTracks = a;
				}
				
				public String toString()
				{
					return String.format("%-15s %-20s %8.2f %3d", getTitle(), 
							getArtist(), getPrice(), getNumTracks());
				}
	        

     public static void bubbleSort(ArrayList <CDEW> list)
  {
     Scanner input = new Scanner(System.in);
     
   
     
     System.out.print("Sort by 1) artist, 2) title, or 3) price: ");
     
     int choice = input.nextInt();
     int size = list.size();
     
      CDEW temp = new CDEW();
      
      for(int p = 1; p<size; p++)
   {
       for(int q = 0; q < size-p; q++)
    {
       if(choice == 1)
     {
       if(list.get(q).getArtist().compareTo(list.get(q+1).getArtist()) > 0)
      {
      temp = list.get(q+1);
      list.set(q+1,list.get(q));
      list.set(q,temp);
      }
    }
    if(choice == 2)
   {
       if(list.get(q).getTitle().compareTo(list.get(q+1).getTitle()) > 0)
    {
       temp = list.get(q+1);
       list.set(q+1,list.get(q));
       list.set(q,temp);
     }
   }
    if(choice == 3)
  {
    if(list.get(q).getPrice() > list.get(q+1).getPrice())
  {
    temp = list.get(q+1);
    list.set(q+1,list.get(q));
    list.set(q,temp);
          }
         }
        }
       }
      }
     }
