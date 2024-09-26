(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  "Since nil and false return false in clojure,
   a simple if statement evaluating the parameter
   x will return the true or false needed to re-
   implement the boolean function."
  [x]
  (if x true false))


(defn abs [x]
  "Returns the absolute value of x by checking if it
  is less than zero. If it is less than zero, it returns
  (* -1 x), if it isn't, it returns x."
  (if (< x 0)
    (* -1 x)
    x))

(defn divides?
  "Returns true if divisor divides n and false otherwise."
  [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz
  "Infamous fizzbuzz implementation done in Clojure."
  [n]
  (cond
    (divides? 3 n)
    (if
      (divides? 5 n) "gotcha!" "fizz")
    (divides? 5 n)
    (if
      (divides? 3 n) "gotcha!" "buzz")
    :else ""))

(defn teen?
  "Simple age comparator, indicating if
   age parameter is a teen or not."
  [age]
  (< 12 age 20))


(defn not-teen?
  "Age comparator, indicating if age is not a
  teen."
  [age]
  (not (teen? age)))

(defn generic-doublificate
  "Takes one argument x and doubles it if it is a number,
  returns nil if it is an empty collection, returns two times the
  length if it is a vector or list, or returns true otherwise."
  [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))


(defn leap-year?
  "Utilizes a basic algorithm to determine if the entered year
  is a leap year or not."
  [year]
  (cond
    (divides? 4 year)
    (if (divides? 100 year)
      (if (divides? 400 year)
        true
        false)
      true)
    :else false))


; '_______'
