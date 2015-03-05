
import java.util.ArrayList;
import java.util.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KES
 */
public class MarketManager {
        
    private Timer daTimer;
    private PPriceEvolution pE;
    public static final StockService service = new StockService();
    private ArrayList daList;

    public MarketManager() {
        daList = service.getDaList();
        
        this.pE = new PPriceEvolution(daList);
        
        //Création d'un timer qui va modifier les prix toutes les minutes
        this.daTimer = new Timer();
        this.daTimer.schedule(this.pE, 0, 60*100);
        System.out.println("Market started!!");

    }
}
