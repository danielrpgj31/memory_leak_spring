package br.oracle.acs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.oracle.acs.springleak.MemLeakService;
import br.oracle.acs.noleak.MemNoLeakService;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        // loading Spring beans definitions from the given XML file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Getting leakService object from Spring context
        MemLeakService leakService = (MemLeakService) context.getBean("memLeakService");

        //Getting noLeakService object from 'raw'
        MemNoLeakService noLeakService = new MemNoLeakService();

        //Populate the Heap with one of two implementations: 
        //1 - using spring to create child objects using @Autowired, populating Heap with fixed static pointers objects.
        //2 - no spring, pure java to populate Heap with transient objects.
        
        if(args.length == 0) 
            System.out.println("######################## Arguments not defined.");
        else if (args[0].equals("raw")) {
            noLeakService.initOOM();
            System.out.println("######################## Heap populated.");
            System.out.println("######################## Press control+c to exit.");
            while (true);
        } else if (args[0].equals("spring")) {
            leakService.initOOM();
            System.out.println("######################## Heap populated.");
            System.out.println("######################## Press control+c to exit.");
            while (true);
        }
            
    }
}
