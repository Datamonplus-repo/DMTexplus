package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tescand", "/app.formulaciontinte.tescand"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tescand extends GXWebObjectStub
{
   public tescand( )
   {
   }

   public tescand( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tescand.class ));
   }

   public tescand( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tescand_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tescand_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SIMULACION COSTE FORMULA II";
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

