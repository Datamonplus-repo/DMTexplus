package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.wcrepuestoreservas", "/app.mantenimientomaquina.wcrepuestoreservas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrepuestoreservas extends GXWebObjectStub
{
   public wcrepuestoreservas( )
   {
   }

   public wcrepuestoreservas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrepuestoreservas.class ));
   }

   public wcrepuestoreservas( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrepuestoreservas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrepuestoreservas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla MRERES (Reserva de Repuestos)";
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

