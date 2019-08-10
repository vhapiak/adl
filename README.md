# Architecture Description Language

## Basic example

### ADL code:
```
interface IContextRoutine {
    void execute();
}

interface IContext {
    void capture();
    void process(IContextRoutine routine);
    void release();
}

interface IContextManager {
    IContext getContext();
}

interface IComponent {
    void process(IContextManager manager);
}

behavior {

    IContextManager manager;
    IComponent component;
    component.process(manager) {
        IContextRoutine routine;

        IContext context = manager.getContext();
        context.capture();

        context.process(routine) {
            routine.execute();
        };

        context.release();
    };

}
```

### Result diagram
![Result](doc/example.png)