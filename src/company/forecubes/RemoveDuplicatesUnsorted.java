package company.forecubes;

/**
 * https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/
 * 
 * 
 * Remove duplicates from an unsorted linked list
 * @author Acer
 *	12->11->12->21->41->43->21
 *	12->11->21->41->43.
 *
 *	METHOD 1 (Using two loops)
This is the simple way where two loops are used. Outer loop is used to pick the elements one by one and inner loop compares the picked element with rest of the elements. 
Time Complexity: O(n^2) 
 *
 *
 *METHOD 2 (Use Sorting)
In general, Merge Sort is the best suited sorting algorithm for sorting linked lists efficiently.
1) Sort the elements using Merge Sort. We will soon be writing a post about sorting a linked list. O(nLogn)
2) Remove duplicates in linear time using the algorithm for removing duplicates in sorted Linked List. O(n)

Please note that this method doesn’t preserve the original order of elements.

Time Complexity: O(nLogn)



METHOD 3 (Use Hashing)
We traverse the link list from head to end. For every newly encountered element, we check whether it is in the hash table: if yes, we remove it; otherwise we put it in the hash table.
Time Complexity: O(n) on average (assuming that hash table access time is O(1) on average). 

*/

public class RemoveDuplicatesUnsorted {

}
