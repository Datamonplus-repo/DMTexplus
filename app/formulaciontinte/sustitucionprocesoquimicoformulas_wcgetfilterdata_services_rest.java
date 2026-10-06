package app.formulaciontinte ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FormulacionTinte/SustitucionProcesoQuimicoFormulas_WCGetFilterData")
public final  class sustitucionprocesoquimicoformulas_wcgetfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.formulaciontinte.sustitucionprocesoquimicoformulas_wcgetfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV43DDOName;
      AV43DDOName = entity.getDDOName() ;
      String AV41SearchTxt;
      AV41SearchTxt = entity.getSearchTxt() ;
      String AV42SearchTxtTo;
      AV42SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV47OptionsJson = new String[] { "" };
      String [] AV50OptionsDescJson = new String[] { "" };
      String [] AV52OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("formulaciontinte.sustitucionprocesoquimicoformulas_wcgetfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.formulaciontinte.sustitucionprocesoquimicoformulas_wcgetfilterdata worker = new app.formulaciontinte.sustitucionprocesoquimicoformulas_wcgetfilterdata(remoteHandle, context);
         worker.execute(AV43DDOName,AV41SearchTxt,AV42SearchTxtTo,AV47OptionsJson,AV50OptionsDescJson,AV52OptionIndexesJson );
         app.formulaciontinte.sustitucionprocesoquimicoformulas_wcgetfilterdata_RESTInterfaceOUT data = new app.formulaciontinte.sustitucionprocesoquimicoformulas_wcgetfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV47OptionsJson[0]);
         data.setOptionsDescJson(AV50OptionsDescJson[0]);
         data.setOptionIndexesJson(AV52OptionIndexesJson[0]);
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

