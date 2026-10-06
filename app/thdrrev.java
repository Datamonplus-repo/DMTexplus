package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thdrrev", "/app.thdrrev"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thdrrev extends GXWebObjectStub
{
   public thdrrev( )
   {
   }

   public thdrrev( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thdrrev.class ));
   }

   public thdrrev( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thdrrev_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thdrrev_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTRADA CODIGOS REVISTA";
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

