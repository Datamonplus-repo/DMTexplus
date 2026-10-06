package app.produccion ;
import app.*;
import com.genexus.*;

public final  class gxdomaininputtype
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"button"), "button");
      domain.put(new String((String)"color"), "color");
      domain.put(new String((String)"date"), "date");
      domain.put(new String((String)"file"), "File");
      domain.put(new String((String)"hidden"), "Hidden");
      domain.put(new String((String)"month"), "Month");
      domain.put(new String((String)"radio"), "Radio");
      domain.put(new String((String)"password"), "Password");
      domain.put(new String((String)"range"), "Range");
      domain.put(new String((String)"tel"), "Tel");
      domain.put(new String((String)"week"), "Week");
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

