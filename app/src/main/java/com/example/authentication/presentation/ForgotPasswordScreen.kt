package com.example.authentication.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.authentication.R
import java.util.Locale

@Composable
fun ForgotScreen() {
    LazyColumn(
        contentPadding = PaddingValues(24.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        item {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Forgot Password".uppercase(Locale.getDefault()),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }
        item {
            OutlinedTextField(
                value = "",
                modifier = Modifier.fillMaxWidth(),
                onValueChange = {},
                label = { Text(text = stringResource(id = R.string.Email)) },
                leadingIcon = { Icon(imageVector = Icons.Rounded.Email, contentDescription = null) },
            )
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
            ) {
                Text(text = stringResource(id = R.string.Reset))
            }
        }
    }
}

@Preview
@Composable
fun ForgotView() {
    Column {
        ForgotScreen()
    }
}
