package app.pedidos ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Pedidos/DisAlb____WWGetFilterData")
public final  class disalb____wwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.pedidos.disalb____wwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV56DDOName;
      AV56DDOName = entity.getDDOName() ;
      String AV57SearchTxt;
      AV57SearchTxt = entity.getSearchTxt() ;
      String AV58SearchTxtTo;
      AV58SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV59OptionsJson = new String[] { "" };
      String [] AV60OptionsDescJson = new String[] { "" };
      String [] AV61OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("pedidos.disalb____wwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.pedidos.disalb____wwgetfilterdata worker = new app.pedidos.disalb____wwgetfilterdata(remoteHandle, context);
         worker.execute(AV56DDOName,AV57SearchTxt,AV58SearchTxtTo,AV59OptionsJson,AV60OptionsDescJson,AV61OptionIndexesJson );
         app.pedidos.disalb____wwgetfilterdata_RESTInterfaceOUT data = new app.pedidos.disalb____wwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV59OptionsJson[0]);
         data.setOptionsDescJson(AV60OptionsDescJson[0]);
         data.setOptionIndexesJson(AV61OptionIndexesJson[0]);
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

