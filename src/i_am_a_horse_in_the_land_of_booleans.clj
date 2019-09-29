(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [value]
  (if value true false))

(defn sign [x]
  (if (< x 0)
    "-"
    "+"))

(defn abs [n]
  "Returns the absolute value of a number"
  (if (= "+" (sign n)) n (* -1 n))
  )

(defn divides? [divisor n]
  "Returns true if divisor divides n and false otherwise"
  (if (= 0 (mod n divisor)) true false)
  )

(defn fizzbuzz [n]
  "Returns * fizz when n is divisible by 3. * 'buzz' when n is divisible by 5. * 'gotcha!' when n is divisible by 15. * the empty string '' otherwise"
  (cond
   (and (divides? 3 n) (divides? 5 n)) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""
   )
  )

(defn teen? [age]
  (<= 13 age 19)
  )

(defn not-teen? [age]
  (not (teen? age))
  )

(defn generic-doublificate [x]
  "number => number * 2. empty collection => nil. List | Vector => length * 2. Else returns true"
  (cond
   (number? x) (* x 2)
   (= (count x) 0) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true
   ))

(defn leap-year? [year]
  (if (divides? 4 year) (if (divides? 100 year) (if (divides? 400 year) true false) true) false)
  )

; '_______'
