package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.ensayospendientes_wc", "/app.gestionlaboratorio.ensayospendientes_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ensayospendientes_wc extends GXWebObjectStub
{
   public ensayospendientes_wc( )
   {
   }

   public ensayospendientes_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ensayospendientes_wc.class ));
   }

   public ensayospendientes_wc( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ensayospendientes_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ensayospendientes_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ensayos Pendientes";
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

