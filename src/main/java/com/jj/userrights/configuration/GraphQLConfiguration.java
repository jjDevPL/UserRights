package com.jj.userrights.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfiguration {

 /*   @Bean
    GraphQL newONe() throws IOException {
        String schemaName="graphql/schema.graphqls";

        String data = "";
        ClassPathResource resource = new ClassPathResource(schemaName);
        try {
            byte[] dataArr = FileCopyUtils.copyToByteArray(resource.getInputStream());
            data = new String(dataArr, StandardCharsets.UTF_8);
        } catch (IOException e) {
            // do whatever
            int z=90;
            z++;
        }

        SchemaParserBuilder parser = SchemaParser.newParser();
        parser.schemaString("type Query {\n" +
            "    userDefault: UserRights\n" +
            "    greeting: String\n" +
            "\n" +
            "}\n" +
            "#it is like updateds commands\n" +
            "type Mutation {\n" +
            "    newRights(input : String!) : UserRights\n" +
            "}\n" +
            "\n" +
            "type UserRights {\n" +
            "    id: Int\n" +
            "    name: String\n" +
            "}\n" +
            "\n" +
            "input UserRightsInput {\n" +
            "    name: String!\n" +
            "}");
        GraphQLSchema schema = parser.build().makeExecutableSchema();


        return GraphQL.newGraphQL(schema)
            .queryExecutionStrategy(new AsyncExecutionStrategy(new ExceptionHandler()))
            .mutationExecutionStrategy(new AsyncExecutionStrategy(new ExceptionHandler()))
            .build();
        *//*return null;*//*
    }*/


}
