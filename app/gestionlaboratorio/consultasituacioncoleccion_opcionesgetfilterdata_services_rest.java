package app.gestionlaboratorio ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/GestionLaboratorio/ConsultaSituacionColeccion_OpcionesGetFilterData")
public final  class consultasituacioncoleccion_opcionesgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.gestionlaboratorio.consultasituacioncoleccion_opcionesgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV28DDOName;
      AV28DDOName = entity.getDDOName() ;
      String AV26SearchTxt;
      AV26SearchTxt = entity.getSearchTxt() ;
      String AV27SearchTxtTo;
      AV27SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV32OptionsJson = new String[] { "" };
      String [] AV35OptionsDescJson = new String[] { "" };
      String [] AV37OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("gestionlaboratorio.consultasituacioncoleccion_opcionesgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.gestionlaboratorio.consultasituacioncoleccion_opcionesgetfilterdata worker = new app.gestionlaboratorio.consultasituacioncoleccion_opcionesgetfilterdata(remoteHandle, context);
         worker.execute(AV28DDOName,AV26SearchTxt,AV27SearchTxtTo,AV32OptionsJson,AV35OptionsDescJson,AV37OptionIndexesJson );
         app.gestionlaboratorio.consultasituacioncoleccion_opcionesgetfilterdata_RESTInterfaceOUT data = new app.gestionlaboratorio.consultasituacioncoleccion_opcionesgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV32OptionsJson[0]);
         data.setOptionsDescJson(AV35OptionsDescJson[0]);
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

