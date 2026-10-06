package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/ConsultadeProduccion2_WCGetFilterData")
public final  class consultadeproduccion2_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.consultadeproduccion2_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV14DDOName;
      AV14DDOName = entity.getDDOName() ;
      String AV12SearchTxt;
      AV12SearchTxt = entity.getSearchTxt() ;
      String AV13SearchTxtTo;
      AV13SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV18OptionsJson = new String[] { "" };
      String [] AV21OptionsDescJson = new String[] { "" };
      String [] AV23OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("consultadeproduccion2_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.consultadeproduccion2_wcgetfilterdata worker = new app.consultadeproduccion2_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV14DDOName,AV12SearchTxt,AV13SearchTxtTo,AV18OptionsJson,AV21OptionsDescJson,AV23OptionIndexesJson );
         app.consultadeproduccion2_wcgetfilterdata_RESTInterfaceOUT data = new app.consultadeproduccion2_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV18OptionsJson[0]);
         data.setOptionsDescJson(AV21OptionsDescJson[0]);
         data.setOptionIndexesJson(AV23OptionIndexesJson[0]);
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

