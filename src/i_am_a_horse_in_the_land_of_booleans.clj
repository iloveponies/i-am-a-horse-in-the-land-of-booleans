(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
  	(= x nil) false
  	(= x false) false
  	:else true
  	)
  )

(defn abs [x]
  (if (< 0 x)
  	x
  	(* -1 x)
  	)
  )

(defn divides? [divisor n]
  (if (= 0 (rem n divisor)) true false)

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
  (if (and (> age 12 ) (< age 20)) true false)	
	)

(defn not-teen? [age]
  (not (teen? age))
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

(defn leap-year? [year]
  (if (divides? 400 year) true
  	(if (divides? 100 year) false
  			(if (divides? 4 year) true false
  			)
  		)
  	 )
  )

; '_______'

