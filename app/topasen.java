package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.topasen", "/app.topasen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class topasen extends GXWebObjectStub
{
   public topasen( )
   {
   }

   public topasen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( topasen.class ));
   }

   public topasen( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new topasen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new topasen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OPERACION ASEGURA EN";
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

