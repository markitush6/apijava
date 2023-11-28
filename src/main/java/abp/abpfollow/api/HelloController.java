package abp.abpfollow.api;

import abp.abpfollow.model.Producto;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello-world1")
    @ResponseBody
    public String getIdHelloWorld(@RequestParam String id ) {
        return "id " + id;
    }
    @GetMapping("/hello-world/body")
    @ResponseBody
    public String getIdHelloWorldBody(@RequestBody String name ) {
        return "id " + name;
    }

    @PostMapping("/product")
    public String createProduct(@RequestBody Producto producto) {
        return producto.toString();
    }

    @PostMapping("hello-world")
    public String postHelloWorld() {
        return "Hello World!";
    }

    @PutMapping("hello-world")
    public String putHelloWorld() {
        return "Hello World!";
    }
    @DeleteMapping("hello-world")
    public String deleteHelloWorld() {
        return "Hello World!";
    }



}
