(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))
  
;  Horses Ex1
(defn boolean "Get boolean" [x] (if x true false))

;  Horses Ex2
(defn teen? "Is teen?" [x] (if (<= x 19) (>= x 13) false))

;  Horses Ex3
(defn abs "Abs value of x" [x] (if (< x 0) (* -1 x) x))

;  Horses Ex4
(defn divides? "Divides" [x, y] (= 0 (mod y x)))

;  Horses Ex5
(defn fizzbuzz "Fizzbuzz" [n] (cond
	(divides? 15 n) "gotcha!"
	(divides? 5 n) "buzz"
	(divides? 3 n) "fizz"
	:else "")
)

; Horses Ex6
(defn generic-doublificate "Geneerix" [x] (cond
	(number? x) (* x 2)
	(empty? x) nil
	(vector? x) (* 2 (count x))
	(list? x) (* 2 (count x))
	:else true
))

; Horses Ex7
(defn not-teen? "not teen" [age] (not (teen? age)))

; Horses Ex8
(defn leap-year? "is leap year" [year] (and (divides? 4 year) (or (not (divides? 100 year)) (divides? 400 year))))

; '_______'


