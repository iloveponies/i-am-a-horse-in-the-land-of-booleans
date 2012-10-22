(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if (= x false)
    false
    (if (= x nil)
      false
      true)))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (== (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else           ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x)  nil
    (list? x)   (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else       true))

(defn leap-year? [year]
  (and (divides? 4 year)
       (or (not (divides? 100 year))
                (divides? 400 year))))

; '_______'
