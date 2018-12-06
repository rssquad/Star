 class Alpha {
 
 static String s = " ";
 
 public Alpha()
 { s += "alpha "; }
 
 }
 class SubAlpha extends Alpha 
 {
 public SubAlpha() { s += "sub "; }
 }
 public class SubSubAlpha extends Alpha {
 
 public SubSubAlpha() { s += "subsub "; }
 
 public static void main(String[] args) {
 
 new SubAlpha();
 
 System.out.println(s);
 }
 }