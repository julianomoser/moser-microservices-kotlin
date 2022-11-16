package br.com.moser

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * @author Juliano Moser
 */
@RestController
class GreetingController {

    val counter: AtomicLong = AtomicLong();

    @RequestMapping("/greeting")
    fun greeting(): Greeting {
        return  Greeting(counter.incrementAndGet(), "Hello Kotlin!")
    }
}
