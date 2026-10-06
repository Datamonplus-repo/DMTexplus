package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlcoprv", "/app.tlcoprv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlcoprv extends GXWebObjectStub
{
   public tlcoprv( )
   {
   }

   public tlcoprv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlcoprv.class ));
   }

   public tlcoprv( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlcoprv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlcoprv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos especiales";
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

