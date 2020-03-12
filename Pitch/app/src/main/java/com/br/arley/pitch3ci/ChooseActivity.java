package com.br.arley.pitch3ci;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ChooseActivity extends AppCompatActivity{

    DatabaseReference dataBase;
    static Equipe equipe;

    CardView cvArley;CardView cvFelipe;CardView cvDebora;
    CardView cvYasmin;CardView cvLuiz;CardView cvIsaac;
    CardView cvNatalia;CardView cvJoao;CardView cvAirton;
    CardView cvLorenzo;CardView cvJose;CardView cvSarah;

    TextView investimentoArley;   TextView investimentoFelipe; TextView investimentoDebora;
    TextView investimentoYasmin;  TextView investimentoLuiz;   TextView investimentoIsaac;
    TextView investimentoNatalia; TextView investimentoJoao;   TextView investimentoAirton;
    TextView investimentoLorenzo; TextView investimentoJose;   TextView investimentoSarah;

    TextView mediaStarArley;   TextView mediaStarFelipe; TextView mediaStarDebora;
    TextView mediaStarYasmin;  TextView mediaStarLuiz;   TextView mediaStarIsaac;
    TextView mediaStarNatalia; TextView mediaStarJoao;   TextView mediaStarAirton;
    TextView mediaStarLorenzo; TextView mediaStarJose;   TextView mediaStarSarah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        equipe = new Equipe();
        dataBase = FirebaseDatabase.getInstance().getReference();
        putId();
        ImageButton btVoltar = findViewById(R.id.activity_choose_bt_voltar);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        clickIt();

        dataBase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }

    private void clickIt() {
        cvNatalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               actionClick("11");
            }
        });
        cvArley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionClick("1");
            }
        });
        cvJose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionClick("0");
            }
        });
        cvJoao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionClick("7");
            }
        });
        cvSarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionClick("10");
            }
        });
        cvYasmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionClick("4");
            }
        });
        cvLorenzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionClick("9");
            }
        });
        cvLuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionClick("5");
            }
        });
        cvDebora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionClick("3");
            }
        });
        cvFelipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionClick("2");
            }
        });
        cvAirton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionClick("8");
            }
        });
        cvIsaac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionClick("6");
            }
        });
    }

    private void actionClick(String i) {
            equipe.setId(i);
        startActivity(new Intent(ChooseActivity.this, EquipeActivity.class));
    }

    private void putId() {
        cvNatalia = findViewById(R.id.activity_choose_cv_Natalia);
        cvArley = findViewById(R.id.activity_choose_cv_Arley);
        cvJose = findViewById(R.id.activity_choose_cv_Jose);
        cvJoao = findViewById(R.id.activity_choose_cv_Joao);
        cvSarah = findViewById(R.id.activity_choose_cv_Sarah);
        cvLorenzo = findViewById(R.id.activity_choose_cv_Lorenzo);
        cvLuiz = findViewById(R.id.activity_choose_cv_Luiz);
        cvDebora = findViewById(R.id.activity_choose_cv_Debora);
        cvFelipe = findViewById(R.id.activity_choose_cv_Felipe);
        cvYasmin = findViewById(R.id.activity_choose_cv_Yasmim);
        cvAirton = findViewById(R.id.activity_choose_cv_Airton);
        cvIsaac = findViewById(R.id.activity_choose_cv_Isaac);

        investimentoNatalia = findViewById(R.id.activity_choose_tv_moneyNatalia);
        investimentoArley = findViewById(R.id.activity_choose_tv_moneyArley);
        investimentoJose = findViewById(R.id.activity_choose_tv_moneyJose);
        investimentoJoao = findViewById(R.id.activity_choose_tv_moneyJoao);
        investimentoSarah = findViewById(R.id.activity_choose_tv_moneySarah);
        investimentoLorenzo = findViewById(R.id.activity_choose_tv_moneyLorenzo);
        investimentoLuiz = findViewById(R.id.activity_choose_tv_moneyLuiz);
        investimentoDebora = findViewById(R.id.activity_choose_tv_moneyDebora);
        investimentoFelipe = findViewById(R.id.activity_choose_tv_moneyFelipe);
        investimentoYasmin = findViewById(R.id.activity_choose_tv_moneyYasmim);
        investimentoAirton = findViewById(R.id.activity_choose_tv_moneyAirton);
        investimentoIsaac = findViewById(R.id.activity_choose_tv_moneyIsaac);

        mediaStarNatalia = findViewById(R.id.activity_choose_tv_avaliacaoNatalia);
        mediaStarArley = findViewById(R.id.activity_choose_tv_avaliacaoArley);
        mediaStarJose = findViewById(R.id.activity_choose_tv_avaliacaoJose);
        mediaStarJoao = findViewById(R.id.activity_choose_tv_avaliacaoJoao);
        mediaStarSarah = findViewById(R.id.activity_choose_tv_avaliacaoSarah);
        mediaStarLorenzo = findViewById(R.id.activity_choose_tv_avaliacaoLorenzo);
        mediaStarLuiz = findViewById(R.id.activity_choose_tv_avaliacaoLuiz);
        mediaStarDebora = findViewById(R.id.activity_choose_tv_avaliacaoDebora);
        mediaStarFelipe = findViewById(R.id.activity_choose_tv_avaliacaoFelipe);
        mediaStarYasmin = findViewById(R.id.activity_choose_tv_avaliacaoYasmim);
        mediaStarAirton = findViewById(R.id.activity_choose_tv_avaliacaoAirton);
        mediaStarIsaac = findViewById(R.id.activity_choose_tv_avaliacaoIsaac);
    }

}
