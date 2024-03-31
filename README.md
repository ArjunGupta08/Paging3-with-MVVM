# Simple Pagination
You can implement simple pagination with simple recycler view adapter as i implement that in my previous repository, you can see that (Here)[https://github.com/ArjunGupta08/Pagination-Android-Java]

# Paging 3
Now if you want to implement pagination with advance customizations than you have to implement Paging 3 Library.

Pagination improves performance of the app by creating only required objects. Recycler view recycles view whereas pagination library creates only the required objects in the memory. Paging 3 Jetpack Component provides support to implement paging in Android. We have implemented it using HILT and MVVM Architecture Pattern.

We will be calling an API that supports pagination and use it to implement infinite Scroll in Android. 

` USED API ` - https://quotable.io/

We need 3 classes to setup the pagination.
 - Paging Source
   - Paging Source defines the way to load data from network i.e. API.
 - Pager (Repository)
   - Once you have paging source setup - you can define a pager object that is used to define the configuration such as pageSize, maxSize.
 - Pageing Adapter
   - Paging Adapter is used to show this paging data inside recyclerview.

# Loader Implementation
For Loading state, we have a special ` LoadStateAdapter ` that helps in showing loader in ` Header ` and ` Footer `. We have concat adapter functionality on Paging Adapter that can use this Load State Adapter. We can show this loader with different methods - 
  - withLoadStateHeaderAndFooter,
  - withLoadStateHeader,
  - withLoadStateFooter. 
We can show different UI for header and footer inside paging3 loader implementation. For that we need to create different LoadStateAdapter that will manage the loader implementation in Paging 3 Android. 
https://youtu.be/Mkh1cd-OAMY?si=A0uxcRGQfSiReaWL
