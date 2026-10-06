package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmacart", "/app.tmacart"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmacart extends GXWebObjectStub
{
   public tmacart( )
   {
   }

   public tmacart( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmacart.class ));
   }

   public tmacart( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmacart_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmacart_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MACROS PARA ARTICULOS";
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

