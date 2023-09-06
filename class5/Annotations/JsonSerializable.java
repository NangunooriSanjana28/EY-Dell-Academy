package class5.Annotations;



import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//First step forward creating the custom annotation is to declare
//using keyword @interface
//next to add meta data - Runtime Visibility -Type means it can
//apply to classes
//This class has no method so will mark as marker interfaces

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {

}
