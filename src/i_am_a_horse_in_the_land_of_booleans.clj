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
  (cond 
    (= 0 (mod n 15 )) "gotcha!"
  	(= 0 (mod n 3)) "fizz"
   	(= 0 (mod n 5)) "buzz" 
    :else ""
  )
 )

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
  (cond 
    (number? x) (* 2 x)
  	(empty? x) nil
  	(list? x) (* 2 (count x))
  	:else true 
  )
 )

(defn leap-year? [year]
  ":(")

; '_______'
