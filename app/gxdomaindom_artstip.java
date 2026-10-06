package app ;
import app.*;
import com.genexus.*;

public final  class gxdomaindom_artstip
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"TR"), "Maqs Tricot");
      domain.put(new String((String)"RA"), "Maqs Rachel (Encajes)");
      domain.put(new String((String)"CI"), "Maqs Circulares");
      domain.put(new String((String)"RE"), "Rectilíneas (Cuellos)");
      domain.put(new String((String)""), "Fuera de uso");
      domain.put(new String((String)"RY"), "Fuera de uso");
      domain.put(new String((String)"PA"), "Fuera de uso");
      domain.put(new String((String)"TP"), "Tejido Plano");
      domain.put(new String((String)"FI"), "Fuera de uso");
      domain.put(new String((String)"IN"), "Fuera de uso");
      domain.put(new String((String)"UR"), "Urdimbre");
      domain.put(new String((String)"AR"), "Arbol");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        String key )
   {
      if (domain.containsKey( key.trim() ))
      {
         return httpContext != null ? httpContext.getMessage((String)domain.get( key.trim() )) : (String)domain.get( key.trim() );
      }
      else
      {
         return "";
      }
   }

   public static GXSimpleCollection<String> getValues( )
   {
      GXSimpleCollection<String> value = new GXSimpleCollection<String>(String.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((String) itr.next());
      }
      return value;
   }

}

