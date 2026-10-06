package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cierrerecetastinte_anyadidas", "/app.cierrerecetastinte_anyadidas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_anyadidas extends GXWebObjectStub
{
   public cierrerecetastinte_anyadidas( )
   {
   }

   public cierrerecetastinte_anyadidas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_anyadidas.class ));
   }

   public cierrerecetastinte_anyadidas( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_anyadidas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_anyadidas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cierre Recetas Tinte (Añadidas)";
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

