package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cierrerecetastinte_3_anyadidas", "/app.formulaciontinte.cierrerecetastinte_3_anyadidas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_3_anyadidas extends GXWebObjectStub
{
   public cierrerecetastinte_3_anyadidas( )
   {
   }

   public cierrerecetastinte_3_anyadidas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_3_anyadidas.class ));
   }

   public cierrerecetastinte_3_anyadidas( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_3_anyadidas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_3_anyadidas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento de Productos (Receta)";
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

