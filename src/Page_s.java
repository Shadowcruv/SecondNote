import java.util.*;

public class Page_s {

        Scanner scanner = new Scanner(System.in);

        private String FirstNote ;  private int reply1,delete1,f=0;
        private String SecondNote;  private int reply2,delete2,s=0;
        private String ThirdNote;   private int reply3, delete3,t=0;
        private String FourthNote;  private int reply4, delete4,fo=0;
        private String FifthNote;   private int reply5, delete5,fif=0;


        public Page_s(){
         FirstNote = "no note here yet";
         SecondNote = "no note here yet";
         ThirdNote = "no note here yet";
         FourthNote = "no note here yet";
         FifthNote = "no note here yet";

        }
        public void setFirstNote(String here){
            scanner.useDelimiter("\n");
            f = 1;
            FirstNote = here;
            System.out.println("Do u wish to save this Firstnote?" + "\n" + "1. Yes or 2. No (please reply either 1 or 2)");
            reply1 = scanner.nextInt();
            if (reply1 == 1){System.out.println("Saving..." );try {Thread.sleep(1500);} catch(Exception e) { }
            System.out.println("Please wait.");try {Thread.sleep(1500);} catch(Exception e) { }
            System.out.print("."); try {Thread.sleep(1500);} catch(Exception e) { } System.out.print(".");try {Thread.sleep(1500);} catch(Exception e) { }
            System.out.print("."); try {Thread.sleep(1500);} catch(Exception e) { } System.out.println(".");}
            if (reply1 == 2){System.out.println("Note Deleted and Discarded");FirstNote = "Nope note";}
            if (reply1 >2) {
                System.out.println(" Invalid input, Please Igor have sense and select either 1 or 2 next time");
            }
        }

        public String getFirstNote(){
               if(Tdelete1stNote()){
                 FirstNote = "FirstNote already Deleted";
                 return FirstNote;}
            if (reply1 >= 2){ return "missing note";}
            else return FirstNote;
            //return reply;
        }
        public void setSecondNote(String here){
            scanner.useDelimiter("\n");
            s = 1;
            SecondNote = here;
            System.out.println("Do u wish to save this Secondnote?" + "\n" + "1. Yes or 2. No (please reply either 1 or 2)");
            reply2 = scanner.nextInt();
            if (reply2 == 1){System.out.println("Saving...");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.println("Please wait.");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.print("."); try {Thread.sleep(1500);} catch(Exception e) { } System.out.print(".");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.print("."); try {Thread.sleep(1500);} catch(Exception e) { } System.out.println(".");}
            if (reply2 == 2){System.out.println("Note Deleted and Discarded");
                SecondNote = "No note";}
            if (reply2 >2) {
                System.out.println(" Invalid input, Please Igor have sense and select either 1 or 2 next time");
            }
        }

        public String getSecondNote(){
            if(Tdelete2ndNote()){
                SecondNote = "SecondNote already Deleted";
                return SecondNote;}
            if (reply2 >= 2){return "no note";}
            else return SecondNote;
            //return reply;
        }
        public void setThirdNote(String here){
            scanner.useDelimiter("\n");
            t = 1;
            ThirdNote = here;
            System.out.println("Do u wish to save this Thirdnote?" + "\n" + "1. Yes or 2. No (please reply either 1 or 2)");
            reply3 = scanner.nextInt();
            if (reply3 == 1){System.out.println("Saving...");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.println("Please wait.");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.print("."); try {Thread.sleep(1500);} catch(Exception e) { } System.out.print(".");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.print("."); try {Thread.sleep(1500);} catch(Exception e) { } System.out.println(".");}
            if (reply3 == 2){System.out.println("Note Deleted and Discarded");ThirdNote = "No note";}
            if (reply3 >2) {
                System.out.println(" Invalid input, Please Igor have sense and select either 1 or 2 next time");
            }
        }

        public String getThirdNote(){
            if(Tdelete3rdNote()){
                ThirdNote = "ThirdNote already Deleted";
                return ThirdNote;}
            if (reply3 >= 2){return "no note";}
            else return ThirdNote;
            //return reply;
        }
        public void setFourthNote(String here){
            scanner.useDelimiter("\n");
            fo =1;
            FourthNote = here;
            System.out.println("Do u wish to save this Fourthnote?" + "\n" + "1. Yes or 2. No (please reply either 1 or 2)");
            reply4 = scanner.nextInt();
            if (reply4 == 1){System.out.println("Saving...");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.println("Please wait.");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.print("."); try {Thread.sleep(1500);} catch(Exception e) { } System.out.print(".");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.print("."); try {Thread.sleep(1500);} catch(Exception e) { } System.out.println(".");}
            if (reply4 == 2){System.out.println("Note Deleted and Discarded");FourthNote = "No note";}
            if (reply4 >2) {
                System.out.println(" Invalid input, Please Igor have sense and select either 1 or 2 next time");
            }
        }

        public String getFourthNote(){
            if(Tdelete4thNote()){
                FourthNote = "FourthNote already Deleted";
                return FourthNote;}
            if (reply4 >= 2){return "no note";}
            else return FourthNote;
            //return reply;
        }
        public void setFifthNote(String here){
            scanner.useDelimiter("\n");
            fif = 1;
            FifthNote = here;
            System.out.println("Do u wish to save this Fifthnote?" + "\n" + "1. Yes or 2. No (please reply either 1 or 2)");
            reply5 = scanner.nextInt();
            if (reply5 == 1){System.out.println("Saving...");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.println("Please wait.");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.print("."); try {Thread.sleep(1500);} catch(Exception e) { } System.out.print(".");try {Thread.sleep(1500);} catch(Exception e) { }
                System.out.print("."); try {Thread.sleep(1500);} catch(Exception e) { } System.out.println(".");}
            if (reply5 == 2){System.out.println("Note Deleted and Discarded");FifthNote = "No note";}
            if (reply5 >2) {
                System.out.println(" Invalid input, Please Igor have sense and select either 1 or 2 next time");
            }
        }

        public String getFifthNote(){
            if(Tdelete5thNote()){
                FifthNote = "FifthNote already Deleted";
                return FifthNote;}
            if (reply5 >= 2){return "no note";}
            else return FifthNote;
            //return reply;
        }

        public int getTotalNotesvisited(){
        int total = f+s+t+fo+fif;
            return total;
        }

    public Boolean Tdelete2ndNote(){
        return delete2 ==1;
    }
    public String DeleteSecondNote(){
        delete2 =1;
        return "";
    }
    public Boolean Tdelete3rdNote(){
        return delete3 ==1;
    }
    public String DeleteThirdNote(){
        delete3 =1;
        return "";
    }
    public Boolean Tdelete4thNote(){
        return delete4 ==1;
    }
    public String DeleteFourthNote(){
        delete4 =1;
        return "";
    }
    public Boolean Tdelete5thNote(){
        return delete5 ==1;
    }
    public String DeleteFifthNote(){
        delete5 =1;
        return "";
    }
    public Boolean Tdelete1stNote(){
        return delete1 ==1;
    }
    public String DeleteFirstNote(){
        delete1 =1;
        return "";
    }
    }




