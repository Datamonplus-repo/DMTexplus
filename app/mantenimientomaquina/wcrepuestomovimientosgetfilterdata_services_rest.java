package app.mantenimientomaquina ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/MantenimientoMaquina/WCRepuestoMovimientosGetFilterData")
public final  class wcrepuestomovimientosgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.mantenimientomaquina.wcrepuestomovimientosgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV36DDOName;
      AV36DDOName = entity.getDDOName() ;
      String AV34SearchTxt;
      AV34SearchTxt = entity.getSearchTxt() ;
      String AV35SearchTxtTo;
      AV35SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV40OptionsJson = new String[] { "" };
      String [] AV43OptionsDescJson = new String[] { "" };
      String [] AV45OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("mantenimientomaquina.wcrepuestomovimientosgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.mantenimientomaquina.wcrepuestomovimientosgetfilterdata worker = new app.mantenimientomaquina.wcrepuestomovimientosgetfilterdata(remoteHandle, context);
         worker.execute(AV36DDOName,AV34SearchTxt,AV35SearchTxtTo,AV40OptionsJson,AV43OptionsDescJson,AV45OptionIndexesJson );
         app.mantenimientomaquina.wcrepuestomovimientosgetfilterdata_RESTInterfaceOUT data = new app.mantenimientomaquina.wcrepuestomovimientosgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV40OptionsJson[0]);
         data.setOptionsDescJson(AV43OptionsDescJson[0]);
         data.setOptionIndexesJson(AV45OptionIndexesJson[0]);
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

