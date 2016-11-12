package module10.practice;

import java.util.Map;

public class PersonController1 {

    private static PersonDAO personDAO = new PersonDAOImpl();

//    public String save(Map<String, String> requestParams) throws PersenExeption {
//        if (!requestParams.containsKey("firstName")) {
//            throw new PersenExeption("Отсутствует обязательный параметр \"Имя\"");
//
//        }
//        if (requestParams.containsKey("email")) {
//            throw new PersenExeption("Отсутствует обязательны параметр \"Email\"");
//        }
//        final String firstName = requestParams.get("firstName");
//        final String email = requestParams.get("email");
//
//        final String lastName = checkForNull(requestParams, "lastName");
////        if (requestParams.get("lastName") != null) {
////            lastName = requestParams.get("lastName");
////        } else {
////            lastName = "";
////        }
//
//    public String findByEmail(Map<String, String> requestParams) throws PersenExeption {
//        if (!requestParams.containsKey("email")) {
//            throw new PersenExeption("Отсутсвет обзательный параметр \"email\"");
//        }
//        final String email = requestParams.get("email");
//
//        Person person = personDAO.findByEmail(email);
//        if (person == null) {
//            throw new PersenExeption("В базе нет персоны с таким email");
//        }
//        return person.toString();
//    }
//
//    private String checkForNull(Map<String, String> requestParams, String param) {
//        String res;
//
//        if (requestParams.get(param) != null) {
//            res = requestParams.get(param);
//        } else {
//            res = "";
//        }
//        return res;
//    }
}
