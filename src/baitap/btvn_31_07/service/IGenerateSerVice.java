package baitap.btvn_31_07.service;

public interface IGenerateSerVice<E> {
    void create();

    void update();

    void display();

    E findById();
}
