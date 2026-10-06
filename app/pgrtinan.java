package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pgrtinan", "/app.pgrtinan"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pgrtinan extends GXWebObjectStub
{
   public pgrtinan( )
   {
   }

   public pgrtinan( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pgrtinan.class ));
   }

   public pgrtinan( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pgrtinan_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pgrtinan_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "GUIA REMESSA, NO VALORADA";
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

