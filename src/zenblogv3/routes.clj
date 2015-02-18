(ns zenblogv3.routes
  (:require [compojure.core :refer :all]
            [zenblogv3.layout :as page]))

(defn homepage
  "The rendering function for homepage"
  []
  (page/render "base.html"
               {:headline "Welcome to ...."
                :title "Luminoob website"}))

(defroutes home
  (GET "/" req
       (homepage)))
