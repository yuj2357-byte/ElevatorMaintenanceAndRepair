import Vue from 'vue'
import Router from 'vue-router'
import ElevatorView from '../views/ElevatorView.vue'
import MaintenanceView from '../views/MaintenanceView.vue'
import RepairView from '../views/RepairView.vue'

Vue.use(Router)

export default new Router({
  routes: [
    { path: '/', component: ElevatorView },
    { path: '/maintenance', component: MaintenanceView },
    { path: '/repair', component: RepairView }
  ]
})
