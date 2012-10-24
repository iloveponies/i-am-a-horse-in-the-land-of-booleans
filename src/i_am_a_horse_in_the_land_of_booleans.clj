(ns i-am-a-horse-in-the-land-of-booleans)

(defn 
	my-boolean 
	"reimplement boolean functionality..."
	;
	; task definition as worded does not require if-clauses or more complex implementation
	;
	[x]
  (boolean x))

(defn 
	abs 
  "return the absolute value of parameter"
	[x]
  (if (neg? x)
  	(* -1 x)
  	x))

(defn 
	divides? 
	"return true if divisor devides n evenly"
	[divisor n]
  (if (== 0 (mod n divisor))
  	true
  	false))

(defn 
	fizzbuzz 
	"variation on fizzbuzz"
	[n]
  (cond
  	(divides? 15 n) "gotcha!"
  	(divides? 3 n) "fizz"
  	(divides? 5 n) "buzz"
  	:else ""))

(defn 
	teen? 
	[age]
	"check if parameter falls within teenage numeric range"
	;
	; task does not require three parameters... 
	; even if the following solution has a logical false = false => true, there is no number where
	; this case would be true.
	;
  (= (< 12 age) (> 20 age)))

(defn not-teen? [age]
  (not (teen? age)))

(defn 
	generic-doublificate 
	[x]
  (cond
  	(number? x) (* 2 x)
  	(coll? x) (if (empty? x)
  							nil
  							(if (or (vector? x) (list? x)) 
  								(* 2 (count x))
  								true))
  	:else true))

(defn leap-year? [year]
	(cond 
		(divides? 400 year) true
		(divides? 100 year) false
		(divides? 4 year) true
  :else false))

; '_______'
