package com.diegocastro.ejemplomvvmretrofitroom

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Esta clase extiende directo de aplication va a ser la primera en llamarse cuando la app inicie

@HiltAndroidApp
class MvvmExampleApp :Application()