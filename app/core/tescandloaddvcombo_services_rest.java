package app.core ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Core/TESCANDLoadDVCombo")
public final  class tescandloaddvcombo_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.core.tescandloaddvcombo_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV16ComboName;
      AV16ComboName = entity.getComboName() ;
      String AV18TrnMode;
      AV18TrnMode = entity.getTrnMode() ;
      boolean AV20IsDynamicCall;
      AV20IsDynamicCall = entity.getIsDynamicCall() ;
      String AV23EmprCod;
      AV23EmprCod = entity.getEmprCod() ;
      String AV24Workstat;
      AV24Workstat = entity.getWorkstat() ;
      String AV28Cond_EmprCod;
      AV28Cond_EmprCod = entity.getCond_EmprCod() ;
      String AV11SearchTxt;
      AV11SearchTxt = entity.getSearchTxt() ;
      String [] AV15SelectedValue = new String[] { "" };
      String [] AV21SelectedText = new String[] { "" };
      String [] AV12Combo_DataJson = new String[] { "" };
      if ( ! processHeaders("core.tescandloaddvcombo",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.core.tescandloaddvcombo worker = new app.core.tescandloaddvcombo(remoteHandle, context);
         worker.execute(AV16ComboName,AV18TrnMode,AV20IsDynamicCall,AV23EmprCod,AV24Workstat,AV28Cond_EmprCod,AV11SearchTxt,AV15SelectedValue,AV21SelectedText,AV12Combo_DataJson );
         app.core.tescandloaddvcombo_RESTInterfaceOUT data = new app.core.tescandloaddvcombo_RESTInterfaceOUT();
         data.setSelectedValue(AV15SelectedValue[0]);
         data.setSelectedText(AV21SelectedText[0]);
         data.setCombo_DataJson(AV12Combo_DataJson[0]);
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

