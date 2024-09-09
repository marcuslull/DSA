
# Lessons learned
___

## Efficiency
* Try to do as much as possible in a single pass
  * Add to the data structure, compute, check, etc...
* Look for a data structure that will be the most useful
* Play around with the ordering of tasks on each iteration
  * put() > compute > check > vs. compute > check > put() etc...
* Look for opportunities to use a greedy approach

## Int
Max size of int is: `2,147,483,647` This is important to know when working with large numbers.
Also, it can be used as a bounds constraint to optimize code. If you know you have to return an int, you can design the algo to only work with numbers smaller than the maximum.

## Character
Java.lang.Character has some great methods for manipulation
* `Character.isDigit()`
* `Character.isLetter()`
* `Character.isLetterOrDigit()`
* `Character.toLowerCase()`
* `...`

## String
When comparing strings, sorting them can allow you to compare easier. `.toCharArray()` will get a string to a char[] where it can be sorted with `Arrays.sort()`. Put it back in a string with `new String(char[])` then compare with `.equals()`

## Arrays
Java.Util.Arrays class has lots of useful methods that are all available in leetCode.
* `List<T> Arrays.asList(T)`
* `int Arrays.binarySearch(T[], target)`
* `T[] Arrays.copyOf(T[], original[], length)`
* `Arrays.sort(T[])`
* `...`

When initializing an array it initializes to all zeros  
`int[] newArray = new int[4] // = [0,0,0,0]`

## Collections
* Important data structures `ArrayList`, `Deque<>`, `Set<>`, `HashMap<>`
* Try to commit important data structure methods to memory
* `List<> list = new ArrayList<>();` Typical list
* `Deque<?> deque = new LinkedList<>();` Combined Queue, Stack
* `Set<?> set = new HashSet<>();` Contain only unique values.
* `HashMap<?,?>` Use anytime you need a legend, tallying or mapping of key/value


## Math
Java.Lang.Math class has many useful methods that are highly optimized.
* `Math.pow(num, exp)`
* `Math.sqrt(num)`
* `Math.cbrt(num)`
* `...`

## Two Pointers / Sliding window
Use these algorithms for:
* finding the middle of linked data structures
* detecting loops in linked data structures
* walking through arrays or linked data structures and comparing

## Trees
### Binary Tree
**In order traversal** - Remember left, node, right. 

### Depth First
* Recursive structure of DFS: Null case > dive operations > recurse > surface operations
* Great for getting/comparing leaves - DFS + add the nodes with no children to a list.
* Use DFS to determine the maximum depth
  * `counter++` while diving (before recursive calls), save if deeper than what has been seen already
  * `counter--` while surfacing (after recursive calls)

#### Binary
Dive the left with a recursive call, then dive right. 

#### Non-Binary
Put the children in an array, then for each child, recursive call.


