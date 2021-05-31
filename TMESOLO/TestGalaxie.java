public class TestGalaxie{
    public static void main(String[] args){
        System.out.println(ObjCeleste.getNbObjCelestes());
        Asteroide a = new Asteroide();

        System.out.println(a.toString());
        System.out.println(ObjCeleste.getNbObjCelestes());


        Galaxie g = new Galaxie();
        g.ajouter(new Asteroide());
        Etoile e = new Etoile();
        SystemePlanetaire s = new SystemePlanetaire("System1",e,7);
        s.ajouter(new Planete(Nomencalture.getNomPlanete(),e));
        s.ajouter(new Planete(Nomencalture.getNomPlanete(),e));
        s.ajouter(new Planete(Nomencalture.getNomPlanete(),e));
        s.ajouter(new Planete(Nomencalture.getNomPlanete(),e));
        s.ajouter(new Planete(Nomencalture.getNomPlanete(),e));
        s.ajouter(new Planete(Nomencalture.getNomPlanete(),e));
        s.ajouter(new Planete(Nomencalture.getNomPlanete(),e));
        
        System.out.println(s.toString());
        g.ajouter(s);
        
        System.out.println(g.getPlusGrandSpherique());



        

    }
}