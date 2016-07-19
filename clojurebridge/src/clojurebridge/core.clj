(ns clojurebridge.core
  (:require [quil.core :refer :all]))

(defn setup []
  (frame-rate 5)
  (background 200)
  (color-mode :rgb))

(defn draw []
  ; ----- grey  -----
  (stroke (random 255))
  (fill (random 225))
  ;------ monochrome  ----
  ;(stroke (random 255) 0 0)
  ;(fill (random 225) 0 0)
  ; ----- capacity ----
  ;(stroke 0 100 0 (random 255))
  ;(fill 0 100 0 (random 255))
  ; --- line style and position---
  (stroke-weight (random 20))
  (let [diam (random 150)
          x    (random (width))
          y    (random (height))] 
   (ellipse x y diam diam))) 
  

(defsketch hello-circle

  :title "All My Circles"
  
  :settings #(smooth 2)

  :size [700 700]

  :setup setup

  :draw draw)

(defn -main [& args])
