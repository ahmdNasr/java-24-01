import org.junit.jupiter.api.BeforeAll;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    private Shop shop;

    @BeforeAll
    void setup() {
        shop = new Shop();

        Customer c1 = new Customer("Kazim", "Sakip", "k.s@gmail.com", Instant.now());
        Customer c2 = new Customer("Viktor", "Steiner", "viktors@gmail.com", Instant.now());
        Customer c3 = new Customer("Anna", "Patschen", "annapatschen@gmail.com", Instant.now());

        Product uhr = new Product("Uhr", "hilft dabei die Zeit zu lesen", 150.0f, "U139030");
        Product rolex = new Product("Rolex Uhr", "hilft dabei die Zeit zu lesen", 18000.0f, "U144430");
        Product soundMachine = new Product("Sound Machine", "Macht viele geräusche auf Tastenklick", 9.0f, "SM239");
        Product pinzette = new Product("Pinzette", "Pinzette mit integrierte LED", 2.49f, "P800");
        Product monitor = new Product("Monitor Groß", "Monitor mit vielen kleinen Pixeln", 250.0f, "LG239340e");
        Product keyboard = new Product("Keyboard", "Keyboard mit vielen Tasten", 100.0f, "K239340e");
        Product perfume = new Product("Perfume", "Riecht echt gut hmmmn (100ml)", 100.0f, "P239340e");

        Order o1 = new Order(c1);
        Order o2 = new Order(c1);
        Order o3 = new Order(c1);

        Order o4 = new Order(c2);

        Order o5 = new Order(c3);
        Order o6 = new Order(c3);

        o1.addProduct(uhr, 1);
        o1.addProduct(rolex, 1);
        o1.addProduct(pinzette, 2);
        o1.setHasPaid(true);
        o1.setOrderDate(Instant.now());
        shop.addOrder(o1);

        o2.addProduct(monitor, 1);
        o2.setHasPaid(false);
        o2.setOrderDate(Instant.now());
        shop.addOrder(o2);

        o3.addProduct(soundMachine, 1);
        o3.setHasPaid(true);
        o3.setOrderDate(Instant.now());
        shop.addOrder(o3);

        o4.addProduct(monitor, 12);
        o4.addProduct(keyboard, 12);
        o4.setHasPaid(true);
        LocalDateTime kursbeginn = LocalDateTime.of(2024, Month.MAY, 21, 8, 45);
        o4.setOrderDate(kursbeginn.toInstant(ZoneOffset.UTC));
        shop.addOrder(o4);

        o5.addProduct(perfume, 1);
        o5.addProduct(rolex, 1);
        o5.setHasPaid(true);
        o5.setOrderDate(Instant.now());
        shop.addOrder(o5);

        o6.addProduct(pinzette, 1);
        o6.setHasPaid(true);
        o6.setOrderDate(Instant.now());
        shop.addOrder(o6);
    }

}