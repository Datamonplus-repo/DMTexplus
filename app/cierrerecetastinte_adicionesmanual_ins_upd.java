package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cierrerecetastinte_adicionesmanual_ins_upd", "/app.cierrerecetastinte_adicionesmanual_ins_upd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_adicionesmanual_ins_upd extends GXWebObjectStub
{
   public cierrerecetastinte_adicionesmanual_ins_upd( )
   {
   }

   public cierrerecetastinte_adicionesmanual_ins_upd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_adicionesmanual_ins_upd.class ));
   }

   public cierrerecetastinte_adicionesmanual_ins_upd( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_adicionesmanual_ins_upd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_adicionesmanual_ins_upd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cierre Recetas Tinte_Adiciones Manual (Ins_Upd)";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

