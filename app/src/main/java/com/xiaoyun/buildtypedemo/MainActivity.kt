package com.xiaoyun.buildtypedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initTest()
    }

    private fun initTest() {
        val versionName = packageManager.getPackageInfo(packageName, 0).versionName
        val versionCode =packageManager.getPackageInfo(packageName, 0).longVersionCode
        val googleMapKey = BuildConfig.GOOGLE_MAP_API_KEY
        val googleElevationKey = BuildConfig.GOOGLE_ELEVATION_KEY
        Log.d("loggg-VersionCode", "$versionCode")
        Log.d("loggg-VersionName", versionName)
        Log.d("loggg-GoogleMapKey", googleMapKey)
        Log.d("loggg-GoogleElevationKey", googleElevationKey)
    }
}