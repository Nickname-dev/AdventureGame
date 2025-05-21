import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.util.ArrayList;




public class Main {
   private static String name;
   private static boolean isConfused;
   //if the user is confused about the option menu, the user can make this true and the options will be printed along with the numbers through array traversal





   public Main(String name, boolean isConfused){
  this.name = name;
   this.isConfused = isConfused;   
}
   
   public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

      Scanner scanner = new Scanner(System.in);
      System.out.println("What is your name?");
       name = scanner.nextLine();

      System.out.println();
      System.out.println("Do you know the rules of the game?(yes/no)");
      String answer = scanner.nextLine();
      if(answer.equals("no")){
         isConfused = true;
      }else{
         isConfused = false;
      }
      

      //key variables
      String[][] choices = {{"1","2","3","4","5", "6", "7", "8", "9", "10"},
   {"Go to school", "Brush your teeth", "Go to the arcade", "Go to the pool", "Go to the movies","pharmacy", "movies", "gym","pool", "library"}};
     
      
      
      //image for gui
         ImageIcon image = new ImageIcon("questionMark.png");
        //label for gui
         JLabel label = new JLabel();

         //traits of gui label
         label.setForeground(Color.white);
         label.setBackground(Color.black);
         label.setOpaque(true);
         label.setText("Click on the number to opt for the choice--Type in stop to stop the game--Type in help for help menu");
      label.setHorizontalTextPosition(JLabel.CENTER);
      label.setVerticalTextPosition(JLabel.TOP);
      label.setIcon(image);
        
         //gui frame
         JFrame jframe = new JFrame();
            jframe.setTitle("help menu");
            jframe.setSize(950,500);
          jframe.add(label);
            jframe.setVisible(true);

      

            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         
//starting of code
      
     
//object is instantiated
         Main main = new Main(name, isConfused);
         
      //traversing ArrayList to print stats of character
      
     System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("-----------------");
      //ArrayList traversal with friends
     
     
        System.out.println();
         System.out.println();
         System.out.println();
         System.out.println("-----------------");
     
      
      //traversing the 2d array for the options
      if(main.isConfused == true){
           System.out.println("If you are confused, these are the options with number order corresponding to the options' order:");
           for(int i = 0; i < choices.length; i++){
              for(int j = 0; j < choices[i].length; j++){
                  System.out.println(choices[i][j]);
                 System.out.println();
              }
           }
        }

      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("-----------------");

      System.out.println("Welcome to a game of Life...");
      
      
      main.delayTime(2);
      System.out.println("Here...everything is your choice and up to you...");
      main.delayTime(2);
      System.out.println("Click on the number to opt for the choice corresponded to that number...");
      main.delayTime(2);
      System.out.println("Type in stop to stop the game");
      main.delayTime(2);
      System.out.println("Type in help to get the help menu");
      main.delayTime(2);
      System.out.println("Let's begin with the story");
      
      //first for loop used
      for(int i = 0; i < 3; i ++){
         main.delayTime(1);
         System.out.println(": ");
      }
         
      
      
      main.delayTime(2);
      System.out.println("You have woken up from bed one Saturday morning, what would you like to do?");


      //Scanner variables
      
      Scanner scan = new Scanner(System.in);
      Scanner scan1 = new Scanner(System.in);
      Scanner scan2 = new Scanner(System.in);
      Scanner scan3 = new Scanner(System.in);
      Scanner scan4 = new Scanner(System.in);
      Scanner scan5 = new Scanner(System.in);
      Scanner scan8 = new Scanner(System.in);
      Scanner scan9 = new Scanner(System.in);
      Scanner scan10 = new Scanner(System.in);
      Scanner scan11 = new Scanner(System.in); 
      Scanner scan12 = new Scanner(System.in);
      Scanner scan13 = new Scanner(System.in);


      //array stores the scanner variables for access
ArrayList<Scanner> array = new ArrayList<Scanner>();
      array.add(scan);
      array.add(scan1);
      array.add(scan2);
      array.add(scan3);
      array.add(scan4);
      array.add(scan5);
      array.add(scan8);
      array.add(scan9);
      array.add(scan10);
      array.add(scan11);
      array.add(scan12);
      array.add(scan13);
      
      


      //first while loop used
      while(true){
        
         //Choices for whole code
         main.delayTime(1);
         System.out.println();
         System.out.println();
         System.out.println("1. Go to school");
         main.delayTime(1);
         System.out.println("2. Brush your teeth");
         main.delayTime(1);
         System.out.println("3. Go to the arcade");
         main.delayTime(1);
         System.out.println("4. Go to your favorite restaurant");
         main.delayTime(1);
         System.out.println("5. Hide in the basement");
         main.delayTime(1);
         System.out.println("6. Go to your job at the pharmacy");
         main.delayTime(1);
         System.out.println("7. Go to the movies");
         main.delayTime(1);
         System.out.println("8. Go to the gym");
         main.delayTime(1);
         System.out.println("9. Go to the pool");
         main.delayTime(1);
         System.out.println("10. Go to the library");
         main.delayTime(1);
         System.out.println("help   - for help menu or use the output");
         System.out.println();
         System.out.println();

      String a = scan.nextLine();
     // scan.nextLine();
        //choice 1
         if(a.equals("1")){
            //image for choice 1
            File file = new File("school.txt");
            Scanner reader2 = null;
            try{
             reader2 = new Scanner(file);
               while(reader2.hasNextLine()){
                  main.delayTime(1);
                  System.out.println(reader2.nextLine());
               }
            }catch(FileNotFoundException e){
               e.printStackTrace();
            }
            System.out.println("You are walking to school and you see your least favorite bully, what do you want to do?");
            //random choice 1
            int z = main.Random(1,2);
            if(z==1){
             
            main.delayTime(4); 
           //options for random chocie 1
               System.out.println("1. hide in the local dumpster");
            main.delayTime(2);
            System.out.println("2.confront the bully");
            
            int b = scan1.nextInt();
            scan1.nextLine();
            if(b == 1){
               main.delayTime(1);
               System.out.println("You hide in the local dumpster and the bully doesn't find you...What do you want to do now?");
            }else if(b == 2){
               main.delayTime(2);
               System.out.println("You confront the bully...");
               main.delayTime(2);
               System.out.println("The bully tries to punch you, but you dodge their hand.");
               main.delayTime(2);
               System.out.println("The bully falls over.");
            }
            //random choice 2
            }else if(z == 2){
               main.delayTime(2);
               //options for random choice 2
               System.out.println("1. run to school");
               main.delayTime(2);
               System.out.println("2. become friends with the bully");
               main.delayTime(2);
               int answer8 = scan8.nextInt();

               if(answer8 == 1){
                  System.out.println("You begin to run to school...");
                  main.delayTime(1);
                  System.out.println("The bully begins to follow you down the sidewalk...");
                  main.delayTime(1);
               System.out.println("You make it to school on time, and run into you furst class safely.");
                  main.delayTime(2);
                  System.out.println("...");
                  System.out.println("School has finished, what do you want to do now?");
               }else{
                  System.out.println("You talk to the bully...it takes a few minutes");
                  main.delayTime(1);
                  System.out.println("You both sort out eachother's conflicts, understanding eachother's problems..");
                  main.delayTime(1);
                  System.out.println("You both become friends and you both go to school together.");
                  main.delayTime(2);
                  System.out.println("now what do you want to do?");
               }

                  }

            //choice 2
         }else if(a.equals("2")){
            main.delayTime(2);
            //scenarion for choice 2
            System.out.println("You walk to the nearest restroom.");
            main.delayTime(2);
            System.out.println("You brush your teeth with mint flavored tooth paste");
            main.delayTime(2);
            System.out.println("Now that your teeth is clean, and you feel fresh, you can start your day!");
            
            //choice 3
         }else if(a.equals("3")){
            main.delayTime(2);
            System.out.println("You enter the arcade, what game do you want to play?");
      //picture for choice 3
            File file = new File("videoGame.txt");
            Scanner reader3 = null;
            try{
               reader3 = new Scanner(file);
               while(reader3.hasNextLine()){
                  main.delayTime(1);
                  System.out.println(reader3.nextLine());
               }
            }
               catch(FileNotFoundException e){
               e.printStackTrace();
               }
            
            //options for choice 3
            System.out.println();
            main.delayTime(2);
            System.out.println("1. Pac-Man");
            main.delayTime(2);
            System.out.println("2. Space Invaders");
            main.delayTime(2);
            System.out.println("3. Sonic");
         int c = scan2.nextInt();
            //1 condition
            if(c == 1){
               //image for choice 3.1
               File file2 = new File("pac_man.txt");
               Scanner scan6 = null;
               try{
                  scan6 = new Scanner(file2);
                  while(scan6.hasNextLine()){
                     
                   
                     System.out.println(scan6.nextLine());
                  }
                  
               }catch(FileNotFoundException e){
                  e.printStackTrace();
               }
               System.out.println();
               main.delayTime(2);
               System.out.println("You're Pac-Man...you eat a berry");
               main.delayTime(2);
               System.out.println("You're able to eat 4/5 ghosts...");
               main.delayTime(2);
               System.out.println("But the last one gets you");
               main.delayTime(2);
               System.out.println("You lost :(");
               main.delayTime(2);
               System.out.println("What do you want to do now?");
               System.out.println();
            }else if(c == 2){
              
               
               //second condition
               System.out.println();
               main.delayTime(2);
               System.out.println("You're in Space Invaders...");
               main.delayTime(2);
               System.out.println("You shoot all of the aliens...");
               main.delayTime(2);
               System.out.println("You win!!!");
               main.delayTime(2);
               System.out.println("What do you want to do now?");
               System.out.println();
            }else if(c == 3){
               
               //3 condition
               File file3 = new File("sonic.txt");
                  Scanner scan7 = null;
               try{
                  scan7 = new Scanner(file3);
                  while(scan7.hasNextLine()){
                  System.out.println(scan7.nextLine());
                  }
               }catch(FileNotFoundException e){
                  e.printStackTrace();
               }
              
               System.out.println();
               main.delayTime(2);
               System.out.println("You're Sonic...");
               main.delayTime(2);
               System.out.println("You're speeding around tunnels and you visit eggman...");
               main.delayTime(2);
               System.out.println("You one-punch him, and you win!!");
               main.delayTime(2);
               System.out.println("What do you want to do now?");
               System.out.println();
            }else{
               System.out.println("That is not an option");
            }
         }
         else if(a.equals("4")){
            //option 4
            main.delayTime(2);
            System.out.println("what is your favorite resturant?");
           String d = scan3.nextLine();
            System.out.println();
//image for option 4
            File file = new File("food.txt");
            Scanner reader1 = null;
            
            
            try{
     reader1 = new Scanner(file);
               while(reader1.hasNextLine()){
                  main.delayTime(1);
                  System.out.println(reader1.nextLine());
               }
               
            }catch(FileNotFoundException e){
               e.printStackTrace();
            }
            
            main.delayTime(1);
            //the restaurant
            System.out.println("You go to " + d);
            System.out.println();
            main.delayTime(2);
            System.out.println("What do you want to eat?");
            String e = scan4.nextLine();
             System.out.println();
            main.delayTime(2);
            //the food
            System.out.println("You eat " + e + " and it is so tasty...");
            main.delayTime(2);
            System.out.println("You pay the waiter and leave");
            
         }else if(a.equals("5")){

           //option 5 
            main.delayTime(2);
            //option 5 events
            System.out.println("You hide in the basement...");
            main.delayTime(2);
            System.out.println("You hear a noise coming from the attic...");
            main.delayTime(2);
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println();
            System.out.println();
            main.delayTime(2);
            System.out.println("1. Go to the attic");
            System.out.println("2. Stay in the basement");
            int f = scan4.nextInt();
            if(f == 1){
              
              //choice 1 
               File file = new File("skele.txt");
               Scanner reader = null;
              //image for choice 1
               try{
                  reader = new Scanner(file);
                     while(reader.hasNextLine()){
                        //main.delayTime(1);
                        System.out.println(reader.nextLine());
                  }   
              
               }catch(FileNotFoundException e){
               e.printStackTrace();
               
               
                   }   
               System.out.println();
               System.out.println();
               System.out.println();
               main.delayTime(2);
               System.out.println("You go to the attic...");
               main.delayTime(2);
               System.out.println("You see a monster...");
               main.delayTime(2);
               System.out.println("You try to run away...");
               main.delayTime(2);
               System.out.println("You trip and fall...");
               main.delayTime(1);
               System.out.println(":");
               main.delayTime(1);
               System.out.println(":");
               main.delayTime(1);
               System.out.println(":");
               System.out.println("You wake up from a bad dream :)");
            }else if(f == 2){
               //option 2 for 5
               
               main.delayTime(2);
               System.out.println("You stay in the basement...");
               main.delayTime(2);
               System.out.println("You hear a thump descending the basement stairs...");
               main.delayTime(2);
               System.out.println("What do you want to do?");
               System.out.println();
               main.delayTime(2);
               System.out.println("1. confront the noise");
               main.delayTime(2);
               System.out.println("2. Stay in the basement");
                System.out.println();
               int g = scan5.nextInt();
               if(g == 1){
                  //option 1 for option 2 of #5
                  System.out.println();
                  main.delayTime(2);
                  System.out.println("You confront the noise...");
                  main.delayTime(2);
                  System.out.println("You see a monster...");
                  main.delayTime(2);
                  System.out.println("You try to run away...");
                  main.delayTime(2);
                  System.out.println("You trip and fall...");
                  main.delayTime(2);
                  System.out.println("The monster was your little sister");
                  System.out.println();
               }else if(g == 2){
                  //option 2 for option 2 of #5
                  System.out.println();
                  main.delayTime(2);
                  System.out.println("You hide behind the couch..");
                  main.delayTime(2);
                  System.out.println("You take a sneak peak..");
                  main.delayTime(2);
                  System.out.println("You see a monster...it jumps on you");
                  main.delayTime(2);
                  System.out.println("The monster was your little sister");
                  System.out.println();
                     }else{
                  System.out.println("That is not an option");
               }
            }else{
               System.out.println("That is not an option");
            }
         }else if(a.equals("stop") || a.equals("Stop") || a.equals("STOP") ){
            System.out.println("The game has ended");
            break;
         }else if(a.equals("6")){
          System.out.println("You decide to go to your job at the pharmacy.");
          
           
            int z2 = main.Random(1,2);
           //random choice for option 6
            
            //image for choice 6
            File file = new File("pharmacy.txt");
            Scanner read = null;
            try{
               read = new Scanner(file);
            while(read.hasNextLine()){
              
               System.out.println(read.nextLine());
            main.delayTime(1);
            }
            }catch(FileNotFoundException e){
               e.printStackTrace();
            }
            if(z2 == 1){
           //random 1 for choice 6
               System.out.println("At the pharmacy, you see a coughing customer.");
               main.delayTime(1);               
             System.out.println("1. Give them a cough drop.");
               main.delayTime(1);
               System.out.println("2.Send them away.");
               int answer9 = scan9.nextInt();
               if(answer9 == 1){
                 //choice 1 for option 6 random 1
                  System.out.println("You give them a cough drop...");
                  main.delayTime(1);
                  System.out.println("They stop coughing for a min..");
                  main.delayTime(1);
                  System.out.println("They feel better!");
               
                     }else if(answer9 == 2){
                  //choice 2 for option 6 random 1
                  System.out.println("You send them away...");
                  main.delayTime(1);
                  System.out.println("Other customers notice");
                  main.delayTime(1);
                  System.out.println("They leave as well!");
                     }
            
            
            }else if(z2 == 2){
               //random 2 for choice 6
               System.out.println("At the pharmacy, you see a patient requests for a fever medicine.");
               main.delayTime(1);
                 
            System.out.println("you give them the medicine...");
               main.delayTime(1);
               System.out.println("THey feel better!");
            }
         }else if(a.equals("7")){
        //option 7
            System.out.println("You decide to go to the movies with a few friends.");
            //image for option  7
            File file = new File("movie.txt");
            Scanner read1 = null;
            try{
               read1 = new Scanner(file);
            while(read1.hasNextLine()){
               main.delayTime(1);
               System.out.println(read1.nextLine());
            }
            }catch(FileNotFoundException e){
               e.printStackTrace();
            }
            
           
            System.out.println("1.watch a horror movie");
               main.delayTime(1);
               System.out.println("2.watch an adventure movie");
         
            int answer10 = scan.nextInt();
              if(answer10 == 1){
                 //choice 1 for option 7
                 System.out.println("You watch a horror movie...");
                 main.delayTime(1);
                 System.out.println("The movie ends up being goosebumps");
                 main.delayTime(1);
                 System.out.println("The movie was not scary at all :(");
                 main.delayTime(1);
              }   if(answer10 == 2){
                //choice 2 for option 7
                 System.out.println("You watch an adventure movie...");
                 main.delayTime(1);
                 System.out.println("The movie was so good that you end up watching it again!");
              }




            
            
         }else if(a.equals("8")){
          //option 8
            System.out.println("You decide to go to the gym.");
            
            //image for option 8
            File file = new File("cartoonGym.txt");
            Scanner read2 = null;
            try{
               read2 = new Scanner(file);
               while(read2.hasNextLine()){
                  main.delayTime(1);
                  System.out.println(read2.nextLine());
               }
            }catch(FileNotFoundException e){
               e.printStackTrace();   
               
            }
            main.delayTime(1);
            int z3 = main.Random(0,1);
            //random for option 8
            if(z3 == 0){
            //random 1 for option 8
               System.out.println("You see your friends playing basketball");
        main.delayTime(1);
               System.out.println("You see another kid playing soccer by herself");
               main.delayTime(1);
               System.out.println("1.Join your friends");
               main.delayTime(1);
               System.out.println("2.Join the kid");
            int answer11 = scan11.nextInt();
               if(answer11 == 1){
                  //choice 1 for option 8 random 1
                  System.out.println("You begin playing basketball with your friends...");
                  main.delayTime(1);
                  System.out.println("The teams are split 2 v 2");
                  main.delayTime(1);
                  System.out.println("You score a 3 pointer!");
                  
               }else if(answer11 == 2){
//choice 2 for option 8 random 1
                  System.out.println("You begin playing soccer with the kid...");
                  main.delayTime(1);
                  System.out.println("The kid scores a goal!");
                  main.delayTime(1);
                  System.out.println("You score a goal as well!");

                  
               }
            }else if(z3 == 1){
               //random choice 2 for option 8
               System.out.println("You see your friends playing football");
               main.delayTime(1);
               System.out.println("You see another kid playing volleyball by herself");
               main.delayTime(1);
                  System.out.println("1.Join your friends");
                  main.delayTime(1);
                  System.out.println("2.Join the kid");
               int answer11 = scan11.nextInt();
               if(answer11 == 1){
                  //choice 1 for option 8 random 2
                  System.out.println("You begin playing football with your friends...");
                  main.delayTime(1);
                  System.out.println("The teams are split 3 v 3");
                  main.delayTime(1);
                  System.out.println("You score a touchdown!");
               }else if(answer11 == 2){
                  //choice 2 for option 8 random 2
                  System.out.println("You begin playing volleyball with the kid...");
                  main.delayTime(1);
                  System.out.println("The kids touches and passes the ball over you!");
               }



               
            }
         }else if(a.equals("9")){
        //option 9
            System.out.println("You decide to go the pool");
            main.delayTime(1);
          System.out.println("You notice that the pool has a diving board and a lazy pool");
           //image for option 9
            File file = new File("pool.txt");
            Scanner read4 = null;
            try{
               read4 = new Scanner(file);
               while(read4.hasNextLine()){
                 
                  System.out.println(read4.nextLine());
               
               }
            }catch(FileNotFoundException e){
               e.printStackTrace();
            }
           main.delayTime(1);
            System.out.println("1.Jump on the diving board");
            main.delayTime(1);
            System.out.println("2.Play in the lazy pool");
            int answer12 = scan12.nextInt();
//choice 1 for option 9
            if(answer12 == 1){
               System.out.println("You jump on the diving board...");
               main.delayTime(1);
               System.out.println("You fall for 5 seconds");
               main.delayTime(1);
               System.out.println("You land perfectly head first!");
            }else if(answer12 == 2){
               //choice 2 for option 9
               System.out.println("You enter the lazy pool");
               main.delayTime(1);
               System.out.println("You float around for 10 minnutes");
               main.delayTime(1);
               System.out.println("You get bored and leave");
            }
            
            
         }else if(a.equals("10")){
            //option 10
            System.out.println("You decide to go to the library");
            main.delayTime(1);
            System.out.println("The librarian requests for you to shelve books as a form of volunteering, or to help with checking out books.");
            
            //image for option 10
            File file = new File("book.txt");
            Scanner read5 = null;

            try{
               read5 = new Scanner(file);
               while(read5.hasNextLine()){
                  main.delayTime(1);
                  System.out.println(read5.nextLine());
               }
            }catch(FileNotFoundException e){
               e.printStackTrace();
               }
            
            
            main.delayTime(1);
            System.out.println("1.Volunteer");
            main.delayTime(1);
            System.out.println("2.Help check out books");
            main.delayTime(1);
            int answer13 = scan12.nextInt();
             int z5 = main.Random(0,1);
            if(answer13 == 1){
               //choice 1 for option 10
               if(z5 == 0){
                  //random 1 for choice 1
                  System.out.println("You begin shelving books..mystery, adventure, and fiction");
                  main.delayTime(1);
                  System.out.println("You complete shelving a whole row");
                  main.delayTime(1);
                  System.out.println("You earn and hour of volunteer hours!");
               }else if(z5 == 1){
                 //random 2 for choice 1 option 10
                  System.out.println("You begin shelving books...non-fiction, history, and science");
                  main.delayTime(2);
                  System.out.println("You shelve books for 2 hours straight");
                  main.delayTime(2);
                  System.out.println("You are rewarded with a chocolate cake!");
               }
            }else if(answer13 == 2){
               //option 2 for choice 10
               if(z5 == 0){
              //random 1 for choice 2
                  System.out.println("You help check out books");
               main.delayTime(1);
               System.out.println("You notice that one student forgets to take their book");
                  main.delayTime(1);
                  System.out.println("You return it to them before they leave!");
               }else if(z5 == 1){
                  //random 2 for choice 2 option 10
                  System.out.println("You help check out books");
                  main.delayTime(1);
                  System.out.println("A second student helps you!");
                  main.delayTime(1);
                  System.out.println("You finish within one hour!");
               }
            }
            
         }
         //help option
         else if(a.equals("help") || a.equals("Help") || a.equals("HELP")){
            
          
            
            
            
            System.out.println("Click on the number to opt for the choice given");
            main.delayTime(2);
            System.out.println("Type in stop to stop the game");
            main.delayTime(2);
            System.out.println("Type in help to get the help menu");
         }
         
         else{
            System.out.println("That is not an option");
         }
        
         
         
      }
  //delay time method
   }public void delayTime(int seconds){
System.out.println();
      try{
         Thread.sleep(1000 * seconds);
        }catch(InterruptedException e){
        Thread.currentThread().interrupt();
        }
   }
   
   
   //tried to use a music player method but it didnt work
   public void playMusic(String location){
try{
File file1 = new File(location);
   if(file1.exists())
   {
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file1);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
   }else{
      System.out.println("File does not exist");
   } 
}catch(Exception e){
   System.out.println("Error playing music");
}  
   }

   public String getName(){
return name;
      
   }
   public boolean isConfused(){


      return isConfused;
   }
   //random method
   public int Random(int min, int max){
      //Random rand = new Random();
      int random = min + (int)(Math.random() * ((max-min) + 1));
      return random;
   }
}




