public class Tech{
 public static void main(String[] args){
     System.out.println("hi");
     int ver = 5;
     int GBAvailable = 10;
     int ProgramsOnDrive = GBAvailable % ver;
     String OS = "MS-DOS Version ";
     System.out.print(OS);
     System.out.println(ver);
     System.out.print("There Are ");
     System.out.println(ProgramsOnDrive);
     System.out.println(" Programs On The Drive.");
     boolean test = ProgramsOnDrive == ver;
     System.out.print("Are there any bad blocks on the drive? ");
     System.out.println(test);
     String memeCreator = "MemeCreator v1.4";
     System.out.println(memeCreator);
     System.out.println("No Graphics Card Detected. Program Halted.");
     System.out.println("Returning To Command Line...");
 }  
}