package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tens304", "/app.tens304"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tens304 extends GXWebObjectStub
{
   public tens304( )
   {
   }

   public tens304( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tens304.class ));
   }

   public tens304( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tens304_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tens304_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ensayos con Colorantes y Productos";
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

