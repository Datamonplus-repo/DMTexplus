package app.formulaciontinte ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FormulacionTinte/ConsultadesdeLcontiGetFilterData")
public final  class consultadesdelcontigetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.formulaciontinte.consultadesdelcontigetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV50DDOName;
      AV50DDOName = entity.getDDOName() ;
      String AV48SearchTxt;
      AV48SearchTxt = entity.getSearchTxt() ;
      String AV49SearchTxtTo;
      AV49SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV54OptionsJson = new String[] { "" };
      String [] AV57OptionsDescJson = new String[] { "" };
      String [] AV59OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("formulaciontinte.consultadesdelcontigetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.formulaciontinte.consultadesdelcontigetfilterdata worker = new app.formulaciontinte.consultadesdelcontigetfilterdata(remoteHandle, context);
         worker.execute(AV50DDOName,AV48SearchTxt,AV49SearchTxtTo,AV54OptionsJson,AV57OptionsDescJson,AV59OptionIndexesJson );
         app.formulaciontinte.consultadesdelcontigetfilterdata_RESTInterfaceOUT data = new app.formulaciontinte.consultadesdelcontigetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV54OptionsJson[0]);
         data.setOptionsDescJson(AV57OptionsDescJson[0]);
         data.setOptionIndexesJson(AV59OptionIndexesJson[0]);
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

