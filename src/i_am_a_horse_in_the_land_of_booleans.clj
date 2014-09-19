(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  "This returns falsey for nil and false and truthy for all else"
  (and
  true
  ( not (not x) )  ; Makes sure we are only comparing boolean values, so only bools returned
  ))

(defn
  abs
  "Returns the absolute value of x"
  [x]
  (if (< x 0)
    (* -1 x)
    x )
  )

(defn divides?
  "Returns true if divisor divides n, false otherwise"
  [divisor n]                         ; This is passing in 2 params
   (if ( == 0 (mod n divisor) )
     true
     false) )

(defn fizzbuzz
  "Returns 'fuzz' when /3, 'buzz' when /5 'gotcha' /15 and '' otherwise"
  [n]
  (cond
   (divides? 15 n) "gotcha!"           ; This is like an elseif, not ifs.
   (divides? 5  n) "buzz"
   (divides? 3  n) "fizz"
   :else           ""  ) )

(defn
  teen?
  "Return truthy if 19 >= age >= 13"
  [age]
  ( >= 19 age 13 ) )

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
