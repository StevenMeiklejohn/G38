
const express = require('express')
const createRouter = function(data){

    const router = express.Router()

    router.get('/', (req, res) => {
        res.json(data)
      })
      
      router.get('/:id', (req, res) => {
        res.json(data[req.params.id])
      })
      
      router.post('/', (req, res) => {
        data.push(req.body)
        res.json(data)
      })
      
      router.delete('/:id', (req, res) => {
        data.splice(req.params.id, 1)
        res.json(data)
      })
      
      router.put('/:id', (req, res) => {
        teas[req.params.id] = req.body
        res.json(teas)
      })

      return router
}

module.exports = createRouter;