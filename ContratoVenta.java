<span class="s0">public </span><span class="s1">ContratoVenta(</span><span class="s4">Inmueble </span><span class="s1">inm, </span><span class="s4">Cliente </span><span class="s1">clie, </span><span class="s4">Vendedor </span><span class="s1">vend) {</span>
    <span class="s0">this</span><span class="s1">.inmueble = inm;</span>
    <span class="s0">this</span><span class="s1">.comprador = clie;</span>
    <span class="s0">this</span><span class="s1">.asesor = vend;</span>
<span class="s1">}</span>

<span class="s0">public void </span><span class="s1">finalizarVenta() {</span>
    <span class="s1">inmueble.setEstado(</span><span class="s2">&quot;Vendido&quot;</span><span class="s1">);</span>
    <span class="s4">System</span><span class="s1">.out.println(</span><span class="s2">&quot;Contrato cerrado satisfactoriamente.&quot;</span><span class="s1">);</span>
<span class="s1">}</span>
  }
