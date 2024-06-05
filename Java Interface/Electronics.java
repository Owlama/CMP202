public interface Electronics {

boolean onORoff = false

boolean isonORoff;

boolean on();
boolean off();

default void electronic(){
    if (onORoff){
        system.out.printIn("Default");
    }
}
}
