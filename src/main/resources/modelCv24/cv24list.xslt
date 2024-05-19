<xsl:stylesheet version="3.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:cv24="http://univ.fr/cv24">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <!-- Template for the root element -->
    <xsl:template match="/cv24:cv24-list">
        <html>
            <head>
                <title>Liste des CV - XSLT V2.0</title>
                <link rel="stylesheet" type="text/css" href="/css/listCv24.css"/>
            </head>
            <body>
                <h1>Liste des CV</h1>
                <table border="1">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Identité</th>
                            <th>Objectif</th>
                            <th>Diplôme plus élevé</th>
                        </tr>
                    </thead>
                    <tbody>
                        <xsl:apply-templates select="cv24:resumeCV"/>
                    </tbody>
                </table>
            </body>
        </html>
    </xsl:template>

    <!-- Template for each resumeCV element -->
    <xsl:template match="cv24:resumeCV">
        <tr>
            <!-- Create a link around the entire row -->
            <xsl:variable name="cvId" select="cv24:id"/>
            <xsl:variable name="cvDetailLink" select="concat('/cv24/html?id=', $cvId)"/>
            <xsl:attribute name="onclick">window.location.href='<xsl:value-of select="$cvDetailLink"/>';</xsl:attribute>
            <td><xsl:value-of select="cv24:id"/></td>
            <td><xsl:value-of select="cv24:identite"/></td>
            <td><xsl:value-of select="cv24:objectif"/></td>
            <td><xsl:value-of select="cv24:diplome"/></td>
        </tr>
    </xsl:template>
</xsl:stylesheet>
