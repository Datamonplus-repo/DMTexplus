package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.abonoscargos", "/app.facturacion.abonoscargos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class abonoscargos extends GXWebObjectStub
{
   public abonoscargos( )
   {
   }

   public abonoscargos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( abonoscargos.class ));
   }

   public abonoscargos( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new abonoscargos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new abonoscargos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Abonos / Cargos";
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

