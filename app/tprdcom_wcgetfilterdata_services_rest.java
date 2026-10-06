package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TPRDCOM_WCGetFilterData")
public final  class tprdcom_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.tprdcom_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV21DDOName;
      AV21DDOName = entity.getDDOName() ;
      String AV19SearchTxt;
      AV19SearchTxt = entity.getSearchTxt() ;
      String AV20SearchTxtTo;
      AV20SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV25OptionsJson = new String[] { "" };
      String [] AV28OptionsDescJson = new String[] { "" };
      String [] AV30OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("tprdcom_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.tprdcom_wcgetfilterdata worker = new app.tprdcom_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV21DDOName,AV19SearchTxt,AV20SearchTxtTo,AV25OptionsJson,AV28OptionsDescJson,AV30OptionIndexesJson );
         app.tprdcom_wcgetfilterdata_RESTInterfaceOUT data = new app.tprdcom_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV25OptionsJson[0]);
         data.setOptionsDescJson(AV28OptionsDescJson[0]);
         data.setOptionIndexesJson(AV30OptionIndexesJson[0]);
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

