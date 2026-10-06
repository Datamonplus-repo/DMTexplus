package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rem0005", "/app.rem0005"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rem0005 extends GXWebObjectStub
{
   public rem0005( )
   {
   }

   public rem0005( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rem0005.class ));
   }

   public rem0005( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rem0005_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rem0005_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DISTRIBUCION DE UNIDADES P/HDR";
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

