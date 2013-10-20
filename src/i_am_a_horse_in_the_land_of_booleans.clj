(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if  (= (not(= x false)) (= x nil)) false true))

(defn abs [x]
  (if (< x 0) (+ x(* -2 x )) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 5) 0) "buzz"
   (= (mod n 3) 0) "fizz"
   :else ""))

(defn teen? [age]
  (if (= (>= age 13) (<= age 19)) true false ))

(defn not-teen? [age]
  (if(not(teen? age)) true false
    )
  )

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true
   )
  )

(defn leap-year? [year]
  (cond
   (= (mod year 400) 0) true
   (= (mod year 100) 0) false
   (= (mod year 4) 0) true
   :else false
   ))


; '_______'


