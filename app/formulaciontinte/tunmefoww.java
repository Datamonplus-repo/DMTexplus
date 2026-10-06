package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tunmefoww", "/app.formulaciontinte.tunmefoww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tunmefoww extends GXWebObjectStub
{
   public tunmefoww( )
   {
   }

   public tunmefoww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tunmefoww.class ));
   }

   public tunmefoww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tunmefoww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tunmefoww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Unidad de Medida";
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

