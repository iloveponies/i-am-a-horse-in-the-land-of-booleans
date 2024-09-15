(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  ( if x true false))

(defn abs [x]
  ( if ( < x 0) ( - x) x))

(defn divides? [divisor n]
  ( if ( = 0 (mod  n divisor) )
    true
    false))

(defn fizzbuzz [n]
  (cond
   ( = 0  ( mod n 15)) "gotcha!"
   ( = 0  ( mod n 3))  "fizz"
   ( = 0  ( mod n 5)) "buzz"
   :else ""))

(defn teen? [age]
  (if ( < age 13 ) false
    ( if ( < age 20) true false)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) ( * x 2)
   (empty? x) nil
   (list? x) ( * 2 ( count x))
   (vector? x) ( * 2 ( count x))
   :else true))



(defn leap-year? [year]
  (cond
   (= 0 ( mod year 400)) true
   (= 0 ( mod year 100)) false
   (= 0 ( mod year 4)) true
   :else false))

; '_______'


(boolean false)
(teen? 29)

(divides? 2 4)

(fizzbuzz 1)

(generic-doublificate '( 1 2 3 ))

(def server-port (or nil 80))
server-port

(not-teen? 13)


(divides? 2 4) ;=> true
(divides? 4 2) ;=> false
(divides? 5 10) ;=> true
(divides? 2 5) ;=> false


(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)
