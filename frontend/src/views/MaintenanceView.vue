<template>
  <section>
    <h2>定期维保计划</h2>
    <ul>
      <li v-for="item in list" :key="item.id">电梯{{ item.elevatorId }} - {{ item.planDate }} - {{ item.status }}</li>
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
    const { data } = await http.get('/maintenance-plans')
    this.list = data
  }
}
</script>
