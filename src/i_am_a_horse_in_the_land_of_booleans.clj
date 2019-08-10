(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))


(if "foo"
  "true"
  "false")

(defn
  boolean
  "Katsotaan totuusarvo"
  [x]
  (if (= x nil)
         false
         (if(= x false) ;Nested if
           false
           true)))


(boolean "foo")
(boolean nil)
(boolean (+ 2 3))
(boolean true)
(boolean false)



(defn
  teen?
  [age]
  (if (<= 13 age 19)
    true
    false
  ))

(teen? 12)
(teen? 13)
(teen? 20)
(teen? 30)


(defn
  abs
  [x]
  (if (< x 0)
     (* x -1) ; 1. ehto
     x ; 2. ehto
  ))

(abs -2)
(abs 2)
(abs 100)
(abs -10)

(defn
  divides?
  [divisor n]
  (if (= 0 (mod n divisor))
    true
    false
  ))

(divides? 2 4)
(divides? 3 2)
(divides? 5 10)
(divides? 2 5)


(defn
  fizzbuzz
  [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""
    ))


(fizzbuzz 15)
(fizzbuzz 2)
(fizzbuzz 45)
(fizzbuzz 48)
(fizzbuzz 70)

(defn
  generic-doublificate
  [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (vector? x) (*(count x) 2)
    (list? x) (*(count x) 2)
    :else true
  ))

(generic-doublificate 1)
(generic-doublificate [1 2]) ; VEKTORI
(generic-doublificate '(65 21)) ; LISTA
(generic-doublificate {})
(generic-doublificate [])
(generic-doublificate {:a 1})
;(generic-doublificate [1 2 3 4 5]);
;(generic-doublificate '(10 9 8 7 6))

(defn
  not-teen?
  [age]
  (or (< age 13) (> age 19))
  )

(not-teen? 20)
(not-teen? 13)
(not-teen? 12)
(not-teen? 19)


(defn
  leap-year?
  [year]
  (cond
    (not (divides? 4 year)) false
    (not (divides? 100 year)) true
    (not (divides? 400 year)) false
    :else true)
  )

(leap-year? 100)
(leap-year? 200)
(leap-year? 400)
(leap-year? 12)
(leap-year? 20)
(leap-year? 15)

;ALL OF THE ABOVE PASS
;ALL OF THE ABOVE PASS
; '_______'
