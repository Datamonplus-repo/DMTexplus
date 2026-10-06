package app.recetasdeacabados ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/RecetasDeAcabados/RecetadeAcabado_Cierre_WCGetFilterData")
public final  class recetadeacabado_cierre_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.recetasdeacabados.recetadeacabado_cierre_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV130DDOName;
      AV130DDOName = entity.getDDOName() ;
      String AV128SearchTxt;
      AV128SearchTxt = entity.getSearchTxt() ;
      String AV129SearchTxtTo;
      AV129SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV134OptionsJson = new String[] { "" };
      String [] AV137OptionsDescJson = new String[] { "" };
      String [] AV139OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("recetasdeacabados.recetadeacabado_cierre_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.recetasdeacabados.recetadeacabado_cierre_wcgetfilterdata worker = new app.recetasdeacabados.recetadeacabado_cierre_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV130DDOName,AV128SearchTxt,AV129SearchTxtTo,AV134OptionsJson,AV137OptionsDescJson,AV139OptionIndexesJson );
         app.recetasdeacabados.recetadeacabado_cierre_wcgetfilterdata_RESTInterfaceOUT data = new app.recetasdeacabados.recetadeacabado_cierre_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV134OptionsJson[0]);
         data.setOptionsDescJson(AV137OptionsDescJson[0]);
         data.setOptionIndexesJson(AV139OptionIndexesJson[0]);
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

