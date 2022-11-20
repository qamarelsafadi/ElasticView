package com.qamar.elasticview

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ElasticView(modifier: Modifier? = Modifier,
                onClick: () -> Unit,
                content: @Composable BoxScope.() -> Unit) {
    Box(
        modifier = modifier!!.elasticEffect { onClick() },
        contentAlignment = Alignment.Center
    )
    {
        content()
    }
}