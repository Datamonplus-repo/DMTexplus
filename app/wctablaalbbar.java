package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wctablaalbbar", "/app.wctablaalbbar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wctablaalbbar extends GXWebObjectStub
{
   public wctablaalbbar( )
   {
   }

   public wctablaalbbar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wctablaalbbar.class ));
   }

   public wctablaalbbar( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wctablaalbbar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wctablaalbbar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Guias (Detail HDRs)";
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

