package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcrepuestosexportcsv", "/app.wcrepuestosexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrepuestosexportcsv extends GXWebObjectStub
{
   public wcrepuestosexportcsv( )
   {
   }

   public wcrepuestosexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrepuestosexportcsv.class ));
   }

   public wcrepuestosexportcsv( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrepuestosexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrepuestosexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCRepuestos Export CSV";
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

