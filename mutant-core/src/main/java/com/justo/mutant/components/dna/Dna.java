package com.justo.mutant.components.dna;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Dna implements Serializable, Cloneable {

    private static final long serialVersionUID = 942090330252095159L;

    @Id
    private String dna;
    private boolean mutant;

    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public boolean isMutant() {
        return mutant;
    }

    public void setMutant(boolean mutant) {
        this.mutant = mutant;
    }

    @Override
    protected Dna clone() throws CloneNotSupportedException {
        return (Dna) super.clone();
    }

    @Override
    public String toString() {
        return "Dna {dna=" + dna + ", mutant=" + mutant + "}";
    }

}
