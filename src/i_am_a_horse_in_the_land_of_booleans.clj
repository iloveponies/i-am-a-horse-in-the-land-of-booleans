(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
 (if x true false) )

(defn abs [x]
  (if (> x 0)
    x
    (- x)) )

(defn divides? [divisor n]
  (== 0 (mod n divisor)) )

(defn fizzbuzz [n]
  (cond
	(divides? 15 n) "gotcha!"
  	(divides? 5 n) "buzz"
	(divides? 3 n) "fizz"
	:else		"") )

(defn teen? [age]
  (<= 13 age 19) )

(defn not-teen? [age]
  (if (not (teen? age)) true false) )

(defn generic-doublificate [x]
        (cond
	 (number? x) (+ x x)
         (or (list? x) (vector? x))
               (if (empty? x)
                    nil
                    (map #(* % 2) x))
	(and (map? x) (empty? x)) nil   ; lisäsin tämän koska tehtävänanto. en ehkä ymmärtänyt mitä haettiin?

	:else true)      
)


(defn leap-year? [year]
    (cond
	(divides? 400 year) true
	(divides? 100 year) false
	(divides? 4 year) true
	:else false) )

; '_______'
