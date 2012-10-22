(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< 0 x)
    x
    (- x)))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (if(divides? 15 n)
    "gotcha!"
    (if (divides? 5 n)
      "buzz"
      (if (divides? 3 n)
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
  (if(number? x)
    (* 2 x)
    (if (empty? x)
      nil
      (if(list? x)
        (* 2(count x))
        (if(vector? x)
          (* 2 (count x))
          true)))))

(defn leap-year? [year]
  (if(divides? 400 year)
    true
    (if(divides? 100 year)
      false
      (if(divides? 4 year)
        true
        false))))