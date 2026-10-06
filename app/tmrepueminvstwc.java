package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmrepueminvstwc", "/app.tmrepueminvstwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrepueminvstwc extends GXWebObjectStub
{
   public tmrepueminvstwc( )
   {
   }

   public tmrepueminvstwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrepueminvstwc.class ));
   }

   public tmrepueminvstwc( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrepueminvstwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrepueminvstwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMRepue MInv St WC";
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

