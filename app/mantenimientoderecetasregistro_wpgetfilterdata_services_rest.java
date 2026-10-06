package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/MantenimientodeRecetasRegistro_WPGetFilterData")
public final  class mantenimientoderecetasregistro_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.mantenimientoderecetasregistro_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV38DDOName;
      AV38DDOName = entity.getDDOName() ;
      String AV36SearchTxt;
      AV36SearchTxt = entity.getSearchTxt() ;
      String AV37SearchTxtTo;
      AV37SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV42OptionsJson = new String[] { "" };
      String [] AV45OptionsDescJson = new String[] { "" };
      String [] AV47OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("mantenimientoderecetasregistro_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.mantenimientoderecetasregistro_wpgetfilterdata worker = new app.mantenimientoderecetasregistro_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV38DDOName,AV36SearchTxt,AV37SearchTxtTo,AV42OptionsJson,AV45OptionsDescJson,AV47OptionIndexesJson );
         app.mantenimientoderecetasregistro_wpgetfilterdata_RESTInterfaceOUT data = new app.mantenimientoderecetasregistro_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV42OptionsJson[0]);
         data.setOptionsDescJson(AV45OptionsDescJson[0]);
         data.setOptionIndexesJson(AV47OptionIndexesJson[0]);
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

