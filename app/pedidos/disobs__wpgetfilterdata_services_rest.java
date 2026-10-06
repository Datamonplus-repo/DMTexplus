package app.pedidos ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Pedidos/DisObs__WPGetFilterData")
public final  class disobs__wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.pedidos.disobs__wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV26DDOName;
      AV26DDOName = entity.getDDOName() ;
      String AV27SearchTxt;
      AV27SearchTxt = entity.getSearchTxt() ;
      String AV28SearchTxtTo;
      AV28SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV29OptionsJson = new String[] { "" };
      String [] AV30OptionsDescJson = new String[] { "" };
      String [] AV31OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("pedidos.disobs__wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.pedidos.disobs__wpgetfilterdata worker = new app.pedidos.disobs__wpgetfilterdata(remoteHandle, context);
         worker.execute(AV26DDOName,AV27SearchTxt,AV28SearchTxtTo,AV29OptionsJson,AV30OptionsDescJson,AV31OptionIndexesJson );
         app.pedidos.disobs__wpgetfilterdata_RESTInterfaceOUT data = new app.pedidos.disobs__wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV29OptionsJson[0]);
         data.setOptionsDescJson(AV30OptionsDescJson[0]);
         data.setOptionIndexesJson(AV31OptionIndexesJson[0]);
         builder = Response.okWrapped(data);
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      catch ( Exception e )
      {
         cleanup();
         throw e;
      }
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

}

