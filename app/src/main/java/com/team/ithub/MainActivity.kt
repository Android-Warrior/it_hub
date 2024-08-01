package com.team.ithub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.team.ithub.ui.theme.ItHubTheme

class MainActivity : ComponentActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        setContent {
            ItHubTheme {

            }
        }
        val currentUser = auth.currentUser
        if (currentUser != null) {

        }
    }

    @Preview
    @Composable
    fun HelloCompose(
        title: String = "Hello compose",
        content: String = "Text from Jetpack compose",
    ) {
        Text(text = title)
        Text(text = " ")
    }
}