(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

; EXERCISE 1
(defn boolean [x]
  (if x true false))

;(boolean (+ 1 2))


; EXERCISE 3
(defn abs [n]
  (if (< n 0)
    (- n)
    n))

; (abs -4)


; EXERCISE 4
(defn divides? [divisor n]
;  (if (= (mod n divisor) 0) true
;  false))
  (= (mod n divisor) 0))

; (divides? 4 2)
; (divides? 2 4)
; (divides? 2 5)


; EXERCISE 5
(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n)  "buzz"
   (divides? 3 n)  "fizz"
   :else          ""))

; (fizzbuzz 2)  ;=> ""
; (fizzbuzz 45) ;=> "gotcha!"
; (fizzbuzz 48) ;=> "fizz"
; (fizzbuzz 70) ;=> "buzz"


; EXERCISE 2
(defn teen? [age]
;  Tämäkin toimii, mutta ei tehtävänannon mukainen:
;  (if (> age 12) (if (< age 20) true false) false))
  (< 12 age 20))

; (teen? 14)
; (teen? 13)


; EXERCISE 7
(defn not-teen? [age]
  (cond
   (not (teen? age)) true
   :else             false))

; (not-teen? 13) ;=> false
; (not-teen? 25) ;=> true
; (not-teen? 12) ;=> true
; (not-teen? 19) ;=> false
; (not-teen? 20) ;=> true


; EXERCISE 6
(defn generic-doublificate [x]
  (cond
   (number? x)                (* 2 x)
   (empty? x)                 nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else                      true))

; (generic-doublificate 1)        ;=> 2
; (generic-doublificate [1 2])    ;=> 4
; (generic-doublificate '(65 21)) ;=> 4
; (generic-doublificate {})       ;=> nil
; (generic-doublificate [])       ;=> nil
; (generic-doublificate {:a 1})   ;=> true



; EXERCISE 8
(defn leap-year? [year]
  (cond
   (not (divides? 4 year))   false
   (not (divides? 100 year)) true
   (not (divides? 400 year)) false
   :else                     true))

; (leap-year? 100) ;=> false
; (leap-year? 200) ;=> false
; (leap-year? 400) ;=> true
; (leap-year? 12)  ;=> true
; (leap-year? 20)  ;=> true
; (leap-year? 15)  ;=> false


; '_______'
