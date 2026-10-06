package app.formulaciontinte ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FormulacionTinte/RecetadeTinte_Agrupacion_WPGetFilterData")
public final  class recetadetinte_agrupacion_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.formulaciontinte.recetadetinte_agrupacion_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV68DDOName;
      AV68DDOName = entity.getDDOName() ;
      String AV66SearchTxt;
      AV66SearchTxt = entity.getSearchTxt() ;
      String AV67SearchTxtTo;
      AV67SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV72OptionsJson = new String[] { "" };
      String [] AV75OptionsDescJson = new String[] { "" };
      String [] AV77OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("formulaciontinte.recetadetinte_agrupacion_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.formulaciontinte.recetadetinte_agrupacion_wpgetfilterdata worker = new app.formulaciontinte.recetadetinte_agrupacion_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV68DDOName,AV66SearchTxt,AV67SearchTxtTo,AV72OptionsJson,AV75OptionsDescJson,AV77OptionIndexesJson );
         app.formulaciontinte.recetadetinte_agrupacion_wpgetfilterdata_RESTInterfaceOUT data = new app.formulaciontinte.recetadetinte_agrupacion_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV72OptionsJson[0]);
         data.setOptionsDescJson(AV75OptionsDescJson[0]);
         data.setOptionIndexesJson(AV77OptionIndexesJson[0]);
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

