package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.hishra", "/app.hishra"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hishra extends GXWebObjectStub
{
   public hishra( )
   {
   }

   public hishra( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hishra.class ));
   }

   public hishra( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hishra_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hishra_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla HISHRA";
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

