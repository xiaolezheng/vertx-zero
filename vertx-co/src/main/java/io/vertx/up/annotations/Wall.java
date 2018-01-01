package io.vertx.up.annotations;

import io.vertx.zero.eon.Values;

import java.lang.annotation.*;

/**
 * Secure to provide wall to limit request
 * 1. 401 Response
 * 2. 403 Response
 * It's for security requirement.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Wall {
    /**
     * Default value for all request limitation.
     *
     * @return
     */
    String path() default "/*";

    /**
     * Required for this wall, it provide following component building
     * 1. Handler building
     * 2. Provider building
     * It's mapped to node "secure" configuration, this node could configure following information
     * 1. type: Standard type could identify Handler/Provider
     * 2. provider: ( Standard Skip )
     * 3. handler: ( Standard Skip )
     * 4. user: ( Required )
     * 5. config: JsonObject for provider
     *
     * @return
     */
    String key();

    /**
     * Value for wall sequence, it's for auth handler chain.
     * 1. All the wall class must contains different value
     * 2. The major wall should be 0, others could follow be 1, 2, 3.
     * 3. The wall handler sequence should be triggered by 0,1,2,3...
     * Multi handler mode needed for this value.
     *
     * @return
     */
    int value() default Values.ZERO;
}
