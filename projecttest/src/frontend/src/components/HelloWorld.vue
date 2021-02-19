<!doctype html>
<html>
<head>
  <title>example 1-2</title>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<div id="app">
  <button v-on:click="showname" >클릭</button>
  <p>이름 : {{answer}} </p>
</div>
</body>
<script src="https://unpkg.com/axios@0.12.0/dist/axios.min.js"></script>
<script>
  new Vue({
    el: '#app',
    data:{
      answer: ' '
    },
    methods : {
      showname : function (){
        var self = this;
        axios.get('http://localhost:8080/home/name')
            .then(function (response){
              console.log(response)
              self.answer = response.data.name
            })
            .catch(function (error){
              self.answer = '에러! '+  error
            })
      }
    }
  })
</script>
</html>