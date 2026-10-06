package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordmc", "/app.tmordmc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordmc extends GXWebObjectStub
{
   public tmordmc( )
   {
   }

   public tmordmc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordmc.class ));
   }

   public tmordmc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordmc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordmc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Con Mano de Obra Orden Trabajo";
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

