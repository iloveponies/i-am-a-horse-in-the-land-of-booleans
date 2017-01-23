(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

 (defn boolean [x]
  (if (= x false)
   false
   (if (= x nil)
    false
    true)))

 (defn abs [x]
  (if (> x 0)
    x
    (- x (* 2 x))))

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
  (if (< 12 age 20)
  true
  false))

 (defn not-teen? [age]
  (not (teen? age)))

 (defn generic-doublificate [x]
  (if (number? x)
    (* 2 x)
    (if (empty? x)
      nil
      (if (list? x)
        (* 2 (count x))
        (if (vector? x)
          (* 2 (count x))
          true)))))

 (defn leap-year? [year]
  (if (= (mod year 4) 0)
    (if (= (mod year 100) 0)
      (if (= (mod year 400) 0)
        true
        false)
      true)
    false))

; '_______'
