package com.idn.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.idn.doadandzikir.adapter.DzikirDoaAdapter

class QauliyahShalatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_qauliyah_shalat)

        val rvqauliyahShalatActivity: RecyclerView = findViewById(R.id.rv_qauliyah_sholat)
        rvqauliyahShalatActivity.layoutManager = LinearLayoutManager(this)
        rvqauliyahShalatActivity.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}