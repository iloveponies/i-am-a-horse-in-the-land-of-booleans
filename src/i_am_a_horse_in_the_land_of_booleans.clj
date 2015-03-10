(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))


"____________________________________"



(defn abs [x]
  (if (<= 0 x)
    x
    (- x)))



"____________________________________"


(defn teen? [age]
  (< 12 age 20))


"____________________________________"




(defn divides? [divisor n]
   (= 0 (mod n divisor)))



"____________________________________"


(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 5)  0) "buzz"
   (= (mod n 3) 0) "fizz"
   :else ""))




"____________________________________"






(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true))


(generic-doublificate 1)        ;=> 2
(generic-doublificate [1 2])    ;=> 4
(generic-doublificate '(65 21)) ;=> 4
(generic-doublificate {})       ;=> nil
(generic-doublificate [])       ;=> nil
(generic-doublificate {:a 1})   ;=> true


















(defn leap-year? [year]
  (cond
   (= 0 (mod year 400)) true
   (and (= 0 (mod year 4)) (not (= 0 (mod year 100)))) true
   :else false))

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false


; '_______'
