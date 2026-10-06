package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmpreveresponsableswc", "/app.mantenimientomaquina.tmpreveresponsableswc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmpreveresponsableswc extends GXWebObjectStub
{
   public tmpreveresponsableswc( )
   {
   }

   public tmpreveresponsableswc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmpreveresponsableswc.class ));
   }

   public tmpreveresponsableswc( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmpreveresponsableswc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmpreveresponsableswc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMPreve Responsables WC";
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

