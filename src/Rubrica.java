import java.util.ArrayList;
import java.util.Iterator;

public class Rubrica {
    private ArrayList<Contatto> contatti;

    public Rubrica() {
        this.contatti = new ArrayList<Contatto>();
    }

    void aggiungiContatto(String nome, String cognome, String telefono) {
        this.contatti.add(new Contatto(nome, cognome, telefono));
    }

    boolean rimuoviContatto(String nome, String cognome) {
        boolean rimosso = false;
        Iterator<Contatto> it = this.contatti.iterator();
        while (it.hasNext() && !rimosso) {
            Contatto c = it.next();
            if (c.getNome().equals(nome) && c.getCognome().equals(cognome)) {
                it.remove();
                rimosso = true;
            }
        }
        return rimosso;
    }

    String cerca(String nome, String cognome) {
        String numero = null;
        Iterator<Contatto> it=this.contatti.iterator();
        while(it.hasNext() && numero==null){
            Contatto c=it.next();
            if(c.getNome().equals(nome)&&
                    c.getCognome().equals(cognome))
                numero=c.getNumero();
        }
        return numero;
    }

    public String toString(){
        String s="Rubrica\n";
        s+="---------------------------\n";
        Iterator<Contatto> it=this.contatti.iterator();
        while(it.hasNext()){
            Contatto c=it.next();
            s+=c.toString()+"\n";
        }
        return s;
    }

}


