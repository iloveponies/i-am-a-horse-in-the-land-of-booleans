(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn
  boolean
  [x]
  (if (or (false? x) (nil? x))
    false
    true))


(defn
  abs
  [x]
  (if (> x 0)
    x
    (/ x -1)))


(defn
  divides?
  [div n]
  (if (= (mod n div) 0)
    true
    false))

(divides? 2 4) ;=> true
(divides? 4 2) ;=> false
(divides? 5 10) ;=> true
(divides? 2 5) ;=> false


(defn
  fizzbuzz
  [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"

    :else     ""))

(defn
  teen?
  [x]
  (if  (< 12 x 20)
    true
    false))


(defn
  not-teen?
  [x]
  (if  (not (teen? x))
    true
    false))


(defn
  generic-doublificate
  [n]
  (cond
    (number? n) (* 2 n)
    (empty? n) nil
    (or (list? n) (vector? n)) (* 2 (count n))

    :else     true))


(defn
  leap-year?
  [y]
  (if (or (and (divides? 4 y) (not (divides? 100 y))) (divides? 400 y))
    true
    false))

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false


; '_______'
