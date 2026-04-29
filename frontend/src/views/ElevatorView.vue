<template>
  <section>
    <h2>电梯档案管理</h2>
    <ul>
      <li v-for="item in list" :key="item.id">{{ item.code }} - {{ item.model }} - {{ item.status }}</li>
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
    const { data } = await http.get('/elevators')
    this.list = data
  }
}
</script>
