package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tprocesprompt", "/app.ficherosbasicos.tprocesprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprocesprompt extends GXWebObjectStub
{
   public tprocesprompt( )
   {
   }

   public tprocesprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprocesprompt.class ));
   }

   public tprocesprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprocesprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprocesprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona PROCESOS DE PRODUCCION";
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

