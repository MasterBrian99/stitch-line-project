import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import svgPlugin from 'vite-plugin-svg';



// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue(),
  svgPlugin()]
})
