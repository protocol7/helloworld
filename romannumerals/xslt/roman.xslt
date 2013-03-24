<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:template name="roman">
    <xsl:param name="i" />
    <xsl:param name="romans" />

    <xsl:if test="string-length($romans) &gt; 0">
      <xsl:variable name="part" select="substring-before($romans, ' ')" />
      <xsl:variable name="r" select="substring-before($part, ',')" />
      <xsl:variable name="a" select="substring-after($part, ',')" />

      <xsl:choose>
        <xsl:when test="$i &gt;= $a">
          <xsl:value-of select="$r" />
          <xsl:call-template name="roman">
            <xsl:with-param name="i" select="$i - $a" />
            <xsl:with-param name="romans" select="$romans" />
          </xsl:call-template>
        </xsl:when>
        <xsl:otherwise>
          <xsl:call-template name="roman">
            <xsl:with-param name="i" select="$i" />
            <xsl:with-param name="romans" select="substring-after($romans, ' ')" />
          </xsl:call-template>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:if>
  </xsl:template>

  <xsl:template match="/arabic">
    <roman>
      <xsl:call-template name="roman">
        <xsl:with-param name="i" select="text()" />
        <xsl:with-param name="romans">M,1000 CM,900 D,500 CD,400 C,100 XC,90 L,50 XL,40 X,10 IX,9 V,5 IV,4 I,1 </xsl:with-param>
      </xsl:call-template>
    </roman>
  </xsl:template>

</xsl:stylesheet>
