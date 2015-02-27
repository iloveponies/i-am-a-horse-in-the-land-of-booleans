nREPL server started on port 54408 on host 127.0.0.1 - nrepl://127.0.0.1:54408
REPL-y 0.3.5, nREPL 0.2.6
Clojure 1.5.1
OpenJDK 64-Bit Server VM 1.7.0_75-b13
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)
 Results: Stored in vars *1, *2, *3, an exception in *e

user=> use ('i-am-a-horse-in-the-land-of-booleans)
use ('i-am-a-horse-in-the-land-of-booleans)
#<core$use clojure.core$use@30e72b6c>

user=> ArityException Wrong number of args (0) passed to: Symbol  clojure.lang.AFn.throwArity (AFn.java:437)



user=> (use 'i-am-a-horse-in-the-land-of-booleans)
(use 'i-am-a-horse-in-the-land-of-booleans)
WARNING: boolean already refers to: #'clojure.core/boolean in namespace: user, being replaced by: #'i-am-a-horse-in-the-land-of-booleans/boolean
nil
user=> (boolean x)
(boolean x)

CompilerException java.lang.RuntimeException: Unable to resolve symbol: x in this context, compiling:(/tmp/form-init1091652384068495166.clj:1:1) 
user=> (boolean "x")
(boolean "x")
true
user=> (boolean "mies")
(boolean "mies")
true
user=> (boolean "false")
(boolean "false")
true
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (teen? 15)
(teen? 15)
false
user=> (teen? 13()
(teen? 13()
  #_=> (teen? 13();
(teen? 13();
  #_=> 

  #_=> :
:
  #_=> 

  #_=> 

  #_=> ;
;
  #_=> (teen? 13)
(teen? 13)

RuntimeException Invalid token: :  clojure.lang.Util.runtimeException (Util.java:219)
user=> (teen? 13)
(teen? 13)
falsefalse
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (teen? 15)
(teen? 15)
true
user=> (teen? 11)
(teen? 11)
false
user=> (teen? 18)
(teen? 18)
true
user=> (teen? 12)
(teen? 12)
false
user=> (teen? 13)
(teen? 13)
true
user=> (teen? 14)
(teen? 14)
true
user=> (teen? 19)
(teen? 19)
true
user=> (teen? 20)
(teen? 20)
true
user=> (teen? 14)
(teen? 14)
true
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (teen? 20)
(teen? 20)
false
user=> (teen? 19)
(teen? 19)
true
user=> (teen? 12)
(teen? 12)
false
user=> (teen? 13)
(teen? 13)
true
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)

CompilerException java.lang.RuntimeException: Unable to resolve symbol: -x in this context, compiling:(i_am_a_horse_in_the_land_of_booleans.clj:8:3) 
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (abs 13)
(abs 13)
13
user=> (abs -2)
(abs -2)
2
user=> (abs -2)
(abs -2)
2
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: if in this context, compiling:(i_am_a_horse_in_the_land_of_booleans.clj:10:1) 

user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)

CompilerException java.lang.RuntimeException: Too few arguments to if, compiling:(i_am_a_horse_in_the_land_of_booleans.clj:11:3) 
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (divides? 10 5)
(divides? 10 5)
false
user=> (divides? 5 10)
(divides? 5 10)
false
user=> (divides? 2 4)
(divides? 2 4)
false
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)

CompilerException java.lang.RuntimeException: Too few arguments to if, compiling:(i_am_a_horse_in_the_land_of_booleans.clj:11:3) 
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (divides? 2 4)
(divides? 2 4)
0
user=> (divides? 4 4)
(divides? 4 4)
0
user=> (divides? 5 4)
(divides? 5 4)
4
user=> (divides? 3 2)
(divides? 3 2)
2
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (divides? 3 2)
(divides? 3 2)
1
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)

CompilerException java.lang.RuntimeException: Unable to resolve symbol: if in this context, compiling:(i_am_a_horse_in_the_land_of_booleans.clj:10:1) 
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (divides? 3 2)
(divides? 3 2)
true
user=> (divides? 1 2)
(divides? 1 2)
true
user=> (divides? 1 1)
(divides? 1 1)
true
user=> (divides? 0 1)
(divides? 0 1)
true
user=> (divides? 0 0)
(divides? 0 0)

ArithmeticException Divide by zero  clojure.lang.Numbers.remainder (Numbers.java:170)
user=> (divides? 1 0)
(divides? 1 0)

ArithmeticException Divide by zero  clojure.lang.Numbers.remainder (Numbers.java:170)
user=> (divides? 1 2)
(divides? 1 2)
true
user=> (divides? 2 3)
(divides? 2 3)
true
user=> (divides? 4 2)
(divides? 4 2)
true
user=> (mod 4 2)
(mod 4 2)
0
user=> (mod 4 2)
(mod 4 2)
0
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (mod 4 2)
(mod 4 2)
0
user=> (divides? 4 2)
(divides? 4 2)
true
user=> (divides? 2 4)
(divides? 2 4)
true
user=> (mod 4 2)
(mod 4 2)
0
user=> (mod 2 4)
(mod 2 4)
2
user=> (mod 10 5)
(mod 10 5)
0
user=> (if 0 10 5)
(if 0 10 5)
10
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (divides? 4 2)
(divides? 4 2)
true
user=> (divides? 2 4)
(divides? 2 4)
false
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (divides? 2 4)
(divides? 2 4)
true
user=> (divides? 4 4)
(divides? 4 4)
false
user=> (divides? 1 4)
(divides? 1 4)
true
user=> (divides? 6 4)
(divides? 6 4)
true
user=> (divides? 6 4)
(divides? 6 4)
true
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)

CompilerException java.lang.RuntimeException: EOF while reading, starting at line 10, compiling:(i_am_a_horse_in_the_land_of_booleans.clj:29:1) 
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)

CompilerException java.lang.RuntimeException: Too few arguments to if, compiling:(i_am_a_horse_in_the_land_of_booleans.clj:11:3) 
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (divides? 6 4)
(divides? 6 4)
false
user=> (divides? 1 4)
(divides? 1 4)
true
user=> (divides? 2 4)
(divides? 2 4)
true
user=> (divides? 2 4)
(divides? 2 4)
true
user=> (divides? 4 2)
(divides? 4 2)
false
user=> (divides? 5 10)
(divides? 5 10)
true
user=> (divides? 2 5)
(divides? 2 5)
false
user=> (divides? 3 6)
(divides? 3 6)
true
user=> (divides? 3 7)
(divides? 3 7)
false
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)

CompilerException java.lang.RuntimeException: Can't take value of a macro: #'clojure.core/cond, compiling:(i_am_a_horse_in_the_land_of_booleans.clj:13:1) 
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (fizzbuzz 2)
(fizzbuzz 2)
""
user=> (fizzbuzz 45)
(fizzbuzz 45)
"fizz"
user=> (fizzbuzz 48)
(fizzbuzz 48)
"fizz"
user=> (fizzbuzz 70)
(fizzbuzz 70)
"buzz"
user=> (fizzbuzz 45)
(fizzbuzz 45)
"fizz"
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (fizzbuzz 45)
(fizzbuzz 45)
"gotcha!"
user=> (fizzbuzz 48)
(fizzbuzz 48)
"fizz"
user=> (fizzbuzz 70)
(fizzbuzz 70)
"buzz"
user=> (fizzbuzz 2)
(fizzbuzz 2)
""
user=> (or true false)
(or true false)
true
user=> (or false false)(or false false)

false
user=> (or false true)
(or false true)
true
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)

CompilerException java.lang.RuntimeException: EOF while reading, starting at line 27, compiling:(i_am_a_horse_in_the_land_of_booleans.clj:38:1) 
user=> (use 'i-am-a-horse-in-the-land-of-booleans :reload)
(use 'i-am-a-horse-in-the-land-of-booleans :reload)
nil
user=> (generic-doublificate 1)
(generic-doublificate 1)
2
user=> (generic-doublificate [1 2])
(generic-doublificate [1 2])
4
user=> (generic-doublificate )
(generic-doublificate )

ArityException Wrong number of args (0) passed to: i-am-a-horse-in-the-land-of-booleans$generic-doublificate  clojure.lang.AFn.throwArity (AFn.java:437)
user=> (generic-doublificate '(65 21))
(generic-doublificate '(65 21))
4
user=> (generic-doublificate {}])
(generic-doublificate {}])
RuntimeException Unmatched delimiter: ]  clojure.lang.Util.runtimeException (Util.java:219)
RuntimeException Unmatched delimiter: )  clojure.lang.Util.runtimeException (Util.java:219)

user=> (generic-doublificate {})
(generic-doublificate {})
nil
user=> (generic-doublificate [])
(generic-doublificate [])
nil
user=> (generic-doublificate {:a 1})
(generic-doublificate {:a 1})
true
user=> (and "foo" "bar")
(and "foo" "bar")
"bar"
user=> (and "foo" "bar")
(and "foo" "bar")
"bar"
user=> (and false "bar")
(and false "bar")
false
user=> (and true "bar")
(and true "bar")
"bar"
user=> (and "bar" true)