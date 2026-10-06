package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ptrafin", "/app.ptrafin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ptrafin extends GXWebObjectStub
{
   public ptrafin( )
   {
   }

   public ptrafin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ptrafin.class ));
   }

   public ptrafin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ptrafin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ptrafin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trabajos por Operario (Mantto)";
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

