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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Person4
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.authentication.R
import java.util.Locale

@Composable
fun RegisterScreen() {
    var password by remember {
        mutableStateOf(value = "")
    }
    var showPassword by remember {
        mutableStateOf(value = false)
    }
    LazyColumn(
        contentPadding = PaddingValues(24.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Top,
    ) {
        item {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Sign In".uppercase(Locale.getDefault()),
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
                label = { Text(text = stringResource(id = R.string.Username)) },
                leadingIcon = { Icon(imageVector = Icons.Rounded.Person4, contentDescription = null) },
            )
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
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
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = stringResource(id = R.string.InputPassword)) },
                visualTransformation = if (showPassword) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                trailingIcon = {
                    if (showPassword) {
                        IconButton(onClick = { showPassword = false }) {
                            Icon(imageVector = Icons.Filled.Visibility, contentDescription = "hide_password")
                        }
                    } else {
                        IconButton(
                            onClick = { showPassword = true },
                        ) {
                            Icon(
                                imageVector = Icons.Filled.VisibilityOff,
                                contentDescription = "hide_password",
                            )
                        }
                    }
                },
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
                Text(text = stringResource(id = R.string.SignUpbtn))
            }
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
        }
        item {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
            ) {
                TextButton(onClick = { /*TODO*/ }) {
                    Text(
                        text = stringResource(id = R.string.SignIn),
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.Underline,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun RegisterView() {
    Column {
        RegisterScreen()
    }
}
