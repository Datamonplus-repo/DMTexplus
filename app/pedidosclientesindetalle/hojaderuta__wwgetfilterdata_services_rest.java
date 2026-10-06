package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/PedidosClienteSinDetalle/HojadeRuta__WWGetFilterData")
public final  class hojaderuta__wwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.pedidosclientesindetalle.hojaderuta__wwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV28DDOName;
      AV28DDOName = entity.getDDOName() ;
      String AV29SearchTxt;
      AV29SearchTxt = entity.getSearchTxt() ;
      String AV30SearchTxtTo;
      AV30SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV31OptionsJson = new String[] { "" };
      String [] AV32OptionsDescJson = new String[] { "" };
      String [] AV33OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("pedidosclientesindetalle.hojaderuta__wwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.pedidosclientesindetalle.hojaderuta__wwgetfilterdata worker = new app.pedidosclientesindetalle.hojaderuta__wwgetfilterdata(remoteHandle, context);
         worker.execute(AV28DDOName,AV29SearchTxt,AV30SearchTxtTo,AV31OptionsJson,AV32OptionsDescJson,AV33OptionIndexesJson );
         app.pedidosclientesindetalle.hojaderuta__wwgetfilterdata_RESTInterfaceOUT data = new app.pedidosclientesindetalle.hojaderuta__wwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV31OptionsJson[0]);
         data.setOptionsDescJson(AV32OptionsDescJson[0]);
         data.setOptionIndexesJson(AV33OptionIndexesJson[0]);
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

