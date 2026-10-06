package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcrepuestosexportreport", "/app.wcrepuestosexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrepuestosexportreport extends GXWebObjectStub
{
   public wcrepuestosexportreport( )
   {
   }

   public wcrepuestosexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrepuestosexportreport.class ));
   }

   public wcrepuestosexportreport( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrepuestosexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrepuestosexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista de Repuestos en Mov. de Stock";
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

