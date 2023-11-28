package abp.abpfollow.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/get/hello-world")
    public String getHelloWorld() {
        return "Hello World!";
    }

    @PostMapping("post/hello-world")
    public String postHelloWorld() {
        return "Hello World!";
    }

    @PutMapping("put/hello-world")
    public String putHelloWorld() {
        return "Hello World!";
    }
    @DeleteMapping("delete/hello-world")
    public String deleteHelloWorld() {
        return "Hello World!";
    }



}
