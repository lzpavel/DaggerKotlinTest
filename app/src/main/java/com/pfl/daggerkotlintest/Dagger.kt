package com.pfl.frameworks

import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class])
interface AppComponent {
    //fun person(): Person
    val person: Person
}

@Module
object AppModule {
    @Provides
    fun providePerson(
        name: Name,
        age: Age
    ): Person {
        return Person(
            name = name,
            age = age
        )
    }

    @Provides
    fun provideName(): Name {
        return Name()
    }

    @Provides
    fun provideAge(): Age {
        return Age()
    }
}