<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:template name="fizzbuzz">
    <xsl:param name="i" />
    <xsl:param name="max" />

    <xsl:choose>
      <xsl:when test="not($i mod 15)"><xsl:message>FizzBuzz</xsl:message></xsl:when>
      <xsl:when test="not($i mod 3)"><xsl:message>Fizz</xsl:message></xsl:when>
      <xsl:when test="not($i mod 5)"><xsl:message>Buzz</xsl:message></xsl:when>
      <xsl:otherwise><xsl:message><xsl:value-of select="$i" /></xsl:message></xsl:otherwise>
    </xsl:choose>

    <xsl:if test="$i &lt; $max">
      <xsl:call-template name="fizzbuzz">
        <xsl:with-param name="i" select="$i+1" />
        <xsl:with-param name="max" select="$max" />
      </xsl:call-template>
    </xsl:if>
  </xsl:template>

  <xsl:template match="/">
    <xsl:call-template name="fizzbuzz">
      <xsl:with-param name="i" select="1" />
      <xsl:with-param name="max" select="100" />
    </xsl:call-template>
  </xsl:template>

</xsl:stylesheet>
