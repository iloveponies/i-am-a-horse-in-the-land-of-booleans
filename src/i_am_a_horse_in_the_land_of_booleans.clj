 (ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn
  boolean
  "returns true or false depending if value is true or nil"
  [x]
  (if x true false))

(defn
  abs
  "returns abs of the given parameter"
  [x]
  (if (> x 0)
    x
    (* -1 x)))

(defn
  divides?
  "returns wether number divides so mod is 0"
  [divisor n]
  (if (> (mod n divisor) 0)
    false
    true))

(defn
  fizzbuzz
  "returns value depending on parameter like switch case"
  [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn
  teen?
  "returns boolean value wether age belongs to teen category"
  [age]
  (< 12 age 20))

(defn
  not-teen?
  "returns wether given age is not-teen"
  [age]
  (cond
   (teen? age) false
   (not (teen? age)) true))

(defn
  generic-doublificate
  "returns value depending on the parameter given through Clojure kind switch case"
  [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true))

(defn
  leap-year?
  "returns wether given parameter is leap-year or not"
  [year]
  (cond
   (and (divides? 4 year) (divides? 100 year) (divides? 400 year)) true
   (and (divides? 4 year) (not (divides? 100 year))) true
   :else false))

; '_______'
