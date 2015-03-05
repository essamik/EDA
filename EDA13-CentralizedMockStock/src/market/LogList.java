/*
 * LogList.java
 *
 * Created on 12 février 2007, 10:38
 *
 */

package market;


import java.util.ArrayList;

/**
 * Cet objet contient la liste des evenments de marché
 */
public class LogList extends ArrayList{
    /**
     * Creates a new instance of LogList
     */
    public LogList() {
        super();
    }
    
    /**
     * Cette méthode retourne la liste inversée des évennements de sorte à l'afficher à l'envers dans la JTable
     */
    public boolean addReverse(Object o) {
        int kingSize = this.size();
        this.add(this.get(kingSize-1));
        for(int i=kingSize-1;i>0;i--){
            this.set(i,this.get(i-1));
        }
        this.set(0,o);
        return true;
    }
}
