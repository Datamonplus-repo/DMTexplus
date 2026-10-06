package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdlt005", "/app.tdlt005"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdlt005 extends GXWebObjectStub
{
   public tdlt005( )
   {
   }

   public tdlt005( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdlt005.class ));
   }

   public tdlt005( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdlt005_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdlt005_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Observaciones ALBARAN";
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

