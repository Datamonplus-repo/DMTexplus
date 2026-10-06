package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/PedidosClienteSinDetalle/HojadeRuta___Piezas_WCGetFilterData")
public final  class hojaderuta___piezas_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.pedidosclientesindetalle.hojaderuta___piezas_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV32DDOName;
      AV32DDOName = entity.getDDOName() ;
      String AV33SearchTxt;
      AV33SearchTxt = entity.getSearchTxt() ;
      String AV34SearchTxtTo;
      AV34SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV35OptionsJson = new String[] { "" };
      String [] AV36OptionsDescJson = new String[] { "" };
      String [] AV37OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("pedidosclientesindetalle.hojaderuta___piezas_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.pedidosclientesindetalle.hojaderuta___piezas_wcgetfilterdata worker = new app.pedidosclientesindetalle.hojaderuta___piezas_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV32DDOName,AV33SearchTxt,AV34SearchTxtTo,AV35OptionsJson,AV36OptionsDescJson,AV37OptionIndexesJson );
         app.pedidosclientesindetalle.hojaderuta___piezas_wcgetfilterdata_RESTInterfaceOUT data = new app.pedidosclientesindetalle.hojaderuta___piezas_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV35OptionsJson[0]);
         data.setOptionsDescJson(AV36OptionsDescJson[0]);
         data.setOptionIndexesJson(AV37OptionIndexesJson[0]);
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

