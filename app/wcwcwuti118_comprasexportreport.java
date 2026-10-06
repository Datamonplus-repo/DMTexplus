package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcwuti118_comprasexportreport", "/app.wcwcwuti118_comprasexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcwuti118_comprasexportreport extends GXWebObjectStub
{
   public wcwcwuti118_comprasexportreport( )
   {
   }

   public wcwcwuti118_comprasexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcwuti118_comprasexportreport.class ));
   }

   public wcwcwuti118_comprasexportreport( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcwuti118_comprasexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcwuti118_comprasexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWCWUti118_Compras Export Report";
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

