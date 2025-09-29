import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to describe an enhancement request.
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.TYPE)            
public @interface EnhancementRequest {
    String id();                            
    String synopsis();                      
    String engineer() default "unassigned"; 
    String date() default "unknown";        
}
