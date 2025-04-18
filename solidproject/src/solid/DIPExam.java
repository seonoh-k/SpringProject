package solid;

public class DIPExam {

}

interface DatabaseService {
    void saveData(String data);
}

class MySQLService implements DatabaseService {
    public void saveData(String data) { /* MySQL 저장 */ }
}

class MongoDBService implements DatabaseService {
    public void saveData(String data) { /* MongoDB 저장 */ }
}


//@Controller
class Client {
	
//	@Autowired
    private DatabaseService db;
    
    Client(DatabaseService db) {
        this.db = db;
    }
}