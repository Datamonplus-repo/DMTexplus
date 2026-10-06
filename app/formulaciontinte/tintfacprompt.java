package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintfacprompt", "/app.formulaciontinte.tintfacprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintfacprompt extends GXWebObjectStub
{
   public tintfacprompt( )
   {
   }

   public tintfacprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintfacprompt.class ));
   }

   public tintfacprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintfacprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintfacprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Intensidad Facturacion / Plannificacion";
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

