package edu.uksw.fti.pam.acitivityintent.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.acitivityintent.R
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme


@Composable
fun CallScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFFF6EDFF))

    ) {
        Row (
            modifier = Modifier
                .clickable { }
                .fillMaxWidth()
                .height(90.dp)
                .padding(top = 10.dp, bottom = 10.dp)
                .background(Color(0XFFF6EDFF)),
            verticalAlignment = Alignment.CenterVertically

        ){
            Image(
                painter = painterResource(id = R.drawable.ic_attachment),
                contentDescription = null,
                modifier = Modifier
                    .size(45.dp)
                    .padding(top = 10.dp, start = 10.dp)
                    .clip(CircleShape)
                    .background(colorResource(id = R.color.teal_200)),
                alignment = Alignment.TopStart,

            )
            Column {
                Text(
                    text = "Buat Tautan Panggilan",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                )
                Text(
                    text = "Bagikan Tautan untuk panggilan Anda",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(start = 20.dp)
                )
            }

        }
        Row() {
            Text(
                text = "Terbaru",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 15.sp,
                modifier = Modifier.padding(15.dp)
            )
        }
        Row (
            modifier = Modifier
                .clickable { }
                .fillMaxWidth()
                .padding(5.dp)
                .background(Color(0XFFF6EDFF))

        ){
            Image(
                painter = painterResource(id = R.drawable.img_image4),
                contentDescription = null,
                modifier = Modifier
                    .size(44.dp)
                    .padding(top = 10.dp, start = 10.dp),
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
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_arrow_),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp)
                            .padding(3.dp),
                        tint = Color.Green
                    )
                    Text(
                        text = "22 Februari 19.23",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 2.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.ic_call_24),
                contentDescription = "Call Icon",
                modifier = Modifier
                    .size(35.dp)
                    .padding(top = 18.dp, end = 18.dp),
                tint = Color.Green
            )

        }
        Row (
            modifier = Modifier
                .clickable { }
                .fillMaxWidth()
                .padding(5.dp)
                .background(Color(0XFFF6EDFF))

        ){
            Image(
                painter = painterResource(id = R.drawable.img_image3),
                contentDescription = null,
                modifier = Modifier
                    .size(44.dp)
                    .padding(top = 10.dp, start = 10.dp),
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
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_arrow_),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp)
                            .padding(3.dp),
                        tint = Color.Green
                    )
                    Text(
                        text = "22 Februari 17.23",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 2.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.ic_call_24),
                contentDescription = "Call Icon",
                modifier = Modifier
                    .size(35.dp)
                    .padding(top = 18.dp, end = 18.dp),
                tint = Color.Green
            )

        }
        Row (
            modifier = Modifier
                .clickable { }
                .fillMaxWidth()
                .padding(5.dp)
                .background(Color(0XFFF6EDFF))

        ){
            Image(
                painter = painterResource(id = R.drawable.img_image5),
                contentDescription = null,
                modifier = Modifier
                    .size(44.dp)
                    .padding(top = 10.dp, start = 10.dp),
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
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_arrow_),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp)
                            .padding(3.dp),
                        tint = Color.Green
                    )
                    Text(
                        text = "20 Februari 12.00",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 2.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.ic_call_24),
                contentDescription = "Call Icon",
                modifier = Modifier
                    .size(35.dp)
                    .padding(top = 18.dp, end = 18.dp),
                tint = Color.Green
            )

        }
        Row (
            modifier = Modifier
                .clickable { }
                .fillMaxWidth()
                .padding(5.dp)
                .background(Color(0XFFF6EDFF))

        ){
            Image(
                painter = painterResource(id = R.drawable.img_image7),
                contentDescription = null,
                modifier = Modifier
                    .size(44.dp)
                    .padding(top = 10.dp, start = 10.dp),
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
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_arrow_),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp)
                            .padding(3.dp),
                        tint = Color.Green
                    )
                    Text(
                        text = "18 Februari 07.23",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 2.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.ic_call_24),
                contentDescription = "Call Icon",
                modifier = Modifier
                    .size(35.dp)
                    .padding(top = 18.dp, end = 18.dp),
                tint = Color.Green
            )

        }
        Row (
            modifier = Modifier
                .clickable { }
                .fillMaxWidth()
                .padding(5.dp)
                .background(Color(0XFFF6EDFF))

        ){
            Image(
                painter = painterResource(id = R.drawable.img_image1),
                contentDescription = null,
                modifier = Modifier
                    .size(44.dp)
                    .padding(top = 10.dp, start = 10.dp),
                alignment = Alignment.TopStart
            )

            Column {
                Text(
                    text = "Michael J.Ramli",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 5.dp, start = 20.dp)
                )
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_arrow_),
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp)
                            .padding(3.dp),
                        tint = Color.Green
                    )
                    Text(
                        text = "15 Februari 17.23",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 2.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.ic_call_24),
                contentDescription = "Call Icon",
                modifier = Modifier
                    .size(35.dp)
                    .padding(top = 18.dp, end = 18.dp),
                tint = Color.Green
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CallScreenPreview() {
    PAMAcitivityIntentTheme {
        CallScreen()
    }
}