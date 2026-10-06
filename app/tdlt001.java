package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdlt001", "/app.tdlt001"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdlt001 extends GXWebObjectStub
{
   public tdlt001( )
   {
   }

   public tdlt001( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdlt001.class ));
   }

   public tdlt001( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdlt001_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdlt001_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Hdrs Albaran";
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

