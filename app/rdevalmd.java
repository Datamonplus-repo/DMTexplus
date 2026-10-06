package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rdevalmd", "/app.rdevalmd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rdevalmd extends GXWebObjectStub
{
   public rdevalmd( )
   {
   }

   public rdevalmd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rdevalmd.class ));
   }

   public rdevalmd( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rdevalmd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rdevalmd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NOTA DEVOLUCION, PRODUCTO";
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

