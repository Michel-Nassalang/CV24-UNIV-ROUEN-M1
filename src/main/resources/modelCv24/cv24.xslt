<xsl:stylesheet version="3.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:cv24="http://univ.fr/cv24">
<xsl:template match="cv24:cv24">
<html>
  <head>
    <title>CV24 - XSLT V3.0</title>
    <link rel="stylesheet" type="text/css" href="/css/detailCv24.css"/>
  </head>
  <body>
  <h1>CV24 - XSLT V3.0</h1>
	    <xsl:apply-templates  select="cv24:identite"/>
	    <xsl:apply-templates  select="cv24:objectif"/>
	    <xsl:apply-templates  select="cv24:prof"/>
	    <xsl:apply-templates  select="cv24:competences"/>
	    <xsl:apply-templates  select="cv24:divers"/>
  </body>
</html>
</xsl:template>

<xsl:template match="cv24:identite">
    <h2>
		<xsl:value-of select="cv24:genre"/><xsl:text> </xsl:text>
		<xsl:value-of select="cv24:nom"/> <xsl:text> </xsl:text>
		<xsl:value-of select="cv24:prenom"/>
	</h2>
	<p>
		Tel: 
		<xsl:call-template name="numtel">
            <xsl:with-param name="tel" select="cv24:tel"/>
        </xsl:call-template>
		<br></br>
		Mel: <xsl:value-of select="cv24:mel"/>
	</p>
</xsl:template>

<xsl:template match="cv24:objectif">
	<h2><xsl:value-of select="text()"/></h2>
	<p>
		Demande de <xsl:value-of select="@statut"/>
	</p>
</xsl:template>

<xsl:template match="cv24:prof">
	<h2>Expériences professionnelles</h2>
	<ol>
	<xsl:for-each select="cv24:detail">
		<xsl:variable name="class">
                <xsl:choose>
                    <xsl:when test="position() mod 2 = 0">0</xsl:when>
                    <xsl:otherwise>1</xsl:otherwise>
                </xsl:choose>
            </xsl:variable>
            <li class="detail {$class}">
			<xsl:value-of select="cv24:titre"/> ( 
			<xsl:choose>
                        <xsl:when test="string-length(cv24:datefin) > 0">
                        	<xsl:text>du </xsl:text>
                            <xsl:call-template name="dateformat">
                                <xsl:with-param name="fdate" select="cv24:datedeb"/>
                            </xsl:call-template> 
                            <xsl:text> au </xsl:text>
                            <xsl:call-template name="dateformat">
                                <xsl:with-param name="fdate" select="cv24:datefin"/>
                            </xsl:call-template>
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:text>depuis le </xsl:text>
                            <xsl:call-template name="dateformat">
                                <xsl:with-param name="fdate" select="cv24:datedeb"/>
                            </xsl:call-template>
                        </xsl:otherwise>
            </xsl:choose>
                    )
		</li>
	</xsl:for-each>
	</ol>
</xsl:template>

<xsl:template match="cv24:competences">
	<h2>Diplomes</h2>
	<table>
	<xsl:for-each select="cv24:diplome">
		<xsl:sort select="@niveau" order="descending"/>
		<tr>
	    	<td>
	    		<xsl:call-template name="dateformat">
            	<xsl:with-param name="fdate" select="cv24:date"/>
        		</xsl:call-template>
        	</td>
	    	<td><xsl:value-of select="cv24:titre"/></td>
	    	<td>(niveau <xsl:value-of select="@niveau"/>)</td>
	    	<td><xsl:value-of select="cv24:institut"/></td>
		</tr>
	</xsl:for-each>
	</table>
	<h2>Certifications (<xsl:value-of select="count(cv24:certif)"/>)</h2>
	<table>
	<xsl:for-each select="cv24:certif">
		<tr>
			<td><xsl:call-template name="dateformat">
            	<xsl:with-param name="fdate" select="cv24:datedeb"/>
        		</xsl:call-template> - 
        		<xsl:call-template name="dateformat">
            	<xsl:with-param name="fdate" select="cv24:datefin"/>
        		</xsl:call-template></td>
			<td><xsl:value-of select="cv24:titre"/></td>
		</tr>
	</xsl:for-each>
	</table>
</xsl:template>

<xsl:template match="cv24:divers">
	<h2>Langues</h2>
	<ul>
		<xsl:for-each select="cv24:lv">
			<li>
				<xsl:value-of select="@lang"/><xsl:text> : </xsl:text> 
				<xsl:value-of select="@cert"/>
				 (<xsl:value-of select="@nivs | @nivi"/>)
			</li>
		</xsl:for-each>
	</ul>
	<h2>Divers</h2>
	<ul>
		<xsl:for-each select="cv24:autre">
			<li>
			<xsl:value-of select="@titre"/><xsl:text> : </xsl:text> <xsl:value-of select="@comment"/>
			</li>
		</xsl:for-each>
	</ul>
</xsl:template>

<xsl:template name="numtel">
    <xsl:param name="tel"/>
    <xsl:choose>
        <xsl:when test="starts-with($tel, '+33')">
            <xsl:text>+33 (0)</xsl:text>
            <xsl:value-of select="substring($tel, 4, 1)"/> 
            <xsl:text> </xsl:text>
            <xsl:value-of select="substring($tel, 5, 2)"/> 
            <xsl:text> </xsl:text>
            <xsl:value-of select="substring($tel, 7, 2)"/> 
            <xsl:text> </xsl:text>
            <xsl:value-of select="substring($tel, 9, 2)"/> 
            <xsl:text> </xsl:text>
            <xsl:value-of select="substring($tel, 11)"/> 
        </xsl:when>
        <xsl:otherwise>
            <xsl:value-of select="$tel"/>
        </xsl:otherwise>
    </xsl:choose>
</xsl:template>


<xsl:template name="dateformat">
    <xsl:param name="fdate"/>
    <xsl:variable name="jj" select="substring($fdate, 9, 2)"/>
    <xsl:variable name="mm" select="substring($fdate, 6, 2)"/>
    <xsl:variable name="yyyy" select="substring($fdate, 1, 4)"/>
    <xsl:value-of select="$jj"/>
    <xsl:text> </xsl:text>
    <xsl:choose>
        <xsl:when test="$mm = '01'">Janv</xsl:when>
        <xsl:when test="$mm = '02'">Fevr</xsl:when>
        <xsl:when test="$mm = '03'">Mars</xsl:when>
        <xsl:when test="$mm = '04'">Avr</xsl:when>
        <xsl:when test="$mm = '05'">Mai</xsl:when>
        <xsl:when test="$mm = '06'">Juin</xsl:when>
        <xsl:when test="$mm = '07'">Juil</xsl:when>
        <xsl:when test="$mm = '08'">Aout</xsl:when>
        <xsl:when test="$mm = '09'">Sept</xsl:when>
        <xsl:when test="$mm = '10'">Oct</xsl:when>
        <xsl:when test="$mm = '11'">Nov</xsl:when>
        <xsl:when test="$mm = '12'">Déc</xsl:when>
    </xsl:choose>
    <xsl:text> </xsl:text>
    <xsl:value-of select="$yyyy"/>
</xsl:template>


</xsl:stylesheet>