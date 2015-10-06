<!DOCTYPE html>
<html>
    <head>
        <title>${fieldValue(bean: feed, field: "title")}</title>
    </head>
    <body>
        <div><g:link action="list">Back</g:link></div>
        <g:each in="${links}" var="link">
            <div><a href="${link.link}">${fieldValue(bean: link, field: "title")}</a></div>
        </g:each>
    </body>
</html>
