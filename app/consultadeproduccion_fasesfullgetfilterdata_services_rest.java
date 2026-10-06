package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/ConsultadeProduccion_FasesFullGetFilterData")
public final  class consultadeproduccion_fasesfullgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.consultadeproduccion_fasesfullgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV32DDOName;
      AV32DDOName = entity.getDDOName() ;
      String AV30SearchTxt;
      AV30SearchTxt = entity.getSearchTxt() ;
      String AV31SearchTxtTo;
      AV31SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV36OptionsJson = new String[] { "" };
      String [] AV39OptionsDescJson = new String[] { "" };
      String [] AV41OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("consultadeproduccion_fasesfullgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.consultadeproduccion_fasesfullgetfilterdata worker = new app.consultadeproduccion_fasesfullgetfilterdata(remoteHandle, context);
         worker.execute(AV32DDOName,AV30SearchTxt,AV31SearchTxtTo,AV36OptionsJson,AV39OptionsDescJson,AV41OptionIndexesJson );
         app.consultadeproduccion_fasesfullgetfilterdata_RESTInterfaceOUT data = new app.consultadeproduccion_fasesfullgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV36OptionsJson[0]);
         data.setOptionsDescJson(AV39OptionsDescJson[0]);
         data.setOptionIndexesJson(AV41OptionIndexesJson[0]);
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

