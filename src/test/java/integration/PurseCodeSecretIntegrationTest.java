package integration;

public class PurseCodeSecretIntegrationTest {
    Purse purse;
    CodeSecret codeSecret;
    private double montantCredit = 100;
    private double montantDebit = 20;
    private String bonCode;
    @beforeEach
    public void setUp(){
        codeSecret = new CodeSecret();
        purse = new Purse();
        purse.credite(montantCredit);
        bonCode = codeSecret.revelerCode();
    }
    @Test
    public void testDebitAvecCodeJusteAutorise(){
        purse.debite(montantDebit,boncode);
        Assertions.assertEquals(montantCredit-montantDebit, purse.getSolde())
    }
    @Test
    public void testDebitAvecCodeFauxRejete(){

    }
    @Test
    public void testDebitAvecCodeBloque(){

    }
    @Test
    public void testDebitAvecCodeBloqueRejete(){

    }
}
