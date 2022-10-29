# shopping-list
## Overview
A simple mobile app I wrote to learn about... well, about writing mobile apps. It is an area about which I have no experience, so it was very interesting to get into the subject. 

This app acts a shopping list: it allows the user to add items to a list, shows them the list, and then allows the user to mark off or remove items.
This is essentially what I was doing on paper before the epoch of this app, so that's really all the functionality you need.

I created this app to solve a real problem. I can never remember what I need to buy at the store, and I keep forgetting my paper lists at home.
However, I am extremely unlikely to leave my phone behind, so it is like a list I can use everywhere. Plus, think of the environmental impact of this app.
I've probably saved like 3 trees from being made into paper for me to make lists out of. Those 3 trees could make all the difference.

Check out my demo of the software below:
[//]: <> Need to upload and link video here  
[Software Demo Video](http://youtube.link.goes.here)

## Development Environment

This app was written in Android Studio Dolphin.
I used Android Studio's built-in XML design tools to come up with the app's structure, and the built-in Kotlin tools to work on the functionality.
My VCS for this project was Git.

Kotlin is a language I'd never used before. According to the [official Kotlin website](https://kotlinlang.org/): Kotlin is 
"A modern programming language that makes developers happier." I can't say that I experienced a greater degree of happiness myself, but
I've never built a mobile app with any other language, so I don't have a comparison to make.
Kotlin is a language built off of Java, another programming language. You'd be surprised to learn how much of that kind of thing is going on:
Python is apparently built from C. Anyway, Kotlin is designed in such a way as to make writing bad (e.g. unsafe or inefficient) software difficult.
In that respect, it is like Rust: Both languages require you to explicitly state a variable as mutable, for example. This protects you from having
a situation where a variable that shouldn't be changing is changing, and also forces you to be more concious about the way you write code.

## Useful Websites

* [Kodeco.com (taught me about RecyclerViews](https://www.kodeco.com/1560485-android-recyclerview-tutorial-with-kotlin)
* [a medium.com post (also taught me about RecyclerViews)](https://medium.com/android-news/using-recyclerview-in-android-kotlin-722991e86bf3)
* [official Android documentation for checkboxes (it never hurts to look up the official docs)](https://developer.android.com/develop/ui/views/components/checkbox#kotlin)
* [StackOverflow (a post about RecyclerViews)](https://stackoverflow.com/questions/31367599/how-to-update-recyclerview-adapter-data)
* [Some styling information on StackOverflow](https://stackoverflow.com/questions/7238450/set-edittext-cursor-color)
* [Youtube video about RecyclerViews](https://www.youtube.com/watch?v=FA5cGLLiSWs)

###### You might have noticed RecyclerViews as a common theme. This is because Recycler views are confusing and I needed lots of help.

## Future Work

* Fix the bug I found in the software demo (all items forget their checked status when you delete one of them)
* The list didn't really expand and contract the way I wanted, and it would have taken too much research to find out why. I didn't have time. I can fix this later.
* Make it look nicer (add some animations)
* add item memory, suggesting items as you type (probably with a firestore database)
* add list templates, allowing you to add all your basics at once
