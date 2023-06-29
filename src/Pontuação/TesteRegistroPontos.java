package Pontuação;

import static org.junit.Assert.assertEquals;

public class TesteRegistroPontos {

    public void pontosCriarTopico() {
        Usuario u = new Usuario();
        u.nome = "Dan";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 5);

    }

    public void pontosCriarTopicoVIP() {
        Usuario u = new Usuario();
        u.nome = "Dan";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 25);

    }

    public void pontosCriarTopicoBonusDoDia() {
        Usuario u = new Usuario();
        u.nome = "Dan";
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 15);

    }

    public void pontosCriarTopicoVIPBonusDoDia() {
        Usuario u = new Usuario();
        u.nome = "Dan";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 2;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 50);

    }

}
