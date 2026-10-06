package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tobsrec", "/app.tobsrec"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tobsrec extends GXWebObjectStub
{
   public tobsrec( )
   {
   }

   public tobsrec( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tobsrec.class ));
   }

   public tobsrec( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tobsrec_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tobsrec_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "OBSERVACIONES RECETA";
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

