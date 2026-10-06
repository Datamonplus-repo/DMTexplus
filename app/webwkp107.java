package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwkp107", "/app.webwkp107"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwkp107 extends GXWebObjectStub
{
   public webwkp107( )
   {
   }

   public webwkp107( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwkp107.class ));
   }

   public webwkp107( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwkp107_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwkp107_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Planificacion TINTE";
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

