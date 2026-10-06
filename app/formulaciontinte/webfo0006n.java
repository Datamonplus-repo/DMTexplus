package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.webfo0006n", "/app.formulaciontinte.webfo0006n"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webfo0006n extends GXWebObjectStub
{
   public webfo0006n( )
   {
   }

   public webfo0006n( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webfo0006n.class ));
   }

   public webfo0006n( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webfo0006n_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webfo0006n_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Simulacion Formula";
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

