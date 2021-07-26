<template>
      <div className=" circle-c-2"></div>
      <div className="circle-c-3"></div>
</template>

<script lang="ts">
export default {
    name: 'BackgroundCircle'
}
</script>

<style scoped>


.circle-c-2 {
      position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: #4460F1;
  clip-path: circle(18% at 40% 50%);
}
.circle-c-3 {
      position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: #1293ec;
  clip-path: circle(10% at 90% 10%);
}


</style>