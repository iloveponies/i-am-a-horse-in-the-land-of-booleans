(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

  (defn boolean [x]
    (if (or (= x nil) (= x false))
      false
      true))

  (defn abs [x]
    (if (>= x 0)
      x
      (* x -1)))

  (defn divides? [divisor n]
    (if (== 0 (mod n divisor))
      true
      false))

  (defn fizzbuzz [n]
    (cond
      (= true (and (divides? 3 n) (divides? 5 n))) "gotcha!"
      (divides? 5 n) "buzz"
      (divides? 3 n) "fizz"
      :else ""
      ))

  (defn teen? [age]
    (if (and (> age 12) (< age 20))
      true
      false))

  (defn not-teen? [age]
    (if (not (teen? age))
      true
      false))

  (defn generic-doublificate [x]
    (cond
      (number? x) (* 2 x)
      (empty? x) nil
      (or (list? x) (vector? x)) (* 2 (count x))
      :else true
      ))

  (defn leap-year? [year]
    (cond
      (divides? 400 year) true
      (= (divides? 4 year) (divides? 100 year)) false
      (divides? 4 year) true
      ))

; '_______'
