package com.test.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.myapplication.ui.theme.KotlinMobileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinMobileAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Surface(color = Color.Cyan) {
//        Text(
//            text = "Hello $name!",
//            modifier = modifier.padding(24.dp)
//        )
//    }
//}
//@Composable
//fun GreetingText(message:String,from:String,modifier:Modifier=Modifier){
//    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally,modifier = modifier.fillMaxSize()) {
//        Text(text = message, modifier = modifier, fontSize = 100.sp, lineHeight = 116.sp, textAlign = TextAlign.Center)
//        Text(text = from, fontSize = 36.sp, modifier=modifier.align(alignment = Alignment.CenterHorizontally))
//    }
//}

//@Composable
//fun GreetingImage(message:String,from:String,modifier:Modifier=Modifier){
//    val image = painterResource(R.drawable.androidparty)
//    Box(modifier) {
//        Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop,alpha = 0.5F
//        )
//        GreetingText(message, from )
//    }
//}

//@Composable
//fun IntroductionPage(modifier:Modifier = Modifier){
//    val image = painterResource(R.drawable.bg_compose_background)
//    Column(modifier=modifier.fillMaxSize()){
//        Image(painter = image,contentDescription = "App Bar Image")
//        Text(text = stringResource(R.string.jetpack_title),fontSize = 16.sp,modifier=modifier.padding(16.dp))
//        Text(text= stringResource(R.string.tutorial), modifier=modifier.padding(16.dp))
//        Text(text= stringResource(R.string.explanation), modifier=modifier.padding(16.dp), textAlign = TextAlign.Justify)
//    }
//}
@Composable
fun CardItem(image: ImageVector,description:String, modifier: Modifier=Modifier){
    Row(horizontalArrangement = Arrangement.Start,verticalAlignment = Alignment.CenterVertically,modifier = Modifier.fillMaxWidth().padding(start = 100.dp)){
        Icon(image,contentDescription = description)
        Spacer(modifier=Modifier.width(25.dp))
        Text(text = description)
    }
}

//@Composable
//fun Card(title:String,message:String,color:Color,modifier: Modifier = Modifier){
//    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally,modifier = modifier.background(color=color).padding(16.dp).fillMaxSize()){
//        Text(text=title, fontWeight = FontWeight.Bold,modifier=Modifier.padding(bottom = 5.dp))
//        Text(text=message, textAlign = TextAlign.Justify)
//    }
//}
//@Composable
//fun TaskCompletionView(modifier:Modifier = Modifier){
//    val image = painterResource(R.drawable.ic_task_completed)
//    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.fillMaxSize()){
//        Image(painter = image,contentDescription = "Task Completed")
//        Text(text= stringResource(R.string.all_tasks_completed_text), fontWeight = FontWeight.Bold,modifier=modifier.padding(top=24.dp, bottom = 8.dp))
//        Text(text= stringResource(R.string.nice_work_text), fontSize = 16.sp)
//    }
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    KotlinMobileAppTheme {
        Column(verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.background(color=Color(0xFF77bb77))){
            Spacer(modifier = Modifier.weight(1f))
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .weight(2f)
                .fillMaxWidth()) {
                Image(painter = painterResource(R.drawable.android_logo), contentDescription = "Android Image",modifier = Modifier
                    .height(170.dp)
                    .background(color = Color(0xFF000000)))
                Text(text="John Snowden", fontWeight = FontWeight.Bold)
                Text(text="Mobile App Developer")
            }
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(1f)) {
                CardItem(image = Icons.Filled.Call, description = "+251914547414")
                CardItem(image = Icons.Filled.Share, description = "@AndroidDev")
                CardItem(image = Icons.Filled.Email, description = "jen.doe@email.com")
            }
            }
        }
}


//@Composable
//fun ComposeQuadrantApp() {
//    Column(Modifier.fillMaxWidth()) {
//        Row(Modifier.weight(1f)) {
//            ComposableInfoCard(
//                title = stringResource(R.string.first_title),
//                description = stringResource(R.string.first_description),
//                backgroundColor = Color(0xFFEADDFF),
//                modifier = Modifier.weight(1f)
//            )
//            ComposableInfoCard(
//                title = stringResource(R.string.second_title),
//                description = stringResource(R.string.second_description),
//                backgroundColor = Color(0xFFD0BCFF),
//                modifier = Modifier.weight(1f)
//            )
//        }
//        Row(Modifier.weight(1f)) {
//            ComposableInfoCard(
//                title = stringResource(R.string.third_title),
//                description = stringResource(R.string.third_description),
//                backgroundColor = Color(0xFFB69DF8),
//                modifier = Modifier.weight(1f)
//            )
//            ComposableInfoCard(
//                title = stringResource(R.string.fourth_title),
//                description = stringResource(R.string.fourth_description),
//                backgroundColor = Color(0xFFF6EDFF),
//                modifier = Modifier.weight(1f)
//            )
//        }
//    }
//}
//
//@Composable
//private fun ComposableInfoCard(
//    title: String,
//    description: String,
//    backgroundColor: Color,
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier = modifier
//            .fillMaxSize()
//            .background(backgroundColor)
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = title,
//            modifier = Modifier.padding(bottom = 16.dp),
//            fontWeight = FontWeight.Bold
//        )
//        Text(
//            text = description,
//            textAlign = TextAlign.Justify
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun ComposeQuadrantAppPreview() {
//    KotlinMobileAppTheme {
//        ComposeQuadrantApp()
//    }
//}