package com.dio.arvoresBinarias;

import com.dio.arvoresBinarias.model.Obj;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArvoreBinaria<Obj> ar1 = new ArvoreBinaria<>();
        ar1.inserir(new Obj(13));
        ar1.inserir(new Obj(10));
        ar1.inserir(new Obj(25));
        ar1.inserir(new Obj(2));
        ar1.inserir(new Obj(12));
        ar1.inserir(new Obj(20));
        ar1.inserir(new Obj(31));
        ar1.inserir(new Obj(29));


        ar1.exibirInOrdem();
        ar1.exibirPosOrdem();
        ar1.exibirPreOrdem();
    }
}
