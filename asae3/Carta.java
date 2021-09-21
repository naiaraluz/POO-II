
package asae3;

/**
 *
 * @author ASUS
 */

public class Carta {
    private int numero;
    private String naipe;

    public Carta(int numero, String naipe) 
        throws Exception {
        this.setNumero(numero);
        this.setNaipe(naipe);
    }

    public int getNumero() {
        return numero;
    }
    
    public String getNaipe() {
        return naipe;
    }

    public void setNumero(int numero)
        throws Exception {
            if(numero>0 && numero<=13){
                this.numero = numero;
            }else{
                throw new Exception("Carta não reconhecida!");
            }
        
    }
    
    public void setNaipe(String naipe)
        throws Exception {
            if(naipe=="espadas" || naipe=="ouros"  || naipe=="paus" || naipe=="copas"){
                this.naipe = naipe;
            }else{
                throw new Exception("Carta não reconhecida!");    
            }
        
    }  
    @Override
    
    public String toString(){
        return  numero + " de " + naipe;
    }
    
    public void mostraCarta(){
        System.out.println("------------------");
        System.out.println("Número: " + numero);
        System.out.println("Naipe: " + naipe);
    }
    
    
}

