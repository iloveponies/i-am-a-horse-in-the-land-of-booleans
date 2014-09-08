(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x false) false
    (if (= x nil) false
    	true
     )
  )
)

(defn abs [x]
  (if (< x 0)
  (* -1 x)
  x))

(defn divides? [divisor n]
  (= (mod n divisor) 0)
  )

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
     (divides? 5 n) "buzz"
     (divides? 3 n) "fizz"
     :else ""
   )
  )

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (if (teen? age)
  false
  true)
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

; A year is a leap year if it is 
;divisible by 4, except if it is
; divisible by 100, in which case it
; still is a leap year if it is
; divisible by 400.



(defn leap-year? [year]
  (cond
    (and (divides? 100 year ) (divides? 400 year) ) true
     (and (divides? 4 year )  (not (divides? 100 year ) ) )true 
     :else false
     )
  )
  


; '_______'
