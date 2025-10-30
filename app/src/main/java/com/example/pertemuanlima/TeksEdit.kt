package com.example.pertemuanlima

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier


private val Arrangement.top: Arrangement.Vertical

@Composable
fun FormDataDiri(modifier: Modifier
){
    var TextNama by remember { mutableStateOf(value = "")}
    var TextAlamat by remember { mutableStateOf(value = "") }
    var TextJK by remember { mutableStateOf(value = "") }

    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    val gender:List<String> = listOf("Laki-laki","Perempuan")

    Column(modifier= Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.top,
        horizontalAlignment = Alignment.CenterHorizontally) {

    }
}