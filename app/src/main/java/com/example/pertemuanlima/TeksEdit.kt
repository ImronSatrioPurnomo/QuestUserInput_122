package com.example.pertemuanlima

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier


@Composable
fun FormDataDiri(modifier: Modifier
){
    var TextNama by remember { mutableStateOf(value = "")}
    var TextAlamat by remember { mutableStateOf(value = "") }
    var TextJK by remember { mutableStateOf(value = "") }

    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }
}