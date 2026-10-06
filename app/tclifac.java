package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclifac", "/app.tclifac"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclifac extends GXWebObjectStub
{
   public tclifac( )
   {
   }

   public tclifac( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclifac.class ));
   }

   public tclifac( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclifac_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclifac_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLIENTE A FACTURAR";
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

