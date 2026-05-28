/* static block in java 
Ans -> Static block is such kind 
of block in java which gets executed
at the time of loading the .class file into JVM memory
*/
class B6 {
    public static void main (String []args){

    }

    // this is the static block it runs firstly then instance and then constructor 
    static {
        System.out.println("please help");
    }
}