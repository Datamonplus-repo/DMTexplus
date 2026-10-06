package app.anticipacionerrores ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/AnticipacionErrores/MAnt_FiltradoGetFilterData")
public final  class mant_filtradogetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.anticipacionerrores.mant_filtradogetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV54DDOName;
      AV54DDOName = entity.getDDOName() ;
      String AV55SearchTxt;
      AV55SearchTxt = entity.getSearchTxt() ;
      String AV56SearchTxtTo;
      AV56SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV57OptionsJson = new String[] { "" };
      String [] AV58OptionsDescJson = new String[] { "" };
      String [] AV59OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("anticipacionerrores.mant_filtradogetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.anticipacionerrores.mant_filtradogetfilterdata worker = new app.anticipacionerrores.mant_filtradogetfilterdata(remoteHandle, context);
         worker.execute(AV54DDOName,AV55SearchTxt,AV56SearchTxtTo,AV57OptionsJson,AV58OptionsDescJson,AV59OptionIndexesJson );
         app.anticipacionerrores.mant_filtradogetfilterdata_RESTInterfaceOUT data = new app.anticipacionerrores.mant_filtradogetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV57OptionsJson[0]);
         data.setOptionsDescJson(AV58OptionsDescJson[0]);
         data.setOptionIndexesJson(AV59OptionIndexesJson[0]);
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

