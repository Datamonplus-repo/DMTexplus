package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tctat", "/app.tctat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tctat extends GXWebObjectStub
{
   public tctat( )
   {
   }

   public tctat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tctat.class ));
   }

   public tctat( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tctat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tctat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " CONTROL ARTICULO CLIENTE";
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

