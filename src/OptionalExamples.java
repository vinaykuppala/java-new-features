import java.util.Optional;


public class OptionalExamples {
   
    
    public static void main(String[] args){
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());
        
        String name = "baeldung";
        Optional<String> nameOptional = Optional.of(name);
        System.out.println(nameOptional.isPresent());
        
        //System.out.println(new Outer().getInner().inner());
        System.out.println(NullResolver.resolve(()->new Outer().getInner().inner()).isPresent()? new Outer().getInner().inner() : "empty");
     
        System.out.println(NullResolver.resolve(()->new Outer().getInner().inner()).orElse("empty"));
       
        
    }
    

}

    class Outer{
        
        public Inner getInner(){
            return new Inner();
           //return null;
        }
    }
    
    class Inner{
        
        public String inner(){
           // return "inner method";
           return null;
        }
    }
