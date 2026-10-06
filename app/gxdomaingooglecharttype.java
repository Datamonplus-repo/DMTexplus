package app ;
import app.*;
import com.genexus.*;

public final  class gxdomaingooglecharttype
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"BarChart"), "Bar Chart");
      domain.put(new String((String)"ColumnChart"), "Column Chart");
      domain.put(new String((String)"LineChart"), "Line Chart");
      domain.put(new String((String)"PieChart"), "Pie Chart");
      domain.put(new String((String)"ScatterChart"), "Scatter Chart");
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

