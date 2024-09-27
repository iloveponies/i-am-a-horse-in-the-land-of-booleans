(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x false) (= x nil)) false true)
)

(defn abs [x]
  (if (> 0 x) (* -1 x) x)
)

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false ))

(defn fizzbuzz [n]
  (cond 
   (divides? 15 n) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))
   

(defn teen? [age]
  (< 12 age 20)
;;  (if (and  (> age 12) (< age 20)) true false)
  )

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (vector? x) (* 2 (count x) )
   (list? x) (* 2 (count x) )
   :else true
   ))

;;if (year is not divisible by 4) then (it is a common year)
;;else if (year is not divisible by 100) then (it is a leap year)
;;else if (year is not divisible by 400) then (it is a common year)
;;else (it is a leap year)

(defn leap-year? [year]
  (cond 
   (not (divides? 4 year))  false
   (not (divides? 100 year)) true
   (not (divides? 400 year)) false
   :else true
   ))

; '_______'
(defn sayhello [n]
  (println "say " n))
