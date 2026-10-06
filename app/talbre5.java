package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbre5", "/app.talbre5"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbre5 extends GXWebObjectStub
{
   public talbre5( )
   {
   }

   public talbre5( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbre5.class ));
   }

   public talbre5( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbre5_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbre5_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTRADA ALBARAN RECEPCION";
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

