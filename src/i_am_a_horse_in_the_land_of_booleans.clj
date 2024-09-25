(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
  )

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
 (cond 
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? [age]
  (and (< age 20) (> age 12)))

(defn not-teen? [age]
 (not (teen? age))) 

(defn generic-doublificate [x]
  (cond 
    (number? x) (* x 2)
    (coll? x) (cond 
                (empty? x) nil
                (or (list? x) (vector? x)) (* 2 (count x))
                :else true)
     :else true
      ))

(defn leap-year? [year]
  (or (and (not (< 0 (mod year 4))) (not (= 0 (mod year 100)))) (not (< 0 (mod year 400))))
  )

; '_______'
