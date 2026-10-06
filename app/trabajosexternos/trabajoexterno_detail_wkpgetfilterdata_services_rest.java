package app.trabajosexternos ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/TrabajosExternos/TrabajoExterno_Detail_WKPGetFilterData")
public final  class trabajoexterno_detail_wkpgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.trabajosexternos.trabajoexterno_detail_wkpgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV50DDOName;
      AV50DDOName = entity.getDDOName() ;
      String AV51SearchTxt;
      AV51SearchTxt = entity.getSearchTxt() ;
      String AV52SearchTxtTo;
      AV52SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV53OptionsJson = new String[] { "" };
      String [] AV54OptionsDescJson = new String[] { "" };
      String [] AV55OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("trabajosexternos.trabajoexterno_detail_wkpgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.trabajosexternos.trabajoexterno_detail_wkpgetfilterdata worker = new app.trabajosexternos.trabajoexterno_detail_wkpgetfilterdata(remoteHandle, context);
         worker.execute(AV50DDOName,AV51SearchTxt,AV52SearchTxtTo,AV53OptionsJson,AV54OptionsDescJson,AV55OptionIndexesJson );
         app.trabajosexternos.trabajoexterno_detail_wkpgetfilterdata_RESTInterfaceOUT data = new app.trabajosexternos.trabajoexterno_detail_wkpgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV53OptionsJson[0]);
         data.setOptionsDescJson(AV54OptionsDescJson[0]);
         data.setOptionIndexesJson(AV55OptionIndexesJson[0]);
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

