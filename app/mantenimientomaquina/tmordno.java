package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmordno", "/app.mantenimientomaquina.tmordno"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordno extends GXWebObjectStub
{
   public tmordno( )
   {
   }

   public tmordno( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordno.class ));
   }

   public tmordno( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordno_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordno_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Notas Orden De Trabajo";
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

