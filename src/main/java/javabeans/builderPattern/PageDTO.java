package javabeans.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class PageDTO {

    private int numero;

    private List<String> textBlocks = new ArrayList<String>();;

    public int getNumero() {
        return numero;
    }

    public PageDTO setNumero(int numero) {
        this.numero = numero;
        return this;
    }

    public List<String> getTextBlocks() {
        return textBlocks;
    }

    public PageDTO setTextBlocks(List<String> textBlocks) {
        this.textBlocks = textBlocks;
        return this;
    }

    public void addTextBlock(String block) {
        this.textBlocks.add(block);
    }
}