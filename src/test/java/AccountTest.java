import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void newAccountShouldNotBeActive(){
        //given
        Account newAccount= new Account();
        //then
        assertFalse(newAccount.isActive());
    }

    @Test
    void accountShouldBeActiveAfterActivation(){
        //given
        Account newAccount= new Account();
        //when
        newAccount.activate();
        //then
        assertTrue(newAccount.isActive());
    }


}