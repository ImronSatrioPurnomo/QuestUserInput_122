package com.example.pertemuanlima

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier


private val Unit.submit: Int
private val Unit.divider_tipis: Int
private val Unit.padding_medium: Int
private val Arrangement.top: Arrangement.Vertical

@Composable
fun FormDataDiri(modifier: Modifier
){
    var textNama by remember { mutableStateOf(value = "")}
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }

    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    val gender:List<String> = listOf("Laki-laki","Perempuan")

    Column(modifier= Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(width = 250.dp),
            label = { Text(text = "Nama Lengkap") },
            onValueChange = {
                textNama = it
            }
        )
        Row {
            gender.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = textJK == item,
                    onClick = {textJK = item}
                ), verticalAlignment = Alignment.CenterHorizontally) {
                    RadioButton(
                        selected = textJK == item,
                        onClick = {
                            textJK = item
                        })
                    Text(text=item)
                }
            }
        }
        OutlinedTextField(
            value = textAlamat,
            singleLine = true,
            modifier = Modifier.width(width = 250.dp),
            label = {Text(text = "Alamat Lengkap")},
            onValueChange = {
                textAlamat = it
            }
        )
        HorizontalDivider(
            modifier = Modifier.padding(
                bottom = dimensionResource(id = R.dimen.padding_medium),
                top = dimensionResource(
                    id = R.dimen.padding_medium

            )),
            thickness = dimensionResource(id = R.dimen.divider_tipis),
            color = Color.DarkGray
        )
        Button(
            modifier = Modifier.fillMaxSize(fraction = 1f),
            enabled = textAlamat.isNotEmpty(),
            onClick = {
                nama=textNama
                jenis=textJK
                alamat=textAlamat
            }
        ) {
            Text(text = stringResource(id=R.string.submit))
        }

        HorizontalDivider(
            modifier = Modifier
                .padding(bottom = dimensionResource(id = R.dimen.padding_medium),
                    top = dimensionResource(
                        id = R.dimen.padding_medium
                    )),
            thickness = dimensionResource(id= R.dimen.divider_tipis),
            color = Color.DarkGray
        )

        ElevatedCard (
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Black),
            modifier = Modifier
                .height(height = 100.dp)
                .width(width = 300.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 5.dp, vertical = 15.dp),
            ) {
                Text(text = "Nama   : "+nama, color = Color.White)
                Text(text = "Gnder  : "+jenis, color = Color.White)
                Text(text = "alamat : "+alamat, color = Color.White)

            }
        }
    }
}