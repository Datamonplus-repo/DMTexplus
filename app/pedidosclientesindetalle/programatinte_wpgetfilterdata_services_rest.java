package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/PedidosClienteSinDetalle/ProgramaTinte_WPGetFilterData")
public final  class programatinte_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.pedidosclientesindetalle.programatinte_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV46DDOName;
      AV46DDOName = entity.getDDOName() ;
      String AV47SearchTxt;
      AV47SearchTxt = entity.getSearchTxt() ;
      String AV48SearchTxtTo;
      AV48SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV49OptionsJson = new String[] { "" };
      String [] AV50OptionsDescJson = new String[] { "" };
      String [] AV51OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("pedidosclientesindetalle.programatinte_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.pedidosclientesindetalle.programatinte_wpgetfilterdata worker = new app.pedidosclientesindetalle.programatinte_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV46DDOName,AV47SearchTxt,AV48SearchTxtTo,AV49OptionsJson,AV50OptionsDescJson,AV51OptionIndexesJson );
         app.pedidosclientesindetalle.programatinte_wpgetfilterdata_RESTInterfaceOUT data = new app.pedidosclientesindetalle.programatinte_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV49OptionsJson[0]);
         data.setOptionsDescJson(AV50OptionsDescJson[0]);
         data.setOptionIndexesJson(AV51OptionIndexesJson[0]);
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

