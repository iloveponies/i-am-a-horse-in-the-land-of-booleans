(ns i-am-a-horse-in-the-land-of-booleans)

(defn boolean [arvo] (if arvo true false))

(defn teen? [age] (< 12 age 20))

(defn abs [number] (if (< number 0) (* -1 number) number))

(defn divides? [x y] (= 0 (mod y x)))

(defn fizzbuzz [number]
  (cond
   (divides? 15 number) "gotcha!"
   (divides? 5 number) "buzz"
   (divides? 3 number) "fizz"
   :else ""))

(defn generic-doublificate [arvo]
  (cond
   (number? arvo) (* arvo 2)
   (empty? arvo) nil
   (or (list? arvo) (vector? arvo)) (* 2 (count arvo))
   :else true
   )
  )

(defn not-teen? [age] (not (teen? age)))

(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides? 4 year) true
   :else false
   ))



