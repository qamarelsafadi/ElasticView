package com.qamar.elasticview

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ElasticView(modifier: Modifier? = Modifier, content: @Composable BoxScope.() -> Unit) {
    Box(modifier = modifier!!.elasticEffect()) {
        content()
    }
}