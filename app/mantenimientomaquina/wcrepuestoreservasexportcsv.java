package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.wcrepuestoreservasexportcsv", "/app.mantenimientomaquina.wcrepuestoreservasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrepuestoreservasexportcsv extends GXWebObjectStub
{
   public wcrepuestoreservasexportcsv( )
   {
   }

   public wcrepuestoreservasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrepuestoreservasexportcsv.class ));
   }

   public wcrepuestoreservasexportcsv( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrepuestoreservasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrepuestoreservasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCRepuesto Reservas Export CSV";
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

