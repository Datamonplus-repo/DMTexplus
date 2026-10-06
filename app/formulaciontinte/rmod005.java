package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.rmod005", "/app.formulaciontinte.rmod005"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmod005 extends GXWebObjectStub
{
   public rmod005( )
   {
   }

   public rmod005( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmod005.class ));
   }

   public rmod005( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmod005_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmod005_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FICHA COLOR";
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

