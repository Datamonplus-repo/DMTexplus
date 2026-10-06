package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trlicrn", "/app.trlicrn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trlicrn extends GXWebObjectStub
{
   public trlicrn( )
   {
   }

   public trlicrn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trlicrn.class ));
   }

   public trlicrn( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trlicrn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trlicrn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Registro de LicRnd";
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

