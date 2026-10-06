package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdigbar", "/app.tdigbar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdigbar extends GXWebObjectStub
{
   public tdigbar( )
   {
   }

   public tdigbar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdigbar.class ));
   }

   public tdigbar( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdigbar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdigbar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DIBUJOS y COMINACIONES DIGITAL";
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

