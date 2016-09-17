(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "boolean implementation"
  (if (or (= x false) (= x nil))
    false
    true))

(defn abs [x]
  "returns an absolute value of x"
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  "checks if teen or not"
  (if (>= 19 age 13)
    true
    false))

(defn not-teen? [age]
  (if (not(teen? age))
    true
    false))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (*(count x) 2)
    :else true))


(defn leap-year? [year]
  (cond
    (not(divides? 4 year)) false
    (not(divides? 100 year)) true
    (not(divides? 400 year)) false
    :else true
    ))

; '_______'


(comment
  tests

  (use 'i-am-a-horse-in-the-land-of-booleans)

  (teen? 20)
  (not-teen? 20)

  (abs 12)

  (divides? 4 2)

  (fizzbuzz 2)
  (fizzbuzz 45)
  (fizzbuzz 48)
  (fizzbuzz 70)

  (generic-doublificate 1)
  (generic-doublificate [1 2])
  (generic-doublificate '(65 21))
  (generic-doublificate {})
  (generic-doublificate [])
  (generic-doublificate {:a 1})

  (not-teen? 13)
  (not-teen? 25)
  (not-teen? 12)
  (not-teen? 19)
  (not-teen? 20)

  (leap-year? 100)
  (leap-year? 200)
  (leap-year? 400)
  (leap-year? 12)
  (leap-year? 20)
  (leap-year? 15)

  )
