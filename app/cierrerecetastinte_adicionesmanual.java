package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cierrerecetastinte_adicionesmanual", "/app.cierrerecetastinte_adicionesmanual"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cierrerecetastinte_adicionesmanual extends GXWebObjectStub
{
   public cierrerecetastinte_adicionesmanual( )
   {
   }

   public cierrerecetastinte_adicionesmanual( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cierrerecetastinte_adicionesmanual.class ));
   }

   public cierrerecetastinte_adicionesmanual( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cierrerecetastinte_adicionesmanual_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cierrerecetastinte_adicionesmanual_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos añadidos o Pesados";
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

