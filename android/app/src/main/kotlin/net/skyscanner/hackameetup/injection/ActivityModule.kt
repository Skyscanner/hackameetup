package net.skyscanner.hackameetup.injection

import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import net.skyscanner.hackameetup.core.injection.qualifier.ForActivity

@Module
class ActivityModule(
    private val activity: AppCompatActivity
) {

    @ForActivity
    @Provides
    fun provideContext(): Context = activity

    @Provides
    fun provideFragmentManager(activity: AppCompatActivity): FragmentManager =
        activity.supportFragmentManager
}
