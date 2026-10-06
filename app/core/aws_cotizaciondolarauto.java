package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.core.aws_cotizaciondolarauto", "/app.core.aws_cotizaciondolarauto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aws_cotizaciondolarauto extends GXWebObjectStub
{
   public aws_cotizaciondolarauto( )
   {
   }

   public aws_cotizaciondolarauto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aws_cotizaciondolarauto.class ));
   }

   public aws_cotizaciondolarauto( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aws_cotizaciondolarauto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aws_cotizaciondolarauto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Aplicación para configurar como Demonio en Server";
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

