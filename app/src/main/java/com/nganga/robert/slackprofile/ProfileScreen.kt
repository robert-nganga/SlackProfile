package com.nganga.robert.slackprofile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(
    navigateToWebView: ()->Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(
            title = stringResource(id = R.string.title)
        )
        Spacer(modifier = Modifier.height(40.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "profile image",
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.outline,
            modifier = Modifier.fillMaxWidth(0.5f)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Attribute(name = "Name", value = "Robert Nganga")
        Spacer(modifier = Modifier.height(20.dp))
        Attribute(name = "Country", value = "Kenya")
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                  navigateToWebView()
            },
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Open Github")
        }

    }
}

@Composable
fun Attribute(
    name: String,
    value: String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(5.dp),
        shape = RoundedCornerShape(4.dp)
    ) {
        Text(
            text = "$name:  $value",
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 18.dp)
        )
    }
}

@Composable
fun TopAppBar(
    title: String,
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp, horizontal = 16.dp)
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}