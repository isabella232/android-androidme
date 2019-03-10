/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.androidme

import android.app.Application
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import androidx.lifecycle.AndroidViewModel

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val TAG = MainViewModel::class.java.name

    private val loadingImage = BitmapDrawable(
        application.resources,
        BitmapFactory.decodeResource(application.resources, R.drawable.android_you))

    private val startingImage = BitmapDrawable(
        application.resources,
        BitmapFactory.decodeResource(application.resources, R.drawable.android_me))

    var androidImageDrawable: BitmapDrawable

    init {
        androidImageDrawable = startingImage
    }

    fun processAndSetImage() {
        androidImageDrawable = loadingImage
    }
}
