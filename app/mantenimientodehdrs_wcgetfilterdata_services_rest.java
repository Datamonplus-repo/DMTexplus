package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/MantenimientodeHDRs_WCGetFilterData")
public final  class mantenimientodehdrs_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.mantenimientodehdrs_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV39DDOName;
      AV39DDOName = entity.getDDOName() ;
      String AV37SearchTxt;
      AV37SearchTxt = entity.getSearchTxt() ;
      String AV38SearchTxtTo;
      AV38SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV43OptionsJson = new String[] { "" };
      String [] AV46OptionsDescJson = new String[] { "" };
      String [] AV48OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("mantenimientodehdrs_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.mantenimientodehdrs_wcgetfilterdata worker = new app.mantenimientodehdrs_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV39DDOName,AV37SearchTxt,AV38SearchTxtTo,AV43OptionsJson,AV46OptionsDescJson,AV48OptionIndexesJson );
         app.mantenimientodehdrs_wcgetfilterdata_RESTInterfaceOUT data = new app.mantenimientodehdrs_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV43OptionsJson[0]);
         data.setOptionsDescJson(AV46OptionsDescJson[0]);
         data.setOptionIndexesJson(AV48OptionIndexesJson[0]);
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

