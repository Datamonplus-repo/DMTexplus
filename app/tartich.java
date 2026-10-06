package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tartich", "/app.tartich"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tartich extends GXWebObjectStub
{
   public tartich( )
   {
   }

   public tartich( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tartich.class ));
   }

   public tartich( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tartich_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tartich_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MANTENIMIENTO DE ARTICULOS";
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

