package app.formulaciontinte ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FormulacionTinte/ProcesoQuimico_3GetFilterData")
public final  class procesoquimico_3getfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.formulaciontinte.procesoquimico_3getfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV42DDOName;
      AV42DDOName = entity.getDDOName() ;
      String AV43SearchTxt;
      AV43SearchTxt = entity.getSearchTxt() ;
      String AV44SearchTxtTo;
      AV44SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV45OptionsJson = new String[] { "" };
      String [] AV46OptionsDescJson = new String[] { "" };
      String [] AV47OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("formulaciontinte.procesoquimico_3getfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.formulaciontinte.procesoquimico_3getfilterdata worker = new app.formulaciontinte.procesoquimico_3getfilterdata(remoteHandle, context);
         worker.execute(AV42DDOName,AV43SearchTxt,AV44SearchTxtTo,AV45OptionsJson,AV46OptionsDescJson,AV47OptionIndexesJson );
         app.formulaciontinte.procesoquimico_3getfilterdata_RESTInterfaceOUT data = new app.formulaciontinte.procesoquimico_3getfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV45OptionsJson[0]);
         data.setOptionsDescJson(AV46OptionsDescJson[0]);
         data.setOptionIndexesJson(AV47OptionIndexesJson[0]);
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

