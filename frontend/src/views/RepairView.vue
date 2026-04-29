<template>
  <section>
    <h2>故障报修工单</h2>
    <ul>
      <li v-for="item in list" :key="item.id">电梯{{ item.elevatorId }} - {{ item.faultLevel }} - {{ item.status }}</li>
    </ul>
  </section>
</template>

<script>
import http from '../api/http'

export default {
  data() {
    return { list: [] }
  },
  async created() {
    const { data } = await http.get('/repair-orders')
    this.list = data
  }
}
</script>
