(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean 
  "Check if the item is true or false (Should this really be this simple...)"
  [x]
  (if x true false))

(defn abs 
  "Return absolute value of x"
  [x]
  (if (>= x 0)
      x
      ( * -1 x)
  ))

(defn divides? 
  "If divisor divides n then true, otherwise false"
  [divisor n]
  (if (== 0 (mod n divisor))
      true
      false
  ))


(defn fizzbuzz [n]
  "Traditional fizzbuzz quiz! The easy version"
  (cond 
    (divides? 15 n) "gotcha!"
    (divides? 3 n)  "fizz"
    (divides? 5 n)  "buzz"
    :else ""
    ))


(defn teen? 
  [age]
  "Is the argument a teenager"
  (< 12 age 20))

(defn not-teen? [age]
  (if (not (teen? age)) true false))

(defn generic-doublificate 
  "Duplicate set of different stuff"
  [x]
  (cond 
    (number? x ) ( * 2 x )
    (empty? x ) nil
    (list? x ) ( * 2 ( count x ))
    (vector? x ) ( * 2 ( count x ))
    :else true
    ))

(defn leap-year? 
  "Returns true, if it is a leap year, otherwise false"
  [year]
  (cond 
    (divides? 400 year) true
    (and (divides? 4 year) (not (divides? 100 year))) true
    :else false
    ))

; '_______'
