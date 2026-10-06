package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.baragr", "/app.baragr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class baragr extends GXWebObjectStub
{
   public baragr( )
   {
   }

   public baragr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( baragr.class ));
   }

   public baragr( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new baragr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new baragr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "BARAGR";
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

