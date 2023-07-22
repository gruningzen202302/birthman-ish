(ns app
  (:require ["moment$default" :as moment]
            ["inquirer$default" :as inquirer]))

(println "Hello, World from app.cljs!")

(def questions (clj->js[{ :name "name" 
                          :type "input"
                          :message "Who's birthday is it?"}]))
(inquirer/prompt questions)

(comment
  moment () .year ()
  (.year (moment))
  )
