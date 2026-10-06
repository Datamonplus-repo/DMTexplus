package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.cierrerecetastinte_anyadidas_1", "/app.formulaciontinte.cierrerecetastinte_anyadidas_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_anyadidas_1 extends GXWebObjectStub
{
   public cierrerecetastinte_anyadidas_1( )
   {
   }

   public cierrerecetastinte_anyadidas_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_anyadidas_1.class ));
   }

   public cierrerecetastinte_anyadidas_1( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_anyadidas_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_anyadidas_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Relacion de Productos Quimicos";
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

