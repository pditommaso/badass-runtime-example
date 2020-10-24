package io.foo

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j

@Slf4j
@CompileStatic
class Hello {

    static void main(String... args) {
        println "Hello groovy world!!"
        log.info "Done"
    }

}
