package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/RecuentoInven_WCGetFilterData")
public final  class recuentoinven_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.recuentoinven_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV24DDOName;
      AV24DDOName = entity.getDDOName() ;
      String AV22SearchTxt;
      AV22SearchTxt = entity.getSearchTxt() ;
      String AV23SearchTxtTo;
      AV23SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV28OptionsJson = new String[] { "" };
      String [] AV31OptionsDescJson = new String[] { "" };
      String [] AV33OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("recuentoinven_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.recuentoinven_wcgetfilterdata worker = new app.recuentoinven_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV24DDOName,AV22SearchTxt,AV23SearchTxtTo,AV28OptionsJson,AV31OptionsDescJson,AV33OptionIndexesJson );
         app.recuentoinven_wcgetfilterdata_RESTInterfaceOUT data = new app.recuentoinven_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV28OptionsJson[0]);
         data.setOptionsDescJson(AV31OptionsDescJson[0]);
         data.setOptionIndexesJson(AV33OptionIndexesJson[0]);
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

