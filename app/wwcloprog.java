package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwcloprog", "/app.wwcloprog"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwcloprog extends GXWebObjectStub
{
   public wwcloprog( )
   {
   }

   public wwcloprog( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwcloprog.class ));
   }

   public wwcloprog( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwcloprog_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwcloprog_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DUPLICAR PROCESOS PROD. GENERAL";
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

