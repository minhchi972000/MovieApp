package com.example.firebasekotlin.data.database


import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.firebasekotlin.app
import com.example.firebasekotlin.data.database.movie.MovieDBO

@Database(entities = [MovieDBO::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDBO.DAO
}

val roomDB by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
    Room.databaseBuilder(app, AppDatabase::class.java, "movie_database")
        .allowMainThreadQueries()
        .build()
}
