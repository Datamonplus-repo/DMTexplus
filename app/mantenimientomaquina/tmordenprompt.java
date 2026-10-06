package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmordenprompt", "/app.mantenimientomaquina.tmordenprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordenprompt extends GXWebObjectStub
{
   public tmordenprompt( )
   {
   }

   public tmordenprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordenprompt.class ));
   }

   public tmordenprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordenprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordenprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Ordenes de Mantenimiento";
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

