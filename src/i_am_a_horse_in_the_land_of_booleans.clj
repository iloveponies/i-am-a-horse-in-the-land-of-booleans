(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or nil x) true false))

(defn abs [x]
  (if (< 0 x)  x (* -1 x)))

(defn divides? [divisor n]
  (if (==(mod n divisor) 0)true false))

(defn fizzbuzz [n]
  (if (divides? 15 n) "gotcha!" (if (divides? 5 n) "buzz" (if (divides? 3 n) "fizz" ""))))


(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (not (teen? age) ))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (*(count x) 2)
   :else true
   )
  )

(defn leap-year? [year]
  (cond
   (>(mod year 4) 0) false
   (>(mod year 100) 0) true
   (>(mod year 400) 0) false
   :else true
   )
  )

; '_______'

