package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tclimat", "/app.formulaciontinte.tclimat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclimat extends GXWebObjectStub
{
   public tclimat( )
   {
   }

   public tclimat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclimat.class ));
   }

   public tclimat( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclimat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclimat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Numeracion Color en funcion Cliente y Matiz";
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

