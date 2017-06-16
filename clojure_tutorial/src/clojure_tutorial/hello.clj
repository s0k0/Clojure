(ns clojure-tutorial.hello
  (:gen-class))
(defn hello-world []
  (println (+ 1 2))
  (println (str  "Hello Moon")))
(hello-world)