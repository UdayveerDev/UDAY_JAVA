interface customerRaj{
    int amt=5;
    void purchase();
}
class sellerSanju implements customerRaj
{
    @Override
    public void purchase(){
        // amt=5 final
        System.out.println("the customer needs "+amt+"kg Rice" );
    }
}
class B22 {
    public static void main (String []args){
        customerRaj r=new sellerSanju();
        r.purchase();
    }
}