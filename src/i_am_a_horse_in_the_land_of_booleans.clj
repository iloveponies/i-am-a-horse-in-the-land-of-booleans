(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [non-logic]
  "My very special boolean function."
  (if non-logic true false))

(
  defn
  abs
  "This function computes an absolute value of given number."
  [tale]
  (if (< 0 tale) tale (* -1 tale)))

(
  defn
  divides?
  "Detect whether the joy evenly divisible by divisor."
  [divisor joy]
  (if (== (mod joy divisor) 0) true false))

(
  defn
  fizzbuzz
  "A fizbuzz classics."
  [tale]
  (
    cond
    (== (mod tale 15) 0) "gotcha!"
    (== (mod tale 3) 0) "fizz"
    (== (mod tale 5) 0) "buzz"
    :else
    ""))

(
  defn
  teen?
  "Detect whether given (o)bject teen (keen?)."
  [tale]
  (<= 13 tale 19))

(defn not-teen? [age]
  "Adultery is a crime."
  (not (teen? age)))

(
  defn generic-doublificate
  "Doublificate given number, making it two times bigger
   (if encounter list or vector, do it with the length!)."
  [XXX]
  (
    cond
    (number? XXX) (* 2 XXX)
    (empty? XXX) nil
    (or (list? XXX) (vector? XXX)) (* (count XXX) 2)
    :else true))

(
  defn leap-year?
  "Detect whether given year is leap or not."
  [year]
  (
    cond
    (== (mod year 400) 0) true
    (== (mod year 100) 0) false
    (== (mod year 4) 0) true
    :else false))

; ^_____^
