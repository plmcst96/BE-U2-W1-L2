package cristinapalmisani.U2W1L1;

import cristinapalmisani.U2W1L1.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1L1Application.class);

        Pizzas pizza1 = (Pizzas) ctx.getBean("onionPizza");
        Pizzas pizza2 = (Pizzas) ctx.getBean("margherita");
        Pizzas pizza3 = (Pizzas) ctx.getBean("hawaiian");

        Drinks drink1 = (Drinks) ctx.getBean("cocaCola");
        Drinks drink2 = (Drinks) ctx.getBean("water");

        Toppings topping = (Toppings) ctx.getBean("salami");

        Menu menu1 = new Menu(List.of(pizza1, pizza2, pizza3), List.of(drink1, drink2), List.of(topping));

        fakeOrder(menu1);
    }

    public void fakeOrder(Menu menu) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U2W1L1Application.class);
        Order order = context.getBean(Order.class);
        order.setTable(context.getBean("getTable", Table.class));
        order.setMenu(menu);
        order.printOrder();
    }

}
