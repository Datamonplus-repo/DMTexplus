package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rens054", "/app.rens054"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rens054 extends GXWebObjectStub
{
   public rens054( )
   {
   }

   public rens054( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rens054.class ));
   }

   public rens054( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rens054_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rens054_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO TABLA GRADE";
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

