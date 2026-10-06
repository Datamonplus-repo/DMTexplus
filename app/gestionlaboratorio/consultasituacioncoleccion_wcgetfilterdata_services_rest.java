package app.gestionlaboratorio ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/GestionLaboratorio/ConsultaSituacionColeccion_WCGetFilterData")
public final  class consultasituacioncoleccion_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.gestionlaboratorio.consultasituacioncoleccion_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV180DDOName;
      AV180DDOName = entity.getDDOName() ;
      String AV178SearchTxt;
      AV178SearchTxt = entity.getSearchTxt() ;
      String AV179SearchTxtTo;
      AV179SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV184OptionsJson = new String[] { "" };
      String [] AV187OptionsDescJson = new String[] { "" };
      String [] AV189OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("gestionlaboratorio.consultasituacioncoleccion_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.gestionlaboratorio.consultasituacioncoleccion_wcgetfilterdata worker = new app.gestionlaboratorio.consultasituacioncoleccion_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV180DDOName,AV178SearchTxt,AV179SearchTxtTo,AV184OptionsJson,AV187OptionsDescJson,AV189OptionIndexesJson );
         app.gestionlaboratorio.consultasituacioncoleccion_wcgetfilterdata_RESTInterfaceOUT data = new app.gestionlaboratorio.consultasituacioncoleccion_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV184OptionsJson[0]);
         data.setOptionsDescJson(AV187OptionsDescJson[0]);
         data.setOptionIndexesJson(AV189OptionIndexesJson[0]);
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

