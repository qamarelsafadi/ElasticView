package com.qamar.elasticview

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput

fun Modifier.elasticEffect() = composed {
    var buttonState by remember { mutableStateOf(ElasticState.None) }
    val scale by animateFloatAsState(if (buttonState == ElasticState.Pressed) 0.95f else 1f)
    this.graphicsLayer {
            scaleX = scale
            scaleY = scale
        }
        .pointerInput(buttonState) {
            awaitPointerEventScope {
                buttonState = if (buttonState == ElasticState.Pressed) {
                    waitForUpOrCancellation()
                    ElasticState.None
                } else {
                    awaitFirstDown(false)
                    ElasticState.Pressed
                }
            }
        }
}
