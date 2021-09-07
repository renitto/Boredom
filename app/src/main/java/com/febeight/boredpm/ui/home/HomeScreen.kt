package com.febeight.boredpm.ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.febeight.boredpm.model.response.BoredomResponse

@Composable
fun HomeScreen() {
    val viewModel: HomeScreenViewModel = HomeScreenViewModel()
    val boredomthought = viewModel.boredomState.value
    BoredomCard(boredomthought = boredomthought)
}

@Composable
fun BoredomCard(boredomthought: BoredomResponse) {
    Card(
        shape = RoundedCornerShape(10),
//        backgroundColor = Color.Magenta,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
    )

    {
        Surface(
            modifier = Modifier.wrapContentSize(
                align = Alignment.Center
            )
        ) {
            Text(
                text = boredomthought.activity,
//                text = "\" Hello \"",
                modifier = Modifier.padding(all = 10.dp),
                style = MaterialTheme.typography.h4
            )
        }

    }
}