package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmpreverepuestoswc", "/app.mantenimientomaquina.tmpreverepuestoswc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmpreverepuestoswc extends GXWebObjectStub
{
   public tmpreverepuestoswc( )
   {
   }

   public tmpreverepuestoswc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmpreverepuestoswc.class ));
   }

   public tmpreverepuestoswc( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmpreverepuestoswc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmpreverepuestoswc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMPreve Repuestos WC";
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

