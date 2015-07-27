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
  (if (mod n divisor) 0)
  	(= true)
  	(= false)
)

(defn fizzbuzz [n]
  ":(")

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
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
