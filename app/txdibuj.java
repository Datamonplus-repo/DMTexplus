package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.txdibuj", "/app.txdibuj"})
@jakarta.servlet.annotation.MultipartConfig
public final  class txdibuj extends GXWebObjectStub
{
   public txdibuj( )
   {
   }

   public txdibuj( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( txdibuj.class ));
   }

   public txdibuj( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new txdibuj_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new txdibuj_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "XDIBUJ";
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

