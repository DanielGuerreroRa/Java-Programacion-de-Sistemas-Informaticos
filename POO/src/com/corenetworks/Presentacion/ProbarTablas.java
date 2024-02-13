package com.corenetworks.Presentacion;

import com.corenetworks.modelo.TablaMultimplicar;

public class ProbarTablas {
    public static void main(String[] args) {
        TablaMultimplicar t1 =new TablaMultimplicar();
        t1.setTablas(3);
        System.out.println(t1.tablasMultiplicar());
        TablaMultimplicar t2 = new TablaMultimplicar();
        t2.setTablas(8);
        System.out.println(t2.tablasMultiplicar());




    }
}
