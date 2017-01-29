(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean "Imitates built-in function boolean" [x]
  (if x true false)
  )

(defn abs "Return absolute value of a number" [x]
  (if (<= 0 x) x (- 0 x) ))

(defn divides? "Does divisor divide n exactly?" [divisor n]
  (if
    (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz
  "returns fizz when n is divisible by 3, buzz when n is divisible by 5, gotcha! when n is divisible by 15, and the empty string otherwise."
  [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""))

(defn teen? "Tells whether age is of a teenager" [age]
  (< 12 age 20))

(defn
  not-teen?
  "return false for teeny ages, true for others"
  [age]
  (not (teen? age))
  )

(defn
  generic-doublificate
  "Does doublification based on inputs type"
  [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))


(defn leap-year?
  "Is given year a leap year?"
  [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false)

    )



; '_______'
