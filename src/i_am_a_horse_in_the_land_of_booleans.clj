(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or
       (false? x)
       (nil? x))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n)  "buzz"
   (divides? 3 n)  "fizz"
   :else            ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (or
   (not
     (and
      (>= age 13)
      (<= age 19)))
   false))

(defn generic-doublificate [x]
  (cond
   (number? x)    (* x 2)
   (empty? x)     nil
   (list? x)      (* (count x) 2)
   (vector? x)    (* (count x) 2)
   :else          true))

(defn leap-year? [year]
  (cond
   (== (mod year 400) 0)  true
   (== (mod year 100) 0)  false
   (== (mod year 4)   0)  true
   :else                  false
   ))

; '_______'
