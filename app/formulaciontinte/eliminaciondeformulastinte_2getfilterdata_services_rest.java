package app.formulaciontinte ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/FormulacionTinte/EliminaciondeFormulasTinte_2GetFilterData")
public final  class eliminaciondeformulastinte_2getfilterdata_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.formulaciontinte.eliminaciondeformulastinte_2getfilterdata_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV25DDOName;
      AV25DDOName = entity.getDDOName() ;
      String AV26SearchTxt;
      AV26SearchTxt = entity.getSearchTxt() ;
      String AV27SearchTxtTo;
      AV27SearchTxtTo = entity.getSearchTxtTo() ;
      String [] AV28OptionsJson = new String[] { "" };
      String [] AV29OptionsDescJson = new String[] { "" };
      String [] AV30OptionIndexesJson = new String[] { "" };
      if ( ! processHeaders("formulaciontinte.eliminaciondeformulastinte_2getfilterdata",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.formulaciontinte.eliminaciondeformulastinte_2getfilterdata worker = new app.formulaciontinte.eliminaciondeformulastinte_2getfilterdata(remoteHandle, context);
         worker.execute(AV25DDOName,AV26SearchTxt,AV27SearchTxtTo,AV28OptionsJson,AV29OptionsDescJson,AV30OptionIndexesJson );
         app.formulaciontinte.eliminaciondeformulastinte_2getfilterdata_RESTInterfaceOUT data = new app.formulaciontinte.eliminaciondeformulastinte_2getfilterdata_RESTInterfaceOUT();
         data.setOptionsJson(AV28OptionsJson[0]);
         data.setOptionsDescJson(AV29OptionsDescJson[0]);
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

