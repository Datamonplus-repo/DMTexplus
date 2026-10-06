package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.wcrepuestoreservasexportreport", "/app.mantenimientomaquina.wcrepuestoreservasexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrepuestoreservasexportreport extends GXWebObjectStub
{
   public wcrepuestoreservasexportreport( )
   {
   }

   public wcrepuestoreservasexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrepuestoreservasexportreport.class ));
   }

   public wcrepuestoreservasexportreport( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrepuestoreservasexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrepuestoreservasexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista Reserva de Repuestos";
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

