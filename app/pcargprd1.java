package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pcargprd1", "/app.pcargprd1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pcargprd1 extends GXWebObjectStub
{
   public pcargprd1( )
   {
   }

   public pcargprd1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pcargprd1.class ));
   }

   public pcargprd1( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pcargprd1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pcargprd1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Produccion por Proceso";
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

