package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cierrerecetastinte_numerodeanyadidas", "/app.formulaciontinte.cierrerecetastinte_numerodeanyadidas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_numerodeanyadidas extends GXWebObjectStub
{
   public cierrerecetastinte_numerodeanyadidas( )
   {
   }

   public cierrerecetastinte_numerodeanyadidas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_numerodeanyadidas.class ));
   }

   public cierrerecetastinte_numerodeanyadidas( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_numerodeanyadidas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_numerodeanyadidas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cierre Recetas Tinte (Numero de Anyadidas)";
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

