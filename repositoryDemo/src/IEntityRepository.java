public interface IEntityRepository <T extends IEntity>{     //GENERIC CONSTRAINTS: Generic kısıt
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
