(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
	(if x true false) 
  )

(defn abs [x] 
  (if( < x 0)
	(* x -1)
    x)
  )

(defn divides? [divisor n]
     (if ( = 0 (mod divisor n) )
       true
       false)
  )

(defn fizzbuzz [n]
  (cond
   	(divides? n 15) "gotcha!"
    (divides? n 5) "buzz"
    (divides? n 3) "fizz"
    :else         ""))

(defn teen? [age]
	(if (and (>= age 13 ) (< age 20)) true false)
  )

(defn not-teen? [age]
  (if (= true (teen? age))
    	false
		true
    )
  )

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* (count x) 2)
   (vector? x) (* (count x) 2)
   (coll? x) true
  )
)

(defn leap-year? [year]
 (cond
  (divides? year 400) true 
  (divides? year 100) false
  (divides? year 4) true 
  :else false
  ))
