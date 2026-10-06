package app.albaranes ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Albaranes/AlbaranLoadDVCombo")
public final  class albaranloaddvcombo_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.albaranes.albaranloaddvcombo_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV12ComboName;
      AV12ComboName = entity.getComboName() ;
      String AV13TrnMode;
      AV13TrnMode = entity.getTrnMode() ;
      boolean AV21IsDynamicCall;
      AV21IsDynamicCall = entity.getIsDynamicCall() ;
      String AV14EmprCod;
      AV14EmprCod = entity.getEmprCod() ;
      long AV15AlbProCod;
      AV15AlbProCod = GXutil.lval( entity.getAlbProCod()) ;
      String AV26Cond_EmprCod;
      AV26Cond_EmprCod = entity.getCond_EmprCod() ;
      int AV25Cond_GuiRemCli;
      AV25Cond_GuiRemCli = entity.getCond_GuiRemCli() ;
      String AV20SearchTxt;
      AV20SearchTxt = entity.getSearchTxt() ;
      String [] AV16SelectedValue = new String[] { "" };
      String [] AV22SelectedText = new String[] { "" };
      String [] AV23Combo_DataJson = new String[] { "" };
      if ( ! processHeaders("albaranes.albaranloaddvcombo",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.albaranes.albaranloaddvcombo worker = new app.albaranes.albaranloaddvcombo(remoteHandle, context);
         worker.execute(AV12ComboName,AV13TrnMode,AV21IsDynamicCall,AV14EmprCod,AV15AlbProCod,AV26Cond_EmprCod,AV25Cond_GuiRemCli,AV20SearchTxt,AV16SelectedValue,AV22SelectedText,AV23Combo_DataJson );
         app.albaranes.albaranloaddvcombo_RESTInterfaceOUT data = new app.albaranes.albaranloaddvcombo_RESTInterfaceOUT();
         data.setSelectedValue(AV16SelectedValue[0]);
         data.setSelectedText(AV22SelectedText[0]);
         data.setCombo_DataJson(AV23Combo_DataJson[0]);
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

