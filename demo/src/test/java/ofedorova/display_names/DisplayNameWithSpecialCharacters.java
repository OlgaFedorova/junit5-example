package ofedorova.display_names;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * DisplayNameWithSpecialCharacters.
 *
 * @author Olga_Fedorova
 */
@DisplayName("Display name with !@#$%^&*()_+~`╯°□°）╯ special character")
public class DisplayNameWithSpecialCharacters {

    @Test
    public void test() {
        System.out.println("test method got executed!!!");
    }
}
