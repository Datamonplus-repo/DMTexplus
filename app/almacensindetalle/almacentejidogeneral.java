package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.almacentejidogeneral", "/app.almacensindetalle.almacentejidogeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidogeneral extends GXWebObjectStub
{
   public almacentejidogeneral( )
   {
   }

   public almacentejidogeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidogeneral.class ));
   }

   public almacentejidogeneral( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidogeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidogeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejido General";
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

