(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [val] (if val true false))

(defn abs [n] (if (<  n 0) (- n) n))

(defn divides? [divisor n] (= 0 (mod n divisor)))

(defn fizzbuzz [n] (cond (divides? 15 n) "gotcha!"
                         (divides? 3 n) "fizz"
                         (divides? 5 n) "buzz"
                         :else ""
                    ))

(defn teen? [age] (if (<= age 19) (>= age 13) false))

(defn not-teen? [x] (not (teen? x)))

(defn generic-doublificate [x] (cond
                                (number? x) (* 2 x)
                                (empty? x) nil
                                (or (list? x) (vector? x)) (* 2 (count x))
                                :else true

                                ))

(defn leap-year? [y] (and (divides? 4 y) (or (divides? 400 y) (not (divides? 100 y)))))

; '_______'
