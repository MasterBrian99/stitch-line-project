<template>
  <router-view />
</template>

<script lang="ts">
import { defineComponent } from "vue";

export default defineComponent({
  name: "App",
});
</script>

<style>
.main {
  width: 100%;
  backdrop-filter: blur(158px) saturate(180%);
  background-color: rgba(255, 255, 255, 0.75);
  min-height: 100vh;
  height: 100%;
}
</style>
