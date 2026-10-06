package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.maqfas", "/app.maqfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class maqfas extends GXWebObjectStub
{
   public maqfas( )
   {
   }

   public maqfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( maqfas.class ));
   }

   public maqfas( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new maqfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new maqfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla MAQFAS";
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

