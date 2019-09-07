package suites;

import categories.NegativeTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ClienteTest;
import tests.IndexTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({
        IndexTest.class,
        ClienteTest.class
})
@Categories.IncludeCategory({NegativeTest.class})

public class NegativeSuite {
}
