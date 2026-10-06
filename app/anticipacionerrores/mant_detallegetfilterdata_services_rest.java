package app.anticipacionerrores ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/AnticipacionErrores/MAnt_DetalleGetFilterData")
public final  class mant_detallegetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.anticipacionerrores.mant_detallegetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV62DDOName;
      AV62DDOName = entity.getDDOName() ;
      String AV63SearchTxt;
      AV63SearchTxt = entity.getSearchTxt() ;
      String AV64SearchTxtTo;
      AV64SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV65OptionsJson = new String[] { "" };
      String [] AV66OptionsDescJson = new String[] { "" };
      String [] AV67OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("anticipacionerrores.mant_detallegetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.anticipacionerrores.mant_detallegetfilterdata worker = new app.anticipacionerrores.mant_detallegetfilterdata(remoteHandle, context);
         worker.execute(AV62DDOName,AV63SearchTxt,AV64SearchTxtTo,AV65OptionsJson,AV66OptionsDescJson,AV67OptionIndexesJson );
         app.anticipacionerrores.mant_detallegetfilterdata_RESTInterfaceOUT data = new app.anticipacionerrores.mant_detallegetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV65OptionsJson[0]);
         data.setOptionsDescJson(AV66OptionsDescJson[0]);
         data.setOptionIndexesJson(AV67OptionIndexesJson[0]);
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

