package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import runners.*;

import static org.junit.runners.Suite.*;

@RunWith(Suite.class)
@SuiteClasses(value = {
        LoginRunner.class,
        ShoppingCartRunner.class,
        SearchFunctionalityRunner.class,
        WishlistRunner.class,
        FilteringRunner.class

})

public class UmicoSuite {
}
