package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tendt00", "/app.tendt00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tendt00 extends GXWebObjectStub
{
   public tendt00( )
   {
   }

   public tendt00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tendt00.class ));
   }

   public tendt00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tendt00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tendt00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Importacion Productos DATACOLOR";
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

