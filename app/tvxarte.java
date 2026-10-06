package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxarte", "/app.tvxarte"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxarte extends GXWebObjectStub
{
   public tvxarte( )
   {
   }

   public tvxarte( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxarte.class ));
   }

   public tvxarte( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxarte_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxarte_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla ARTECRU en VERTEX";
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

