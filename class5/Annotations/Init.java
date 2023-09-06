package class5.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Another Method Level Annotation
//Let's Imagine before serializing the object to a JSON String,
//we want to execute one method to initialize an object


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface Init {

}
