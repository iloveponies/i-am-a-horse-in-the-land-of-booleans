(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (or
         (= x false)
         (= x nil)
        )
  )
)


(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x
  )
)

(defn divides? [divisor n]
  (== 0 (mod n divisor))
)

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
  )
)



(defn teen? [age]
  (boolean (and
             (> age 12)
             (< age 20)
          )
  )
)

(defn not-teen? [age]
  (not (teen? age))
)

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x)  (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true
  )
)

(defn leap-year? [year]
  (cond
    (not (divides? 4 year)) false
    (divides? 400 year) true
    (divides? 100 year) false
    :else true
  )
)
