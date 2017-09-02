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

(defn fizzbuzz [n]
  (cond
    (divides? 3 n)
    (if
      (divides? 5 n) "gotchya!" "fizz")
    (divides? 5 n)
    (if
      (divides? 3 n) "gotchya!" "buzz")
    :else ""))

(defn teen?
  "Simple age comparator, indicating if
   age parameter is a teen or not."
  [age]
  (< 12 age 20))


(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
