package com.daftmobile.a4bhomework5

import android.support.annotation.ColorInt
import java.io.Serializable;


data class PokemonItem(val index: String, val name: String, @ColorInt val backgroundColor: Int):Serializable
