package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultadocumentoscomerciales", "/app.consultadocumentoscomerciales"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadocumentoscomerciales extends GXWebObjectStub
{
   public consultadocumentoscomerciales( )
   {
   }

   public consultadocumentoscomerciales( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadocumentoscomerciales.class ));
   }

   public consultadocumentoscomerciales( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadocumentoscomerciales_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadocumentoscomerciales_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Documentos Comerciales";
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

