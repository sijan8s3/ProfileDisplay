package com.sijan.theprofile

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sijan.theprofile.ui.theme.TheProfileTheme


@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        ProfileHeader()
        Spacer(modifier = Modifier.height(16.dp))
        ProfileInformation()
    }
}

@Composable
fun ProfileHeader() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_photo),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .padding(8.dp),
            contentScale = ContentScale.Crop
        )
    }
    Text(
        text = "John Doe",
        style = MaterialTheme.typography.displayMedium,
        modifier = Modifier.padding(top = 8.dp),
        textAlign = TextAlign.Center
    )
}

@Composable
fun ProfileInformation() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ProfileItem("Email", "john.doe@example.com")
        ProfileItem("Phone", "+1234567890")
        ProfileItem("Education", "Bachelor's in Computer Science")
        ProfileItem("Skills", "Android Development, Kotlin, Java")
        ProfileItem("Summary", "Experienced Android developer with a passion for creating innovative applications.")
    }
}

@Composable
fun ProfileItem(label: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.weight(1f),
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )
    }
}

@Preview()
@Composable
fun PreviewProfileScreen() {
    TheProfileTheme {
        Surface {
            ProfileScreen()
        }
    }
}
