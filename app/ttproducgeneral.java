package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttproducgeneral", "/app.ttproducgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttproducgeneral extends GXWebObjectStub
{
   public ttproducgeneral( )
   {
   }

   public ttproducgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttproducgeneral.class ));
   }

   public ttproducgeneral( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttproducgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttproducgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTproduc General";
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

