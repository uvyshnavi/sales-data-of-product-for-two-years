public class data {
    private String product;
    private int value;
    private double varpct;
     public data(String product,int value){
        this.product=product;
        this.value=value;
        

     }
     public data(String product,double varpct){
        this.product=product;
        this.varpct=varpct;
     }
     public int getvalue(){
        return value;

     }
     public String getProduct(){
        return product;
     }
     public String toString(){
        return "{"+this.product+":"+this.value+":"+this.varpct+"}";
     }

    
}
