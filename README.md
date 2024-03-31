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



