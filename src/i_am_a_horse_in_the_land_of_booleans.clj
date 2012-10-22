(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< x 0)
	(* -1 x)
    x
  ))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (if (== 0 (mod n 15))
    "gotcha!"
    (if (== 0 (mod n 5))
    "buzz"
    (if (== 0 (mod n 3))
     "fizz"
      ""))))

(defn teen? [age]
  (if (< 12 age 20)
    true
    false))

(defn not-teen? [age]
  (if (< 12 age 20)
    false
    true))

(defn generic-doublificate [x]
	(if (number? x)
      (* 2 x)
      (if (empty? x)
  	    nil
  	    (if (or (list? x) (vector? x))
          (* 2 (count x))
          true))))

(defn leap-year? [year]
  (if (== 0 (mod year 400))
      true
      (if (== 0 (mod year 100))
        false
        (if (== 0 (mod year 4))
          true
          false))))