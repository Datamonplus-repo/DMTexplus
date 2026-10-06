package app.albaranes ;
import app.*;
import com.genexus.servlet.*;
import com.genexus.servlet.http.*;
import java.util.*;
import com.genexus.*;
import com.genexus.Application;
import com.genexus.ws.rs.core.*;

@jakarta.ws.rs.Path("/Albaranes/AlbaranGuiaFaseLoadDVCombo")
public final  class albaranguiafaseloaddvcombo_services_rest extends GxRestService
{
   @jakarta.ws.rs.POST
   @jakarta.ws.rs.Consumes({jakarta.ws.rs.core.MediaType.APPLICATION_JSON})
   @jakarta.ws.rs.Produces({jakarta.ws.rs.core.MediaType.APPLICATION_JSON + ";charset=UTF-8"})
   public jakarta.ws.rs.core.Response execute( app.albaranes.albaranguiafaseloaddvcombo_RESTInterfaceIN entity ) throws Exception
   {
      super.init( "POST" );
      String AV12ComboName;
      AV12ComboName = entity.getComboName() ;
      String AV13TrnMode;
      AV13TrnMode = entity.getTrnMode() ;
      boolean AV25IsDynamicCall;
      AV25IsDynamicCall = entity.getIsDynamicCall() ;
      String AV14EmprCod;
      AV14EmprCod = entity.getEmprCod() ;
      long AV15AlbProCod;
      AV15AlbProCod = GXutil.lval( entity.getAlbProCod()) ;
      int AV16BarCod;
      AV16BarCod = (int)(GXutil.lval( entity.getBarCod())) ;
      byte AV17BarCodReo;
      AV17BarCodReo = entity.getBarCodReo() ;
      String AV18BarCodPar;
      AV18BarCodPar = entity.getBarCodPar() ;
      short AV19GuiFasLin;
      AV19GuiFasLin = entity.getGuiFasLin() ;
      String AV29Cond_EmprCod;
      AV29Cond_EmprCod = entity.getCond_EmprCod() ;
      int AV30Cond_CliCod;
      AV30Cond_CliCod = entity.getCond_CliCod() ;
      String AV24SearchTxt;
      AV24SearchTxt = entity.getSearchTxt() ;
      String [] AV20SelectedValue = new String[] { "" };
      String [] AV26SelectedText = new String[] { "" };
      String [] AV27Combo_DataJson = new String[] { "" };
      if ( ! processHeaders("albaranes.albaranguiafaseloaddvcombo",myServletRequestWrapper,myServletResponseWrapper) )
      {
         builder = Response.notModifiedWrapped();
         cleanup();
         return (jakarta.ws.rs.core.Response) builder.build() ;
      }
      try
      {
         app.albaranes.albaranguiafaseloaddvcombo worker = new app.albaranes.albaranguiafaseloaddvcombo(remoteHandle, context);
         worker.execute(AV12ComboName,AV13TrnMode,AV25IsDynamicCall,AV14EmprCod,AV15AlbProCod,AV16BarCod,AV17BarCodReo,AV18BarCodPar,AV19GuiFasLin,AV29Cond_EmprCod,AV30Cond_CliCod,AV24SearchTxt,AV20SelectedValue,AV26SelectedText,AV27Combo_DataJson );
         app.albaranes.albaranguiafaseloaddvcombo_RESTInterfaceOUT data = new app.albaranes.albaranguiafaseloaddvcombo_RESTInterfaceOUT();
         data.setSelectedValue(AV20SelectedValue[0]);
         data.setSelectedText(AV26SelectedText[0]);
         data.setCombo_DataJson(AV27Combo_DataJson[0]);
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

