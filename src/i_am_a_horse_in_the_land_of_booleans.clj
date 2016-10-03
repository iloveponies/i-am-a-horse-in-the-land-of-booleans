(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil) false (if (= x false) false true)))

(defn abs [x]
  (if (> x 0) x (- 0 x)))

(defn divides? [divisor n]
  (let [result (int (/ n divisor))
  		after-multiplication (* result divisor)]
  	(if (= n after-multiplication) true false)))

(defn fizzbuzz [n]
  (let [divisible-by-3 (divides? 3 n)
  		divisible-by-5 (divides? 5 n)]
  			(if (and divisible-by-3 divisible-by-5) "gotcha!"
  				(if divisible-by-5 "buzz" 
  					(if divisible-by-3 "fizz" "")))))

(defn teen? [age]
  (if (> age 12) (if (< age 20) true false) false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
	(cond
	(number? x) (* 2 x)
	(empty? x) nil
	(or (list? x) (vector? x)) (* 2 (count x))
	:else true))

(defn leap-year? [year]
  (let [divides-by-4 (divides? 4 year)
  		divides-by-100 (divides? 100 year)
  		divides-by-400 (divides? 400 year)]
  		(cond
  			(not divides-by-4) false
  			(not divides-by-100) true
  			(not divides-by-400) false
  			:else true
  		)	
   )
 )

; '_______'
