package com.example.myfavoritebooksiguess

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myfavoritebooksiguess.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), FavoriteBookClickListenerClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(bookList, mainActivity)
        }
    }

    override fun onClick(myBooks: Books) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(BOOK_ID_DETAILS, myBooks.id)
        startActivity(intent)
    }


    private fun populateBooks() {
        val book1 = Books(
            R.drawable.blackstar,
            "Kermit The Frog",
            "Before You Leap",
            "An autoBiography about kermit himself."
        )
        bookList.add(book1)

        val book2 = Books(
            R.drawable.solo_leveling,
            "Gare Thompson",
            "Who Was Eleanor Roosevelt?",
            "A biography detailing the life of who Eleanor was."
        )
        bookList.add(book2)

        val book3 = Books(
            R.drawable.konosuba,
            "Malcolm Gladwell",
            "Blink",
            "The power of thinking without thinking"
        )
        bookList.add(book3)

        val book4 = Books(
            R.drawable.ragnarok,
            "Carlene Havel and Sharon Faucheux",
            "Daughter of The King",
            "A Biblical/Romance novel."
        )
        bookList.add(book4)

        val book5 = Books(
            R.drawable.shadow,
            "Anna Rosling, Hans Rosling, and Ola Rosling",
            "Factfulness",
            "Ten reasons we are wrong about the world."
        )
        bookList.add(book5)


        val book6 = Books(
            R.drawable.borderland,
            "Beatriz Williams",
            "The Golden Hour",
            "a historical fiction novel about alternate time lines."
        )
        bookList.add(book6)

        val book7 = Books(
            R.drawable.kill,
            "Scottie Pippen",
            "Unguarded",
            "A memoir about a six time NBA champion."
        )
        bookList.add(book7)

        val book8 = Books(
            R.drawable.kaisen,
            "Darby Kane",
            "The Replacement Wife",
            "a suspense novel that asks how many wives and girlfriends should dissappear before anyone notices."
        )
        bookList.add(book8)

        val book9= Books(
            R.drawable.overlord,
            "Diane Macedo",
            "The Sleep Fix",
            "a novel that offers reasearch and advice."
        )
        bookList.add(book9)

        val book10= Books(
            R.drawable.returnersmagic,
            "Chris Dixon and Jeremy K. Spencer",
            "The Ocean",
            "a handbook of treasure trove information."
        )
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book10)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)
        bookList.add(book1)

    }


}