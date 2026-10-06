package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tartcc", "/app.tartcc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tartcc extends GXWebObjectStub
{
   public tartcc( )
   {
   }

   public tartcc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tartcc.class ));
   }

   public tartcc( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tartcc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tartcc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Articulos Cuaderno Encargos CC";
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

