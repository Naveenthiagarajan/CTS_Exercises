class DataService {

    private ExternalApi api;

    DataService(ExternalApi api) {
        this.api = api;
    }

    void process() {
        api.sendData("Hello");
    }
}