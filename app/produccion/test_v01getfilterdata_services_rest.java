package app.produccion ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Produccion/Test_v01GetFilterData")
public final  class test_v01getfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.produccion.test_v01getfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV41DDOName;
      AV41DDOName = entity.getDDOName() ;
      String AV42SearchTxt;
      AV42SearchTxt = entity.getSearchTxt() ;
      String AV43SearchTxtTo;
      AV43SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV44OptionsJson = new String[] { "" };
      String [] AV45OptionsDescJson = new String[] { "" };
      String [] AV46OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("produccion.test_v01getfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.produccion.test_v01getfilterdata worker = new app.produccion.test_v01getfilterdata(remoteHandle, context);
         worker.execute(AV41DDOName,AV42SearchTxt,AV43SearchTxtTo,AV44OptionsJson,AV45OptionsDescJson,AV46OptionIndexesJson );
         app.produccion.test_v01getfilterdata_RESTInterfaceOUT data = new app.produccion.test_v01getfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV44OptionsJson[0]);
         data.setOptionsDescJson(AV45OptionsDescJson[0]);
         data.setOptionIndexesJson(AV46OptionIndexesJson[0]);
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

