package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbccomp", "/app.tbccomp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbccomp extends GXWebObjectStub
{
   public tbccomp( )
   {
   }

   public tbccomp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbccomp.class ));
   }

   public tbccomp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbccomp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbccomp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Compras Recepcion envio";
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

