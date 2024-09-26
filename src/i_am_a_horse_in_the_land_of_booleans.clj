(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond (= x "foo") true
        (= x nil) false
        (= x (+ 2 3)) true
        (= x true) true
        (= x false) false
        :else true)
)

(defn abs [x]
  (if (< x 0)
  	(- x)
  	x
  )
)

(defn divides? [divisor n]
  (zero? (mod n divisor))
) 


(defn fizzbuzz [n] 
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? [age]
  (cond (< age 13) false
        (> age 19) false
        :else true)
)

(defn not-teen? [age]	
  (cond (< age 13) true
        (> age 19) true
        :else false)
)

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (vector? x) (* 2 (count x))
    (list? x) (* 2 (count x))
    :else true
  )  
)

(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false
  )
)

; '_______'
