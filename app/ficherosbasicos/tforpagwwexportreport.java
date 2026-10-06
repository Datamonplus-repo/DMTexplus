package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tforpagwwexportreport", "/app.ficherosbasicos.tforpagwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforpagwwexportreport extends GXWebObjectStub
{
   public tforpagwwexportreport( )
   {
   }

   public tforpagwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforpagwwexportreport.class ));
   }

   public tforpagwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforpagwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforpagwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Formas de Pago";
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

