import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20, 20);
    }

    @Test
    public void canPrintHasEnoughPaper(){
        printer.print(7, 2);
        assertEquals(6, printer.getPaper());
    }

    @Test
    public void cantPrintHasntEnoughPaper(){
        printer.print(7, 3);
        assertEquals(20, printer.getPaper());
    }


}
