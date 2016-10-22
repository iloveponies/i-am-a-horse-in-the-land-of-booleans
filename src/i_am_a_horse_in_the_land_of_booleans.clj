(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x false)
    false
    (if (= x nil)
      false
      true
    )))

(defn abs [x]
    (if
      (< x 0)
      (* -1 x)
      x
    ))

(defn divides? [divisor n]
  (== 0 (mod n divisor)))

(defn fizzbuzz [n]
  (if (divides? 3 n)
    (if (divides? 5 n)
      "gotcha!"
      "fizz")
    (if (divides? 5 n)
      "buzz"
      ""
      )))

(defn teen? [age]
  (< 12 age 20)
  )

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x)
    (* 2 x)
    (if (empty? x)
      nil
      (if (or (list? x) (vector? x))
        (* 2 (count x))
        true
        ))))


(defn leap-year? [year]
    (and
      (divides? 4 year)
      (or
        (not (divides? 100 year))
        (divides? 400 year))))
; '_______'
