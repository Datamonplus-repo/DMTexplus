package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticpww", "/app.tarticpww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticpww extends GXWebObjectStub
{
   public tarticpww( )
   {
   }

   public tarticpww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticpww.class ));
   }

   public tarticpww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticpww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticpww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " PROCESOS";
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

