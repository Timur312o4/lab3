package lab3;
import lab3.Persons.Buyers;
import lab3.Persons.MainHero;
import lab3.Persons.Trader;
import lab3.Persons.TraderFructs;
import lab3.objects.*;
import lab3.places.*;
import lab3.tovars.FrVeg;
import lab3.tovars.NewsPapers;
import lab3.tovars.Shares;

public class Main {
    public static void main(String[] args){
        Town davilon = Town.DAVILON;
        Town brekhenvil = Town.BREKHENVIL;
        Town grabenberg = Town.GRABENBERG;
        Town sanKomarik = Town.SAN_KOMARIK;
        Money money = new Money("деньги");
        Shares shares = new Shares("акции");
        Stall stall = new Stall("прилавок");

        NewsPapers newspaper = new NewsPapers("газета");
        StockMarket rynokAkz = new StockMarket("рынок акций",shares);
        Market productMarket = new Market("торговый рынок","яблоки,помидоры,картофель,капуста");
        Buyers buyers= new Buyers("покупатели");
        Buyers buyer = new Buyers("покупатель");
        MainHero mainHero = new MainHero("Главный герой","м");
        Trader trader= new Trader("продавец акций",rynokAkz);
        TraderFructs traderFructs = new TraderFructs("продавец фруктов или овощей",productMarket);

        mainHero.vnim(newspaper);
        mainHero.remember(mainHero.getName()+" "+mainHero.sobiralsa(mainHero.buy(shares.getName())));
        shares.fall();
        mainHero.prikid(mainHero.begin());
        mainHero.earn("сколько",money);
        mainHero.underst(mainHero.nahod(mainHero.need(),false,brekhenvil.getName()));
        System.out.println(mainHero.nahod(mainHero.need(),true,davilon.getName()+", " +grabenberg.getName() +", "+ sanKomarik.getName()));//нужно быть в ...
        rynokAkz.be(rynokAkz);
        rynokAkz.trade(shares);
        rynokAkz.otl(productMarket);
        productMarket.tradefr(FrVeg.APPLES);
        productMarket.tradefr(FrVeg.CABBAGES);
        productMarket.tradefr(FrVeg.POTATOES);
        productMarket.tradefr(FrVeg.TOMATOES);
        traderFructs.need("только",traderFructs.razl(stall));
        buyers.csee(traderFructs,traderFructs.trade());
        trader.carry(shares);
        trader.can("единственно",trader.scream(shares.nameCost()));
        buyer.remains(buyer,"только",buyer.scream(" название",shares.getName()));
        buyer.want(buyer.buy(shares));
    }
}
