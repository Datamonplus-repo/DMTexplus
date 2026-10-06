package app.formulaciontinte ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FormulacionTinte/CierreRecetasTinteIncidencias_WCGetFilterData")
public final  class cierrerecetastinteincidencias_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.formulaciontinte.cierrerecetastinteincidencias_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV40DDOName;
      AV40DDOName = entity.getDDOName() ;
      String AV41SearchTxt;
      AV41SearchTxt = entity.getSearchTxt() ;
      String AV42SearchTxtTo;
      AV42SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV43OptionsJson = new String[] { "" };
      String [] AV44OptionsDescJson = new String[] { "" };
      String [] AV45OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("formulaciontinte.cierrerecetastinteincidencias_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.formulaciontinte.cierrerecetastinteincidencias_wcgetfilterdata worker = new app.formulaciontinte.cierrerecetastinteincidencias_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV40DDOName,AV41SearchTxt,AV42SearchTxtTo,AV43OptionsJson,AV44OptionsDescJson,AV45OptionIndexesJson );
         app.formulaciontinte.cierrerecetastinteincidencias_wcgetfilterdata_RESTInterfaceOUT data = new app.formulaciontinte.cierrerecetastinteincidencias_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV43OptionsJson[0]);
         data.setOptionsDescJson(AV44OptionsDescJson[0]);
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

