package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt002general", "/app.ficherosbasicos.tnxt002general"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt002general extends GXWebObjectStub
{
   public tnxt002general( )
   {
   }

   public tnxt002general( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt002general.class ));
   }

   public tnxt002general( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt002general_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt002general_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNXT002 General";
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

