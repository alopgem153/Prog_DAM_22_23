package utils;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import modelo.Address;
import modelo.Coche;
import modelo.Employee;
import modelo.Grupo;
import modelo.Grupo2;
import modelo.Persona;

public class jsonUtils {


    public static Employee LeerEmpleadoFromJsonFile(String relativePathFile)
    {

        //File ficheroEmpleado = new File("src/recursos/employee.txt");
		File ficheroEmpleado = new File(relativePathFile);
        //byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));
		
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		
		//convert json string to object
		Employee emp = null;
        try {
            emp = objectMapper.readValue(ficheroEmpleado, Employee.class);
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
        System.out.println("Employee Object\n"+emp);
        return emp;
		
		
		 
    }

	public static List<Employee> LeerListEmpleadoFromJsonFile(String relativePathFile)
	{
		File ficheroEmpleado = new File(relativePathFile);

		ObjectMapper objectMapper = new ObjectMapper();

		List<Employee> listaEmpleados = null;
		try {
            listaEmpleados = objectMapper.readValue(ficheroEmpleado,  new TypeReference<List<Employee>>(){});
        } catch (IOException e) {
            
            e.printStackTrace();
        }

		return listaEmpleados;
	}

	/**
	 * Convierte un objeto en un Json
	 */
    public static void convertToJson()
    {
        try 
        {
            ObjectMapper objectMapper = new ObjectMapper();
            //convert Object to json string
            Employee emp1 = createEmployee();
            //configure Object mapper for pretty print
            objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        
            
			//Puedo imprimirlo por consola 
            //writing to console, can write to any output stream such as file
            //StringWriter stringEmp = new StringWriter();
            //Sacar por consola el Json
            //objectMapper.writeValue(stringEmp, emp1);
            //System.out.println("Employee JSON is\n"+stringEmp);

			//Puedo guardarlo en un fichero
            File fileEmp1 = new File("src/recursos/empleado1.txt");
            objectMapper.writeValue(fileEmp1, emp1);
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }

    public static Employee createEmployee() {

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Alfonso");
		emp.setPermanent(false);
		emp.setPhoneNumbers(new long[] { 123456, 987654 });
		emp.setRole("Manager");

		Address add = new Address();
		add.setCity("Bangalore");
		add.setStreet("BTM 1st Stage");
		add.setZipcode(560100);
		emp.setAddress(add);

		List<String> cities = new ArrayList<String>();
		cities.add("Los Angeles");
		cities.add("New York");
		emp.setCities(cities);

		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", "1000 Rs");
		props.put("age", "28 years");
		emp.setProperties(props);

		return emp;
	}
    /*
    	
		//writing to console, can write to any output stream such as file
		StringWriter stringEmp = new StringWriter();
		objectMapper.writeValue(stringEmp, emp1);
		System.out.println("Employee JSON is\n"+stringEmp);
		
		
		//converting json to Map
		byte[] mapData = Files.readAllBytes(Paths.get("data.txt"));
		Map<String,String> myMap = new HashMap<String, String>();
		
		myMap = objectMapper.readValue(mapData, HashMap.class);
		System.out.println("Map is: "+myMap);
		//another way
		myMap = objectMapper.readValue(mapData, new TypeReference<HashMap<String,String>>() {});
		System.out.println("Map using TypeReference: "+myMap);
		
		//read JSON like DOM Parser
		JsonNode rootNode = objectMapper.readTree(jsonData);
		JsonNode idNode = rootNode.path("id");
		System.out.println("id = "+idNode.asInt());
		JsonNode phoneNosNode = rootNode.path("phoneNumbers");
		Iterator<JsonNode> elements = phoneNosNode.elements();
		while(elements.hasNext()){
			JsonNode phone = elements.next();
			System.out.println("Phone No = "+phone.asLong());
		}
		
		//update JSON data
		((ObjectNode) rootNode).put("id", 500);
		//add new key value
		((ObjectNode) rootNode).put("test", "test value");
		//remove existing key
		((ObjectNode) rootNode).remove("role");
		((ObjectNode) rootNode).remove("properties");
		objectMapper.writeValue(new File("updated_emp.txt"), rootNode);
        */
    

		public static Coche leerJsonCoche(String path)
		{
			Coche coche = null;
			try
			{
				File ficheroCoche = new File(path);

				ObjectMapper mapper = new ObjectMapper();

				try
				{
					coche = mapper.readValue(ficheroCoche, Coche.class);
				}
				catch(StreamReadException streamReadException)
				{
					System.out.println(streamReadException);
				}
				
			}
			catch(IOException ioException)
			{
				System.out.println(ioException);
			}

			return coche;
		}


		public static List<Coche> leerArrayCochesFromJson(String path)
		{
			List<Coche> listaCoches = new ArrayList<>(); 

			try {
				File ficheroarray = new File(path);

				ObjectMapper mapeer = new ObjectMapper();

				try 
				{
					listaCoches = mapeer.readValue(ficheroarray, new TypeReference<List<Coche>>() {});
				}
				catch(StreamReadException streamReadException)
				{
					System.out.println(streamReadException);
				}
				catch(IOException ioException)
				{
					System.out.println(ioException);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}

			return listaCoches;

		}

		public static void CrearJsonCoches(List<Coche> lista) 
		{
			try {
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

				File fichero = new File("src/recursos/todosCoches.json");

				objectMapper.writeValue(fichero, lista);
			} catch (Exception e) {
				System.out.println(e);
			}

		}


		public static Grupo LeerFicheroPersonas()
		{
			Grupo grupo = null;
			
			try {
				File fichero = new File("src/recursos/personas.json");

				ObjectMapper mapper = new ObjectMapper();

				grupo = mapper.readValue(fichero, Grupo.class);

			} catch (Exception e) {
				System.out.println(e);
			}

			return grupo;

		}


		public static Grupo2 LeerFicheroPersonas2()
		{
			Grupo2 grupo = null;
			
			try {
				File fichero = new File("src/recursos/personas.json");

				ObjectMapper mapper = new ObjectMapper();

				grupo = mapper.readValue(fichero, Grupo2.class);

			} catch (Exception e) {
				System.out.println(e);
			}

			return grupo;

		}

		public static void GuardarFicheroGrupo(Grupo grupoDe24) 
		{
			try {
				File fichero = new File("src/recursos/GrupoDe24.json");
				ObjectMapper mapper = new ObjectMapper();

				mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

				mapper.writeValue(fichero, grupoDe24);


			} catch (Exception e) {
				System.out.println(e);
			}

		}

        public static void crearFicheroDiccionario(Map<String, Persona> diccionarioPersonas) 
		{
			try {
				File fichero = new File("src/recursos/diccinarioPersonas2.json");

				ObjectMapper mapper = new ObjectMapper();

				mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

				mapper.writeValue(fichero, diccionarioPersonas);

			} catch (Exception e) {
				System.out.println(e);
			}
        }


		public static Map<String, Persona> leerFicheroDiccionarioPersona(String path)
		{
			Map<String, Persona> diccionario = null;

			try {
				
				File fichero = new File(path);

				ObjectMapper mapper = new ObjectMapper();

				TypeReference<Map<String, Persona>> type = new TypeReference<>() {
					
				};

				// diccionario = mapper.readValue(fichero, 
				// 					new TypeReference<Map<String, Persona>>() {});

				diccionario = mapper.readValue(fichero, type);

			} catch (Exception e) {
				System.out.println(e);
			}

			return diccionario;
		}
}
