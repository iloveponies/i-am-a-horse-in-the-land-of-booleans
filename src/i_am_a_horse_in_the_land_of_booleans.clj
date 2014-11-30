(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
   false
   (if (= x false) false
     true)))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

;check if y divides x

(defn divides? [x y]
  (if (== (mod y x) 0) true false))

(defn fizzbuzz [x]
    (cond
        (divides? 15 x) "gotcha!"
        (divides? 3 x) "fizz"
        (divides? 5 x) "buzz"
        :else           ""))

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn listorvector? [coll]
    (cond
        (list? coll) true
        (vector? coll) true
        :else          false))

(defn generic-doublificate [x]
    (cond
        (number? x) (* 2 x)
        (empty? x) nil
        (listorvector? x) (* 2 (count x))
        :else true))

(defn leap-year? [x]
    (if(divides? 4 x)
        (cond
            (not (divides? 100 x)) true
            (and (divides? 100 x) (divides? 400 x)) true
            :else false
            )
        false))
