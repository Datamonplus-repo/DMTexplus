package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpncyrc", "/app.wpncyrc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpncyrc extends GXWebObjectStub
{
   public wpncyrc( )
   {
   }

   public wpncyrc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpncyrc.class ));
   }

   public wpncyrc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpncyrc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpncyrc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " HISTORICO REOPERADOS";
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

