package com.example.lab4_2

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import name.ank.lab4.BibEntry
import name.ank.lab4.Keys

abstract class ViewHolder<T>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(entry: T)
}

class ArticleViewHolder(view: View) : ViewHolder<BibEntry>(view) {

    private val title: TextView = view.findViewById(R.id.title_article)
    private val author: TextView = view.findViewById(R.id.author_article)
    private val journal: TextView = view.findViewById(R.id.journal_article)
    private val year: TextView = view.findViewById(R.id.year_article)

    override fun bind(entry: BibEntry) {
        title.text = entry.getField(Keys.TITLE)
        author.text = entry.getField(Keys.AUTHOR)
        journal.text = entry.getField(Keys.JOURNAL)
        year.text = entry.getField(Keys.YEAR)
    }
}

class MiscViewHolder(view: View) : ViewHolder<BibEntry>(view) {
    private val title: TextView = view.findViewById(R.id.title_misc)
    private val author: TextView = view.findViewById(R.id.author_misc)
    private val booktitle: TextView = view.findViewById(R.id.booktitle_misc)
    private val year: TextView = view.findViewById(R.id.year_misc)

    override fun bind(entry: BibEntry) {
        title.text = entry.getField(Keys.TITLE)
        author.text = entry.getField(Keys.AUTHOR)
        booktitle.text = entry.getField(Keys.BOOKTITLE)
        year.text = entry.getField(Keys.YEAR)
    }
}

class IncollectionViewHolder(view: View) : ViewHolder<BibEntry>(view) {
    private val title: TextView = view.findViewById(R.id.title_incollection)
    private val author: TextView = view.findViewById(R.id.author_incollection)
    private val booktitle: TextView = view.findViewById(R.id.booktitle_incollection)
    private val year: TextView = view.findViewById(R.id.year_incollection)

    override fun bind(entry: BibEntry) {
        title.text = entry.getField(Keys.TITLE)
        author.text = entry.getField(Keys.AUTHOR)
        booktitle.text = entry.getField(Keys.BOOKTITLE)
        year.text = entry.getField(Keys.YEAR)
    }
}

class UnpublishedViewHolder(view: View) : ViewHolder<BibEntry>(view) {
    private val title: TextView = view.findViewById(R.id.title_unpublished)
    private val author: TextView = view.findViewById(R.id.author_unpublished)
    private val booktitle: TextView = view.findViewById(R.id.booktitle_unpublished)
    private val year: TextView = view.findViewById(R.id.year_unpublished)

    override fun bind(entry: BibEntry) {
        title.text = entry.getField(Keys.TITLE)
        author.text = entry.getField(Keys.AUTHOR)
        booktitle.text = entry.getField(Keys.BOOKTITLE)
        year.text = entry.getField(Keys.YEAR)
    }
}

class InproceedingsViewHolder(view: View) : ViewHolder<BibEntry>(view) {
    private val title: TextView = view.findViewById(R.id.title_inproceedings)
    private val author: TextView = view.findViewById(R.id.author_inproceedings)
    private val booktitle: TextView = view.findViewById(R.id.booktitle_inproceedings)
    private val year: TextView = view.findViewById(R.id.year_inproceedings)

    override fun bind(entry: BibEntry) {
        title.text = entry.getField(Keys.TITLE)
        author.text = entry.getField(Keys.AUTHOR)
        booktitle.text = entry.getField(Keys.BOOKTITLE)
        year.text = entry.getField(Keys.YEAR)
    }
}

class TechreportViewHolder(view: View) : ViewHolder<BibEntry>(view) {
    private val title: TextView = view.findViewById(R.id.title_techreport)
    private val author: TextView = view.findViewById(R.id.author_techreport)
    private val booktitle: TextView = view.findViewById(R.id.booktitle_techreport)
    private val year: TextView = view.findViewById(R.id.year_techreport)

    override fun bind(entry: BibEntry) {
        title.text = entry.getField(Keys.TITLE)
        author.text = entry.getField(Keys.AUTHOR)
        booktitle.text = entry.getField(Keys.BOOKTITLE)
        year.text = entry.getField(Keys.YEAR)
    }
}

class BookViewHolder(view: View) : ViewHolder<BibEntry>(view) {
    private val title: TextView = view.findViewById(R.id.title_book)
    private val author: TextView = view.findViewById(R.id.author_book)
    private val year: TextView = view.findViewById(R.id.year_book)

    override fun bind(entry: BibEntry) {
        title.text = entry.getField(Keys.TITLE)
        author.text = entry.getField(Keys.AUTHOR)
        year.text = entry.getField(Keys.YEAR)
    }
}
