# FlexiProfiler

FlexiProfiler is a desktop application built with Java and JavaFX for importing and exploring runtime performance datasets.

## Features

**Phase 1** delivers a stable foundation and a usable dashboard:

* JavaFX UI for CSV/JSON dataset imports
* Import hook for wiring in custom parsers or analysis logic
* Extension points for future visualizations and profiling features
* Reproducible Maven build and run process

What’s **not** included in this phase:

* Profiling agents or collectors
* Persistent storage (data lives only in memory)
* Advanced analytics and charts (planned for later phases)

---

## Build & Run

FlexiProfiler uses the included Maven wrapper. No manual JavaFX setup is required if you run through Maven.

On **Windows**:

```powershell
.\mvnw.cmd clean javafx:run
```

On **macOS/Linux**:

```bash
./mvnw clean javafx:run
```

This will build the project and launch the JavaFX dashboard in one step.

---

## Development

1. Import the project as a Maven project in your IDE (IntelliJ, Eclipse, VS Code).
2. Use JDK 17 or later (Used JDK 24 for development).
3. Run with the Maven wrapper (`mvnw javafx:run`).

Main entry points for extending functionality:

* `com.aech.flexiprofiler.ui.DashboardController`
* `src/main/resources/com/aech/flexiprofiler/Dashboard.fxml`

---

## Usage

Start the application with the Maven command and use the dashboard to load datasets. Extend functionality by modifying controllers or the dashboard FXML.
```powershell
.\mvnw.cmd clean javafx:run
```
or
```bash
./mvnw clean javafx:run
```

---

## Contributing

Contributions are welcome:

* Fork the repository and create a feature branch
* Open a pull request with your changes
* Ensure the project builds cleanly with Maven

---

## License

See the [LICENSE](LICENSE) file for details.
