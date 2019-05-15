@Controller
class Example {
   @RequestMapping("/")
   @ResponseBody
   public String hello() {
      "Hello Spring Boot"
   }
   @RequestMapping("/2")
   @ResponseBody
   public String hello2() {
      "Hi Spring Boot"
   }
   
}
