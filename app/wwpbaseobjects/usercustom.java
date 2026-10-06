package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwpbaseobjects.usercustom", "/app.wwpbaseobjects.usercustom"})
@jakarta.servlet.annotation.MultipartConfig
public final  class usercustom extends GXWebObjectStub
{
   public usercustom( )
   {
   }

   public usercustom( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( usercustom.class ));
   }

   public usercustom( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new usercustom_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new usercustom_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "User Custom";
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

