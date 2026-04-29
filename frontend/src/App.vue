<template>
  <div id="app">
    <h1>电梯维保管理系统</h1>
    <nav>
      <router-link to="/">电梯档案</router-link> |
      <router-link to="/maintenance">维保计划</router-link> |
      <router-link to="/repair">故障工单</router-link>
    </nav>
    <router-view />
  </div>
</template>
