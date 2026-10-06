package app ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/NwDPFasesLoadDVCombo")
public final  class nwdpfasesloaddvcombo_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.nwdpfasesloaddvcombo_RESTInterfaceIN entity ) throws Exception
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
      int AV24DisCod;
      AV24DisCod = (int)(GXutil.lval( entity.getDisCod())) ;
      String AV25ProCod;
      AV25ProCod = entity.getProCod() ;
      String AV29Cond_EmprCod;
      AV29Cond_EmprCod = entity.getCond_EmprCod() ;
      String AV11SearchTxt;
      AV11SearchTxt = entity.getSearchTxt() ;
      String [] AV15SelectedValue = new String[] { "" };
      String [] AV21SelectedText = new String[] { "" };
      String [] AV12Combo_DataJson = new String[] { "" };
      if ( ! processHeaders("nwdpfasesloaddvcombo",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.nwdpfasesloaddvcombo worker = new app.nwdpfasesloaddvcombo(remoteHandle, context);
         worker.execute(AV16ComboName,AV18TrnMode,AV20IsDynamicCall,AV23EmprCod,AV24DisCod,AV25ProCod,AV29Cond_EmprCod,AV11SearchTxt,AV15SelectedValue,AV21SelectedText,AV12Combo_DataJson );
         app.nwdpfasesloaddvcombo_RESTInterfaceOUT data = new app.nwdpfasesloaddvcombo_RESTInterfaceOUT();
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

