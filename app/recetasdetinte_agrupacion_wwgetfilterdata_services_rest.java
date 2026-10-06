package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/RecetasdeTinte_Agrupacion_WWGetFilterData")
public final  class recetasdetinte_agrupacion_wwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.recetasdetinte_agrupacion_wwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV30DDOName;
      AV30DDOName = entity.getDDOName() ;
      String AV28SearchTxt;
      AV28SearchTxt = entity.getSearchTxt() ;
      String AV29SearchTxtTo;
      AV29SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV34OptionsJson = new String[] { "" };
      String [] AV37OptionsDescJson = new String[] { "" };
      String [] AV39OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("recetasdetinte_agrupacion_wwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.recetasdetinte_agrupacion_wwgetfilterdata worker = new app.recetasdetinte_agrupacion_wwgetfilterdata(remoteHandle, context);
         worker.execute(AV30DDOName,AV28SearchTxt,AV29SearchTxtTo,AV34OptionsJson,AV37OptionsDescJson,AV39OptionIndexesJson );
         app.recetasdetinte_agrupacion_wwgetfilterdata_RESTInterfaceOUT data = new app.recetasdetinte_agrupacion_wwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV34OptionsJson[0]);
         data.setOptionsDescJson(AV37OptionsDescJson[0]);
         data.setOptionIndexesJson(AV39OptionIndexesJson[0]);
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

