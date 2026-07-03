class DataService {

    private ExternalApi api;

    DataService(ExternalApi api) {
        this.api = api;
    }

    String fetchData() {
        return api.getData();
    }
}