RestControler       
@RestControler
public class HelloWorldControle {
    private final String template = "Hello %s! ";
    private final Atomiclong counter= new Atomiclong();

    @RequestMapping("/hello")
    public HelloWorld hello(
        @RequestParam (value = "name", defaltValue = "Hello")String name){
            return new HelloWorld(counter.incrementAndGet()String.format(template,name))
}}