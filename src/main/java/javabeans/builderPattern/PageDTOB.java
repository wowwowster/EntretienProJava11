package javabeans.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class PageDTOB {

    private int numero;
    private List<String> textblocks = new ArrayList<>();

    public PageDTOB(){

    }
    public PageDTOB(int numero, List<String> textblocks) {
        this.numero = numero;
        this.textblocks = textblocks;
    }

    public PageDTOB setNumero(int numero) {
        this.numero = numero;
        return this;
    }

    public PageDTOB setTextblocks(List<String> textblocks) {
        this.textblocks = textblocks;
        return this;
    }

    public int getNumero() {
        return numero;
    }

    public List<String> getTextblocks() {
        return textblocks;
    }

    public PageDTOB addToTextBlocks (String txtBloack){
        this.textblocks.add(txtBloack);
        return this;
    }

    @Override
    public String toString() {
        return "PageDTOB{" +
                "numero=" + numero +
                ", textblocks=" + textblocks +
                '}';
    }
}
