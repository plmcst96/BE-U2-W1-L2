package cristinapalmisani.U2W1L1;

import cristinapalmisani.U2W1L1.entities.Menu;
import cristinapalmisani.U2W1L1.entities.Order;
import cristinapalmisani.U2W1L1.entities.Pizzas;
import cristinapalmisani.U2W1L1.entities.Table;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1L1Application.class);

        Menu menu = ctx.getBean(Menu.class);
        menu.printMenu();

        Pizzas pizza1 = (Pizzas) ctx.getBean("onion");
        Pizzas pizza2 = (Pizzas) ctx.getBean("margherita");
        Pizzas pizza3 = (Pizzas) ctx.getBean("hawaiian");
    }

    public void fakeOrder(Menu menu) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U2W1L1Application.class);
        Order order = context.getBean(Order.class);
        order.setTable(context.getBean("getTable", Table.class));
        order.setMenu(menu);
        order.printOrder();
    }

}