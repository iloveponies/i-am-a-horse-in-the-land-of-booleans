(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
	(if x true false ))

(defn abs [x]
	(if (>= x 0)
		x
		(* -1 x)
	))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  	(cond 
    	(divides? 15 n) "gotcha!"
    	(divides? 5 n) "buzz"
    	(divides? 3 n) "fizz"
    	:else ""
	))

(defn teen? [age]
	(<= 13 age 19))

(defn not-teen? [age]
	(not (teen? age)))

(defn generic-doublificate [x]
  	(cond
    	(number? x) (* x 2)
    	(empty? x) nil
    	(or (vector? x) (list? x)) (* 2 (count x))
   		:else true
  	))

(defn leap-year? [year]
  	(if (divides? 4 year)
    	(if (divides? 100 year)
      		(if (divides? 400 year)
        		true
        		false
        	)
      	true
      	)
    false
    ))
; '_______'
