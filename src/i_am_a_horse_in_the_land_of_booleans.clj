(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false)
  )

(defn abs [x]
  (if (< 0 x)
    x
    (* -1 x))
  )

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false
    )
  )

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (if (< 12 age)
	(if (> 20 age) 
   		true 
   		false)
	false
 	)
  )

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
