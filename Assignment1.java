//Mark Gillette Assignment1 IT2660
import java.util.Scanner;

class Listing {
    String name;
    int age;
  
    
    public Listing(){
        name = " ";
        age = 0;
    }
    public Listing(String userName, int userAge){
        name = userName;
        age = userAge;
    }


    public String toString(){
        return "Name: " + name + " Age: " + age;
    }
    public void input(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = myObj.nextLine();
        System.out.println("Enter age: ");
        age = myObj.nextInt();
    }
    public void setName(String userName){
        name = userName;
    }
    public void setAge(int userAge){
        age = userAge;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
  }

  //driver program to test by filling and then printing the array
  public class ListingDriver{
      public static void main(String[] args){

        Listing[] listingArray = {new Listing(), new Listing(), new Listing()};

        for (int i = 0;i < listingArray.length; i++){
            listingArray[i].input();
        }

        for (int i = 0;i < listingArray.length; i++){
            System.out.println(listingArray[i]);
        }

      }
  }