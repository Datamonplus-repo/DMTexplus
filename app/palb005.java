package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.palb005", "/app.palb005"})
@jakarta.servlet.annotation.MultipartConfig
public final  class palb005 extends GXWebObjectStub
{
   public palb005( )
   {
   }

   public palb005( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( palb005.class ));
   }

   public palb005( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new palb005_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new palb005_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Resumen por Cliente";
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

