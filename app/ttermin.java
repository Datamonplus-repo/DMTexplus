package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttermin", "/app.ttermin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttermin extends GXWebObjectStub
{
   public ttermin( )
   {
   }

   public ttermin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttermin.class ));
   }

   public ttermin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttermin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttermin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TERMINALES";
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

