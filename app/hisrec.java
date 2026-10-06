package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.hisrec", "/app.hisrec"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hisrec extends GXWebObjectStub
{
   public hisrec( )
   {
   }

   public hisrec( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hisrec.class ));
   }

   public hisrec( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hisrec_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hisrec_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla HISREC";
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

