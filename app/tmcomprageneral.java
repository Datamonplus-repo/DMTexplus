package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmcomprageneral", "/app.tmcomprageneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmcomprageneral extends GXWebObjectStub
{
   public tmcomprageneral( )
   {
   }

   public tmcomprageneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmcomprageneral.class ));
   }

   public tmcomprageneral( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmcomprageneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmcomprageneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMCompra General";
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

