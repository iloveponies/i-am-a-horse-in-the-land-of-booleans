(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
           false
           (if (= x false)
             false
             true)))

(defn abs [x]
  (if (>= x 0)
    x
    (* -1 x)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))


(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else ""))

(defn teen? [age]
  (if (<= 13 age)
    (if (>= 19 age)
      true
      false)
    false
    ))

(defn not-teen? [age]
  (cond
   (teen? age) false
   :else true))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (map? x) true ;wtf?
   (list? x) (* (count x) 2)
   (coll? x) (* (count x) 2)
   :else "true"))

(defn leap-year? [year]
  (cond
   (= (mod year 400) 0) true
   (= (mod year 100) 0) false
   (= (mod year 4) 0) true
    :else false))

; '_______'
