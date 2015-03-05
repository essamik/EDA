/*
 * Trader.java
 *
 * Created on November 8, 2007, 5:03 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package trader;

import java.util.ArrayList;
import market.StockProduct;
import market.StockService;

/**
 *
 * @author Alexandre Metrailler
 */
public class Trader {
    
    private String name;
    private StockService marketPrices = market.MarketGUI.service;
    private ArrayList<StockProduct> myStock;
    
    /**
     * Creates a new instance of Trader
     */
    public Trader() {
        initiateMyStock();
    }
    
    /**
     * methode appelee par le UserGUI lors de l'achat ou la vente
     */
    public void update(int qtty, int stockID, String type){
        
        if(type.equals("buy")){//si l'utilisateur achete
            //recupere le prix d'achat
            double price = ((StockProduct)marketPrices.getDaList().get(stockID)).getStockPrice();
            //insere dans myStock la quantite du titre achete
            ((StockProduct) myStock.get(stockID)).setStockQty(((StockProduct) myStock.get(stockID)).getStockQty() + qtty);
            //insere dans myStock le prix auquel le titre a ete achete
            ((StockProduct) myStock.get(stockID)).setStockPrice(price);
            
        }else if(type.equals("sell")){//si l'utilisateur vend
            if (qtty <= ((StockProduct) myStock.get(stockID)).getStockQty()){//verifie si il possede la quantite qu'il veut vendre
                //soustrait la quantite vendue a la quantite dans myStock
                ((StockProduct) myStock.get(stockID)).setStockQty(((StockProduct) myStock.get(stockID)).getStockQty() - qtty);
                //calcule l'ajustement a faire au resultat en fonction du prix d'achat et du prix de vente du titre
                double adjust = ((qtty* ((StockProduct)marketPrices.getDaList().get(stockID)).getStockPrice()))-((qtty* ((StockProduct) myStock.get(stockID)).getStockPrice()));
                //fait l'ajustement
                ((StockProduct) myStock.get(stockID)).setResult(((StockProduct) myStock.get(stockID)).getResult() + Math.round(adjust));
                //enregistre le dernier prix d'achat
                ((StockProduct) myStock.get(stockID)).setStockPrice(((StockProduct)marketPrices.getDaList().get(stockID)).getStockPrice());
            }
        }
    }
    
    
    public ArrayList<StockProduct> getMyStock() {
        return myStock;
    }
    
    //retourne le texte de l'affichage UserGUI en fonction du stock ID
    public String getText(int stockID){
        String text = "";
        text = ((StockProduct) myStock.get(stockID)).getStockName()+ " (Qtty " + ((StockProduct) myStock.get(stockID)).getStockQty() + ") "+ "Result(" + ((StockProduct) myStock.get(stockID)).getResult() + ")";
        return text;
    }
    
    //retourne le resultat total du trader
    public Double getTotalResult(){
        double total = new Double(0);
        for(StockProduct j : myStock){
            total = total + j.getResult();}
        return total;
    }
    
    //initialise la liste des stocks pour permettre l'affichage
    public void initiateMyStock(){
        myStock = new ArrayList();
        ArrayList<StockProduct> serviceList = marketPrices.getDaList();
        for(StockProduct j: serviceList){
            myStock.add(j.clone());
        }
    }
}
