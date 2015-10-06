<!DOCTYPE html>
<html>
    <head>
        <title>RSS Feeds</title>
    </head>
    <body>
        <div><g:link action="create">Add RSS Feed</g:link></div>
        <g:each in="${feeds}" var="feed">
            <div><g:link action="show" id="${feed.id}">${fieldValue(bean: feed, field: "title")}</g:link></div>
        </g:each>
    </body>
</html>
