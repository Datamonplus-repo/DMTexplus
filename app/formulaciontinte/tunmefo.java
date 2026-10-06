package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tunmefo", "/app.formulaciontinte.tunmefo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tunmefo extends GXWebObjectStub
{
   public tunmefo( )
   {
   }

   public tunmefo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tunmefo.class ));
   }

   public tunmefo( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tunmefo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tunmefo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Unidad de Medida";
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

