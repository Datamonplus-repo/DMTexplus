package app.asyncbatch ;
import app.*;
import com.genexus.*;

public final  class gxdomainbatchjobstatus
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"WAINTING"), "Aguarde");
      domain.put(new String((String)"PROCESSING"), "Processando");
      domain.put(new String((String)"SUCCESS"), "Sucesso");
      domain.put(new String((String)"ERROR"), "Error");
      domain.put(new String((String)"DONE"), "Finalizado");
      domain.put(new String((String)"DONE_ERR"), "Finalizado con errors");
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

