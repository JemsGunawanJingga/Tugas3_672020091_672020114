package edu.uksw.fti.pam.acitivityintent.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import edu.uksw.fti.pam.acitivityintent.R


@Composable
fun HomeScreen(){

        Column(
            modifier = Modifier.fillMaxSize(),

            ) {

            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_image1),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Michael J. Ramli",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Hello Good Morning",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(top = 2.dp, bottom = 2.dp).background(
                    Color(0XFFF6EDFF)
                )

            ){
                Image(
                    painter = painterResource(id = R.drawable.ic_iamge2),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Jonathan",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Are You Home?",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_image3),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Alexa",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Lets Work",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_image4),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Sarah Wijayanti",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Have a Nice Day",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_image5),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Donatelo K.Natan",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Lets Have a Holiday",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_iamge6),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Kimberly",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Lets make a beautiful night",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_image7),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Home Alone",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "I'm scared",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_iamge8),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Layla Limbergh",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Last night was really fun",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_image1),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Koh LI Cuan",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Lest make money",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_image3),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Sunset",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "What a beautiful day",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }

            //Last
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_image4),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Layla Layla",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Last night was realy fun",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_image5),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Suprihadi",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Dont forget your task",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_iamge6),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Berliana",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Want to wacth a movie?",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }
            Row (
                modifier = Modifier.clickable { }.fillMaxWidth().padding(bottom = 2.dp).background(Color(0XFFF6EDFF))

            ){
                Image(
                    painter = painterResource(id = R.drawable.img_image4),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(top = 10.dp,start = 10.dp),
                    alignment = Alignment.TopStart
                )
                Column {
                    Text(
                        text = "Amanda",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                    )
                    Text(
                        text = "Last night was realy fun",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(start = 20.dp)
                    )
                }

            }


        }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAMAcitivityIntentTheme {
        HomeScreen()
    }
}