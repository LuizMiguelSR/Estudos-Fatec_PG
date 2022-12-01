import axios from 'axios';
 
//http://localhost:3333/tasks
 
const api = axios.create({
  //baseURL: 'http://localhost:3333/'
  baseURL: 'https://economia.awesomeapi.com.br/json/last/'
});
 
export default api;