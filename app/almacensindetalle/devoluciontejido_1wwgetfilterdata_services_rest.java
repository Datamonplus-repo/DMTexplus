package app.almacensindetalle ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/AlmacenSinDetalle/DevolucionTejido_1WWGetFilterData")
public final  class devoluciontejido_1wwgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.almacensindetalle.devoluciontejido_1wwgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV68DDOName;
      AV68DDOName = entity.getDDOName() ;
      String AV69SearchTxt;
      AV69SearchTxt = entity.getSearchTxt() ;
      String AV70SearchTxtTo;
      AV70SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV71OptionsJson = new String[] { "" };
      String [] AV72OptionsDescJson = new String[] { "" };
      String [] AV73OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("almacensindetalle.devoluciontejido_1wwgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.almacensindetalle.devoluciontejido_1wwgetfilterdata worker = new app.almacensindetalle.devoluciontejido_1wwgetfilterdata(remoteHandle, context);
         worker.execute(AV68DDOName,AV69SearchTxt,AV70SearchTxtTo,AV71OptionsJson,AV72OptionsDescJson,AV73OptionIndexesJson );
         app.almacensindetalle.devoluciontejido_1wwgetfilterdata_RESTInterfaceOUT data = new app.almacensindetalle.devoluciontejido_1wwgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV71OptionsJson[0]);
         data.setOptionsDescJson(AV72OptionsDescJson[0]);
         data.setOptionIndexesJson(AV73OptionIndexesJson[0]);
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

