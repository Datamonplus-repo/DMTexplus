package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/HistoricodeRecetas_AgrupacionAcabados_WPGetFilterData")
public final  class historicoderecetas_agrupacionacabados_wpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.historicoderecetas_agrupacionacabados_wpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV34DDOName;
      AV34DDOName = entity.getDDOName() ;
      String AV32SearchTxt;
      AV32SearchTxt = entity.getSearchTxt() ;
      String AV33SearchTxtTo;
      AV33SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV38OptionsJson = new String[] { "" };
      String [] AV41OptionsDescJson = new String[] { "" };
      String [] AV43OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("historicoderecetas_agrupacionacabados_wpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.historicoderecetas_agrupacionacabados_wpgetfilterdata worker = new app.historicoderecetas_agrupacionacabados_wpgetfilterdata(remoteHandle, context);
         worker.execute(AV34DDOName,AV32SearchTxt,AV33SearchTxtTo,AV38OptionsJson,AV41OptionsDescJson,AV43OptionIndexesJson );
         app.historicoderecetas_agrupacionacabados_wpgetfilterdata_RESTInterfaceOUT data = new app.historicoderecetas_agrupacionacabados_wpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV38OptionsJson[0]);
         data.setOptionsDescJson(AV41OptionsDescJson[0]);
         data.setOptionIndexesJson(AV43OptionIndexesJson[0]);
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

