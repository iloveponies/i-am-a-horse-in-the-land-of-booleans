(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x false) (= x nil) ) false true)
  )


(defn abs [x]
  (if (< x 0) (* x -1) x)
  )


(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false)
  )


(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else "" )
  )

(defn teen? [age]
  (if (and (<= age 19)(>= age 13)) true false)
  )

(defn not-teen? [age]
  (not (teen? age))
  )

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   :else true)
  )


(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (not (divides? 100 year))
   (divides? 4 year)
   :else false)
  )

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false
(leap-year? 800)




; ^_______^
