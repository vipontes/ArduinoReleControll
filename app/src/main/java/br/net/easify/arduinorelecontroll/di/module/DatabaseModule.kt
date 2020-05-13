package br.net.easify.arduinorelecontroll.di.module

import android.app.Application
import br.net.easify.arduinorelecontroll.database.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule() {

    @Singleton
    @Provides
    fun providesAppDatabase(application: Application): AppDatabase {
        return AppDatabase.getAppDataBase(application)
    }

}