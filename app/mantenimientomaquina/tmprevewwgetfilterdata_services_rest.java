package app.mantenimientomaquina ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/MantenimientoMaquina/TMPreveWWGetFilterData")
public final  class tmprevewwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.mantenimientomaquina.tmprevewwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV46DDOName;
      AV46DDOName = entity.getDDOName() ;
      String AV44SearchTxt;
      AV44SearchTxt = entity.getSearchTxt() ;
      String AV45SearchTxtTo;
      AV45SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV50OptionsJson = new String[] { "" };
      String [] AV53OptionsDescJson = new String[] { "" };
      String [] AV55OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("mantenimientomaquina.tmprevewwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.mantenimientomaquina.tmprevewwgetfilterdata worker = new app.mantenimientomaquina.tmprevewwgetfilterdata(remoteHandle, context);
         worker.execute(AV46DDOName,AV44SearchTxt,AV45SearchTxtTo,AV50OptionsJson,AV53OptionsDescJson,AV55OptionIndexesJson );
         app.mantenimientomaquina.tmprevewwgetfilterdata_RESTInterfaceOUT data = new app.mantenimientomaquina.tmprevewwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV50OptionsJson[0]);
         data.setOptionsDescJson(AV53OptionsDescJson[0]);
         data.setOptionIndexesJson(AV55OptionIndexesJson[0]);
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

