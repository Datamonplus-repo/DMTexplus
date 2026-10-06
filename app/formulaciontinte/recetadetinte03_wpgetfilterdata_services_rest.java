package app.formulaciontinte ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FormulacionTinte/RecetadeTinte03_WPGetFilterData")
public final  class recetadetinte03_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.formulaciontinte.recetadetinte03_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV24DDOName;
      AV24DDOName = entity.getDDOName() ;
      String AV25SearchTxt;
      AV25SearchTxt = entity.getSearchTxt() ;
      String AV26SearchTxtTo;
      AV26SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV27OptionsJson = new String[] { "" };
      String [] AV28OptionsDescJson = new String[] { "" };
      String [] AV29OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("formulaciontinte.recetadetinte03_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.formulaciontinte.recetadetinte03_wpgetfilterdata worker = new app.formulaciontinte.recetadetinte03_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV24DDOName,AV25SearchTxt,AV26SearchTxtTo,AV27OptionsJson,AV28OptionsDescJson,AV29OptionIndexesJson );
         app.formulaciontinte.recetadetinte03_wpgetfilterdata_RESTInterfaceOUT data = new app.formulaciontinte.recetadetinte03_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV27OptionsJson[0]);
         data.setOptionsDescJson(AV28OptionsDescJson[0]);
         data.setOptionIndexesJson(AV29OptionIndexesJson[0]);
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

