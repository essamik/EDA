/*
 * StockService.java
 *
 * Created on 20 mars 2007, 17:32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package market;
import java.util.ArrayList;

/**
 *
 */
public class StockService {
    
    private ArrayList<StockProduct> daList;
    /** Creates a new instance of StockService */
    public StockService() {
        setDaList(new ArrayList());
        StockProduct thisStockPdt = new StockProduct("Sun");
        thisStockPdt.setStockID("1");
        getDaList().add(thisStockPdt);
        thisStockPdt = new StockProduct("Apple");
        thisStockPdt.setStockID("2");       
        getDaList().add(thisStockPdt);
        thisStockPdt = new StockProduct("IBM");
        thisStockPdt.setStockID("3");
        getDaList().add(thisStockPdt);
    }
    
    public ArrayList getDaList() {
        return daList;
    }
    
    public void setDaList(ArrayList daList) {
        this.daList = daList;
    }
}
