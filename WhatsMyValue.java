public class WhatsMyValue {

 public static void main(String[] args) {
 int saturn = 100;
 int mars = 20;
 int comet = saturn / mars;
 mars = comet * 10;
 saturn = mars % 10;
 System.out.println("Saturn: " + saturn);
 System.out.println("Mars: " + mars);
 System.out.println("Comet: " + comet);
 
 
 
 boolean tomato = true;
 boolean ginger = false;
 int oregeno = 50;
 int fenugreek = 2;
 if(tomato){
 oregeno = oregeno / fenugreek;
 } else {
 oregeno = fenugreek;
 }
 if(ginger && tomato){
 oregeno = oregeno * fenugreek;
 }
 ginger = !ginger;
 System.out.println("Tomato: " + tomato);
 System.out.println("Ginger: " + ginger);
 System.out.println("Oregeno: " + oregeno);
 System.out.println("Fenugreek: " + fenugreek); 
 
 
 
 
 int turtle = 4;
 int marmot = 2;
 boolean sloth = false;
 while(marmot <= turtle){
 sloth = !sloth;
 marmot = marmot + 1;
 } // end while
 if(sloth){
 marmot = marmot * marmot;
 }
 System.out.println("Turtle: " + turtle);
 System.out.println("Marmot: " + marmot);
 System.out.println("Sloth: " + sloth);
 
 
 
 
int australia = 10;
 int chile = 5;
 boolean ecuador = false;
 chile = australia + chile;
 System.out.println("Australia before call: " + australia);
 System.out.println("Ecuador before if: " + ecuador);
 if(!ecuador){
 doSimpleMath(australia);
 } // close if
 System.out.println("Chile: " + chile);
 System.out.println("Ecuador after if: " + ecuador);
 } // close main

 public static void doSimpleMath(int numToFlip){
 int result = (numToFlip * -1) + 15;
 System.out.println("Result: " + result);

 } // close main
} // close class