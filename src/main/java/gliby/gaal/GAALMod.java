package gliby.gaal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface GAALMod {

    String modId();

    String name() default "";
    /**
     * A version string for this mod
     */
    String version() default "";

}
