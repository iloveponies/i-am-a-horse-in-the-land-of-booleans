(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
  	(= false)
  	(= true)
  )
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
  (if (and (>= age 13) (<= age 19) true)
  	( = true)
  	( = false)
  )
)

(defn not-teen? [age]	
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
