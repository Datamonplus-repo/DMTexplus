package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thdrmat", "/app.thdrmat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thdrmat extends GXWebObjectStub
{
   public thdrmat( )
   {
   }

   public thdrmat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thdrmat.class ));
   }

   public thdrmat( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thdrmat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thdrmat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MATERIALES EN HDR";
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

