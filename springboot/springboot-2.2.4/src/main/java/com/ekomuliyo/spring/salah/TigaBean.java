package com.ekomuliyo.spring.salah;

/**
 * TigaBean
 */
public class TigaBean {

    private SatuBean satuBean;

    public TigaBean(SatuBean satuBean) {
        this.satuBean = satuBean;
    }

    public SatuBean getSatuBean() {
        return satuBean;
    }

    public void setSatuBean(SatuBean satuBean) {
        this.satuBean = satuBean;
    }

    
}