package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.topbchd", "/app.topbchd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class topbchd extends GXWebObjectStub
{
   public topbchd( )
   {
   }

   public topbchd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( topbchd.class ));
   }

   public topbchd( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new topbchd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new topbchd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OP de EKAMAT";
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

