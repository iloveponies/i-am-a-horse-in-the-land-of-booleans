(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

 (defn
    abs
    [val]
    (if (< val 0) (/ val -1) val))

 (defn
    divides?
    [val1 val2]
    (if (= (mod val2 val1) 0) true false))

  (defn
    fizzbuzz
    [n]
    (cond
      (divides? 15 n) "gotcha!"
      (divides? 5 n) "buzz"
      (divides? 3 n) "fizz"
      :else ""))

 (defn
    teen?
    [val]
    (if (< 12 val 20) true false))

 (defn
      not-teen?
      [age]
      (not (teen? age)))

 (defn
    generic-doublificate
    [x]
    (cond
     (number? x) (* x 2)
     (empty? x) nil
     (list? x) (* (count x) 2)
     (vector? x) (* (count x) 2)
     :else true))

(defn leap-year? [year]
  (and (divides? 4 year) (or (divides? 400 year) (not (divides? 100 year)))))

; '_______'
