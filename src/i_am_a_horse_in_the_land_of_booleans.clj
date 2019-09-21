(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false)
  )

(defn fizzbuzz [n]
  (cond
   (==(mod n 15) 0) "gotcha!"
   (==(mod n 3)  0) "fizz"
   (==(mod n 5)  0) "buzz"
   :else          ""))

(defn teen? [age]
  (if (< 12 age 20)
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x)                (* 2 x)
   (empty?  x)                nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else                      true
  ))

(defn leap-year? [year]
  (cond
   (not= (mod year 4)   0) false
   (not= (mod year 100) 0) true
   (not= (mod year 400) 0) false
   :else                true))

; '_______'

;;test area

(teen? 20)

(abs 4)

(fizzbuzz 3)

(generic-doublificate 3)

(leap-year? 1913)
