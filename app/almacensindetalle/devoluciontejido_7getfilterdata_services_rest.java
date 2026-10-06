package app.almacensindetalle ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/AlmacenSinDetalle/DevolucionTejido_7GetFilterData")
public final  class devoluciontejido_7getfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.almacensindetalle.devoluciontejido_7getfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV67DDOName;
      AV67DDOName = entity.getDDOName() ;
      String AV68SearchTxt;
      AV68SearchTxt = entity.getSearchTxt() ;
      String AV69SearchTxtTo;
      AV69SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV70OptionsJson = new String[] { "" };
      String [] AV71OptionsDescJson = new String[] { "" };
      String [] AV72OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("almacensindetalle.devoluciontejido_7getfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.almacensindetalle.devoluciontejido_7getfilterdata worker = new app.almacensindetalle.devoluciontejido_7getfilterdata(remoteHandle, context);
         worker.execute(AV67DDOName,AV68SearchTxt,AV69SearchTxtTo,AV70OptionsJson,AV71OptionsDescJson,AV72OptionIndexesJson );
         app.almacensindetalle.devoluciontejido_7getfilterdata_RESTInterfaceOUT data = new app.almacensindetalle.devoluciontejido_7getfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV70OptionsJson[0]);
         data.setOptionsDescJson(AV71OptionsDescJson[0]);
         data.setOptionIndexesJson(AV72OptionIndexesJson[0]);
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

