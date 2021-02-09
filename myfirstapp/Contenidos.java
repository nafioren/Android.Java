package com.example.myfirstapp;

public class Contenidos {
    private Pagina[] mPaginas;
    public Contenidos(){
        mPaginas = new Pagina[5];
        mPaginas[0] = new Pagina (
                R.drawable.img0,
                Text:"texto de ejemplo",
                new Opcion ( Text:"El lugar mas lindo", NextPage:1),
                new Opcion ( Text:"Ushuaia", NextPage:2 )

        )
    }
}
