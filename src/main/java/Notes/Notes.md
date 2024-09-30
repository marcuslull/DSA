
# Lessons learned
___

## Efficiency
* Try to do as much as possible in a single pass
  * Add to the data structure, compute, check, etc...
* Look for a data structure that will be the most useful
* Play around with the ordering of tasks on each iteration
  * put() > compute > check > vs. compute > check > put() etc...
* Look for opportunities to use a greedy approach
* Try to while loop on !null if possible, this makes internal if/else much easier to manage
  * return null at the end of algo to terminate the loop
* `while()` for unknown number of loops, `for()` for known number of loops
* Some array problems are best handled by iterating backwards 'like running total' type issues
* Make decision trees to clearly illustrate repeated logic
* Look for dynamic programming options where you can more efficiently build upon previous results, leveraging patterns
* Unmatched numbers can be found by cancelling the like numbers out. XOR `^` is great for this.
* Handle easy wins or edge cases right off the bat
* Modulo and integer division can be handy in so many places 
* When parsing arrays sometimes you can break them into a prefix array and a postfix array
  * prefix being everything before the target index. postfix being everything after.

## Bitwise
* Binary has patterns try to use them when solving binary problems
* Bitwise shift `n << 1` or `n >> 1` great for multiplying by two or dividing by 2 (integer division) faster the math operators
* Bitwise XOR `n ^= m` can be used to create a running bitwise sum
  * `n ^ n = 0`, `n ^ m = x` so like numbers equal zero, or cancel out.
  * Kind of like adding then subtracting to find the unmatched number without having to know if this is the number to add or subtract

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
* When comparing strings, sorting them can allow you to compare easier.
* `.toCharArray()` will get a string to a char[] where it can be sorted with `Arrays.sort()`. Put it back in a string with `new String(char[])` then compare with `.equals()`
* Learn `java.lang.String` - way too many useful methods there!

## Arrays
Java.Util.Arrays class has lots of useful methods that are all available in leetCode.
* `List<T> Arrays.asList(T)`
* `int Arrays.binarySearch(T[], target)`
* `T[] Arrays.copyOf(original[], length)`
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
* `Math.min(i, j)` or `Math.max(i, j)`
* `Math.pow(num, exp)`
* `Math.sqrt(num)`
* `Math.cbrt(num)`
* `...`

## Stream
`java.util.stream.Stream` and `java.util.stream.Collectors` 
Learn the processing methods of the Stream interface and the accumulators of the Collectors class


## Two Pointers / Sliding window
Use these algorithms for:
* finding the middle of linked data structures
* detecting loops in linked data structures
* walking through arrays or linked data structures and comparing

## Fibonacci
* Fib is previous + current = next
* Trib is previousPrevious + previous + current = next
* The vars needed in each case up to and including the for loop `i` will initialize as the fib sequence (0, 1, 1, 2, ...)

## Trees
### Binary Tree
#### Search
* Super easy algo, while loop on !null, if match return, use ternary for moving R or L

#### In Order Traversal
* left, node, right

#### Depth First
* Recursive structure of DFS: Null case > dive operations > recurse > surface operations
* Great for getting/comparing leaves - DFS + add the nodes with no children to a list.
* Use DFS to determine the maximum depth
  * `counter++` while diving (before recursive calls), save if deeper than what has been seen already
  * `counter--` while surfacing (after recursive calls)

### Non-Binary
Put the children in an array, then for each child, recursive call.


