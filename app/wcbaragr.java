package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcbaragr", "/app.wcbaragr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcbaragr extends GXWebObjectStub
{
   public wcbaragr( )
   {
   }

   public wcbaragr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcbaragr.class ));
   }

   public wcbaragr( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcbaragr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcbaragr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " HDRAGRUPADAS";
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

